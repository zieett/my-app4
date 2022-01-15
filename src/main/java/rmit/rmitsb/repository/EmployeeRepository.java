package rmit.rmitsb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rmit.rmitsb.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
