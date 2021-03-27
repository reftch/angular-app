package com.chornyi.poc.database.repository.specification;

import com.chornyi.poc.database.domain.Job;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import java.util.Date;

import static org.apache.commons.lang3.StringUtils.isBlank;
import static org.springframework.data.jpa.domain.Specification.where;

@Component
public class JobSpecification extends BaseSpecification<Job, String> {

    @Override
    public Specification<Job> getFilter(String request) {
        return (root, query, cb) -> {
            query.distinct(true);
            return where(
                    where(jobAttributeContains("processId", request))
                            .or(jobAttributeContains("jobClassId", request))
                            .or(jobAttributeContains("state", request))
                            .or(jobAttributeContains("numPages", request))
                            .or(jobAttributeContains("numSheets", request))
                            .or(jobAttributeContains("numDocuments", request))
                            //.or(jobAttributeContains("creationDate", request))
                    )
                    .toPredicate(root, query, cb);
        };
    }
    
    private Specification<Job> jobAttributeContains(String attribute, String value) {
        return (root, query, cb) -> {
            if (isBlank(value)) {
                return null;
            }

            if (root.get(attribute).getJavaType().getCanonicalName().equals("java.lang.Integer")) {
                Integer v = getInteger(value);
                if (v == null) {
                    return null;
                } else  {
                    return cb.equal(cb.lower(root.get(attribute)), v);
                }
            } else {
                return cb.like(
                        cb.lower(root.get(attribute)),
                        containsLowerCase(value)
                );
            }
        };
    }

    private Integer getInteger(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
