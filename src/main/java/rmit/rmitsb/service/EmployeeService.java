package rmit.rmitsb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rmit.rmitsb.model.Employee;
import rmit.rmitsb.repository.EmployeeRepository;
import rmit.rmitsb.repository.ItemRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public void saveEmployee(Employee employee){
        this.employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployee(){
        return this.employeeRepository.findAll();
    }

    public Employee getEmployee(Long id){
        Employee employee = null;
        try {
            employee = this.employeeRepository.findById(id)
                    .orElseThrow(() -> new Exception("Student not found for this id :: " + id));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return employee ;
    }

    public Employee deleteEmployee(Long id){

        Employee employee = getEmployee(id);
        this.employeeRepository.delete(employee);
        return employee;
    }



}
