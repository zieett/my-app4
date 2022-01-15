package rmit.rmitsb.contrller;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rmit.rmitsb.model.Employee;
import rmit.rmitsb.model.Employer;
import rmit.rmitsb.model.Item;
import rmit.rmitsb.model.Job;
import rmit.rmitsb.service.EmployeeService;
import rmit.rmitsb.service.EmployerService;
import rmit.rmitsb.service.ItemService;
import rmit.rmitsb.service.JobService;

import java.io.IOException;
import java.util.*;
import java.io.FileReader;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EmployerController {

    @Autowired
    private EmployerService employerService;

    @RequestMapping(path = "/employers", method = RequestMethod.GET)
    public List<Employer> getAllEmployer(){
        return employerService.getAllEmployer();
    }

    @RequestMapping(path = "/employers", method = RequestMethod.POST)
    public void addEmployer(@RequestBody Employer employer){
        employerService.saveEmployer(employer);
    }

    @RequestMapping(path = "/employers", method = RequestMethod.PUT)
    public void updateEmployer(@RequestBody Employer employer){
        employerService.saveEmployer(employer);
    }

    @RequestMapping(path = "/employers/{id}", method = RequestMethod.DELETE)
    public void deleteEmployer(@PathVariable(value = "id") Long id){
        employerService.deleteEmployer(id);
    }

    @RequestMapping(path = "/employers/{id}", method = RequestMethod.GET)
    public Employer getEmployer(@PathVariable(value = "id") Long id){
        return employerService.getEmployer(id);
    }

    @RequestMapping(path = "/getEmployers", method =  RequestMethod.GET)
    public List<Employer> getFilterEmployer (@RequestParam String page){
        List<Employer> employers = new ArrayList<Employer>();
        List<Employer> allEmployer = getAllEmployer();
        for (int i = (Integer.parseInt(page) -1 ) *10; i <( (Integer.parseInt(page) -1 ) *10 )+10;i++ ){
            employers.add(allEmployer.get(i));
        }
        return employers;
    }

    @RequestMapping(path = "/loginEmployer", method = RequestMethod.POST)
    public Employer login(@RequestBody Map<String, Object> map){
        String email = (String) map.get("email");
        String password = (String) map.get("password");
        System.out.println("employer" + email);
        System.out.println(password);
        List<Employer> employees =  employerService.getAllEmployer();
        for(Employer employer: employees){
            if (employer.getEmail().equals(email)){
                if (employer.getPassword().equals(password)){
                    return employer;
                }
            }
        }
        return null;
    }





}
