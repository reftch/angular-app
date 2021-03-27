package com.chornyi.poc.database.query.dto;

import com.chornyi.poc.database.domain.Doc;
import com.chornyi.poc.database.domain.Job;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper=false)
public class Docs extends AbsctractDto {

    private List<Doc> docs;

    public Docs(List<Doc> docs, long length, long pageSize) {
        this.docs = docs;
        this.length = length;
        this.pageSize = pageSize;
    }
    
}
