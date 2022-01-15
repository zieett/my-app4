package rmit.rmitsb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rmit.rmitsb.model.Job;
import rmit.rmitsb.repository.JobRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class JobService {
    @Autowired
    private JobRepository jobRepository;

    public void saveJob(Job job){
        this.jobRepository.save(job);
    }

    public List<Job> getAllJob(){
        return this.jobRepository.findAll();
    }

    public Job getJob(Long id){
        Job job = null;
        try {
            job = this.jobRepository.findById(id)
                    .orElseThrow(() -> new Exception("Student not found for this id :: " + id));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return job ;
    }

    public Job deleteJob(Long id){

        Job job = getJob(id);
        this.jobRepository.delete(job);
        return job;
    }



}
