package com.chornyi.poc.database.query;

import graphql.schema.*;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class ScalarLocalDateTime extends GraphQLScalarType {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public ScalarLocalDateTime() {
        super("LocalDateTime", "Scalar LocalDateTime", new Coercing() {
            @Override
            public Object serialize(Object dataFetcherResult) throws CoercingSerializeException {
                return ((LocalDateTime)dataFetcherResult).format(formatter);
            }

            @Override
            public Object parseValue(Object input) throws CoercingParseValueException {
                return serialize(input);
            }

            @Override
            public Object parseLiteral(Object input) throws CoercingParseLiteralException {
                return LocalDateTime.parse((String)input, formatter);
            }
        });
    }
}
