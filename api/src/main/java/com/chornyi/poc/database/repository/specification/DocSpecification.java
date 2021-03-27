package com.chornyi.poc.database.repository.specification;

import com.chornyi.poc.database.domain.Doc;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import static org.apache.commons.lang3.StringUtils.isBlank;
import static org.springframework.data.jpa.domain.Specification.where;

@Component
public class DocSpecification extends BaseSpecification<Doc, String> {

    @Override
    public Specification<Doc> getFilter(String request) {
        return (root, query, cb) -> {
            query.distinct(true);
            return where(
                    where(attributeContains("docClass", request))
                            .or(attributeContains("type", request))
                            .or(attributeContains("priority", request))
                            .or(attributeContains("outputType", request))
                            .or(attributeContains("docUsage", request))
                    )
                    .toPredicate(root, query, cb);
        };
    }
    
    private Specification<Doc> attributeContains(String attribute, String value) {
        return (root, query, cb) -> {
            if (isBlank(value)) {
                return null;
            }
            return cb.like(
                    cb.lower(root.get(attribute)),
                    containsLowerCase(value)
            );
        };
    }
}
