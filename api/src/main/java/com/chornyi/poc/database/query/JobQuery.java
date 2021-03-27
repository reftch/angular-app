package com.chornyi.poc.database.query;

import com.chornyi.poc.database.domain.Job;
import com.chornyi.poc.database.query.dto.Jobs;
import com.chornyi.poc.database.repository.JobRepository;
import com.chornyi.poc.database.repository.specification.JobSpecification;
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
public class JobQuery extends Query {

    @Autowired
    private JobRepository repository;

    @Autowired
    private JobSpecification jobSpecification;

    public Jobs getJobs(int pageNumber, int pageSize, String sortBy, String direction, String filter) {
        String validationErrors = validatePaginationParams(pageNumber, pageSize);
        if (isNotBlank(validationErrors)) {
            throw new IllegalArgumentException(validationErrors);
        }

        Pageable pageable = PageRequest.of(pageNumber, pageSize, getSort(sortBy, direction));
        Specification<Job> specification = jobSpecification.getFilter(filter);
        Page<Job> page = repository.findAll(specification, pageable);
        return new Jobs(page.getContent(), repository.count(specification), page.getSize());
    }

}
