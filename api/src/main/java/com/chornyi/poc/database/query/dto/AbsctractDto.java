package com.chornyi.poc.database.query.dto;

import lombok.Data;

@Data
public abstract class AbsctractDto {

    protected long length;
    protected long pageSize;

}
