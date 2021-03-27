package com.chornyi.poc.database.query;

import com.chornyi.poc.database.domain.Doc;
import com.chornyi.poc.database.query.dto.Docs;
import com.chornyi.poc.database.repository.DocRepository;
import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

public class DocResolver implements GraphQLResolver<Docs> {

    @Autowired
    private DocRepository repository;

    public Docs findAll(int offset, int limit) {
        Pageable pageable = PageRequest.of(offset, limit);
        Page<Doc> page = repository.findAll(pageable);
        return new Docs(page.getContent(), repository.count(), page.getSize());
    }

}
