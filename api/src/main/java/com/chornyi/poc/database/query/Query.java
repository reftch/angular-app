package com.chornyi.poc.database.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.domain.Sort;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

import static org.apache.commons.lang3.StringUtils.isBlank;

@Slf4j
public abstract class Query implements GraphQLQueryResolver {

    protected String validatePaginationParams(int pageNumber, int pageSize) {
        List<String> validationErrors = new ArrayList<>();
        if (pageNumber < 0) {
            log.error("Minimum PageNumber =0. PageNumber :{} must be greater than 0", pageNumber);
            validationErrors.add("PageNumber must be greater than or equal to 0!");
        }

        if (pageSize < 1) {
            log.error("PageSize :{} must be greater than 0", pageSize);
            validationErrors.add("PageSize must be greater than 0");
        }

        if (CollectionUtils.isEmpty(validationErrors)) {
            return null;
        }
        return StringUtils.join(validationErrors, "/n");
    }

    @NotNull
    protected Sort getSort(String sortBy, String direction) {
        if (isBlank(direction)) {
            direction = "asc";
        }
        return Sort.by(Sort.Direction.fromString(direction), sortBy);
    }


}
