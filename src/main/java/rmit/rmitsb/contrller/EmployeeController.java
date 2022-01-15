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
import rmit.rmitsb.service.ItemService;
import rmit.rmitsb.service.JobService;

import java.io.IOException;
import java.util.*;
import java.io.FileReader;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(path = "/employee", method = RequestMethod.GET)
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

//    @RequestMapping(path = "/signIn", method = RequestMethod.GET)
//    public Employee getSignIn(){
//        List<Employee> employees = getAllEmployee();
//        Employee e;
//        for (int i = 0; i < employees.size();i++){
//
//        }
//    }

    @RequestMapping(path = "/employee", method = RequestMethod.POST)
    public void addEmployee(@RequestBody Employee employee){
        employeeService.saveEmployee(employee);
    }

    @RequestMapping(path = "/employee", method = RequestMethod.PUT)
    public void updateEmployee(@RequestBody Employee employee){
        employeeService.saveEmployee(employee);
    }

    @RequestMapping(path = "/employee/{id}", method = RequestMethod.DELETE)
    public void deleteEmployee(@PathVariable(value = "id") Long id){
        employeeService.deleteEmployee(id);
    }

    @RequestMapping(path = "/employee/{id}", method = RequestMethod.GET)
    public Employee getEmployee(@PathVariable(value = "id") Long id){
        return employeeService.getEmployee(id);
    }

    @RequestMapping(path = "/getEmployee", method =  RequestMethod.GET)
    public List<Employee> getFilterEmployee (@RequestParam String page){
        List<Employee> employees = new ArrayList<Employee>();
        List<Employee> allEmployee = getAllEmployee();
        for (int i = (Integer.parseInt(page) -1 ) *10; i <( (Integer.parseInt(page) -1 ) *10 )+10;i++ ){
            employees.add(allEmployee.get(i));
        }
        return employees;
    }

    @RequestMapping(path = "/loginEmployee", method = RequestMethod.POST)
    public Employee loginEmployee(@RequestBody Map<String, Object> map){
        String email = (String) map.get("email");
        String password = (String) map.get("password");
        List<Employee> employees =  employeeService.getAllEmployee();
        for(Employee employee: employees){
            if (employee.getEmail().equals(email)){
                if (employee.getPassword().equals(password)){
                    return employee;
                }
            }
        }
        return null;
    }


}
