package com.chornyi.poc.database.query.dto;

import com.chornyi.poc.database.domain.Job;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper=false)
public class Jobs extends AbsctractDto {

    private List<Job> jobs;

    public Jobs(List<Job> jobs, long length, long pageSize) {
        this.jobs = jobs;
        this.length = length;
        this.pageSize = pageSize;
    }
}
