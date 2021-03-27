package com.chornyi.poc.database.query;

import com.chornyi.poc.database.domain.Doc;
import com.chornyi.poc.database.query.dto.Docs;
import com.chornyi.poc.database.repository.DocRepository;
import com.chornyi.poc.database.repository.specification.DocSpecification;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

@Service
@Slf4j
public class DocQuery extends Query {

    @Autowired
    private DocRepository docRepository;

    @Autowired
    private DocSpecification docSpecification;

    public Docs getDocs(int pageNumber, int pageSize, String sortBy, String direction, String filter) {
        String validationErrors = validatePaginationParams(pageNumber, pageSize);
        if (isNotBlank(validationErrors)) {
            throw new IllegalArgumentException(validationErrors);
        }

        Pageable pageable = PageRequest.of(pageNumber, pageSize,  getSort(sortBy, direction));
        Specification<Doc> specification = docSpecification.getFilter(filter);
        Page<Doc> page = docRepository.findAll(specification, pageable);
        return new Docs(page.getContent(), docRepository.count(specification), page.getSize());
    }

}
