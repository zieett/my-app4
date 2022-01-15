package rmit.rmitsb.contrller;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rmit.rmitsb.model.Job;
import rmit.rmitsb.service.JobService;

import java.io.IOException;
import java.util.*;
import java.io.FileReader;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class JobController {

    @Autowired
    private JobService jobService;

    @RequestMapping(path = "/jobs", method = RequestMethod.GET)
    public List<Job> getAllJob(){
        return jobService.getAllJob();
    }

    @RequestMapping(path = "/jobs", method = RequestMethod.POST)
    public void addJob(@RequestBody Job job){
        jobService.saveJob(job);
    }

    @RequestMapping(path = "/jobs", method = RequestMethod.PUT)
    public void updateJob(@RequestBody Job job){
        jobService.saveJob(job);
    }

    @RequestMapping(path = "/jobs/{id}", method = RequestMethod.DELETE)
    public void deleteJob(@PathVariable(value = "id") Long id){
        jobService.deleteJob(id);
    }

    @RequestMapping(path = "/jobs/{id}", method = RequestMethod.GET)
    public Job getJob(@PathVariable(value = "id") Long id){
        return jobService.getJob(id);
    }

    @RequestMapping(path = "/getJobs", method =  RequestMethod.GET)
    public List<Job> getFilterJobs (@RequestParam String page){
        List<Job> jobs = new ArrayList<Job>();
        List<Job> allJobs = getAllJob();
        for (int i = (Integer.parseInt(page) -1 ) *10; i <( (Integer.parseInt(page) -1 ) *10 )+10;i++ ){
            jobs.add(allJobs.get(i));
        }
        return jobs;
    }

    @RequestMapping(path = "/jobs/related/{id}", method = RequestMethod.GET)
    public List<Job> getRelation(@PathVariable(value = "id") String spec){
        List<Job> response = new ArrayList<>();
        List<Job> allJobs = getAllJob();
        for (Job job: allJobs){
            if (job.getSpecialization().contains(spec))
                response.add(job);
        }
        return response;
    }
}
