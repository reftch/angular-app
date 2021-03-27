package com.chornyi.poc.database.query;

import com.chornyi.poc.database.domain.Job;
import com.chornyi.poc.database.repository.JobRepository;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Mutation implements GraphQLMutationResolver {

    @Autowired
    private JobRepository jobRepository;

    public Job deleteJob(Long id) {
        Job job = jobRepository.getOne(id);
        if (job != null) {
            jobRepository.deleteById(id);
        }
        return job;
    }

}
