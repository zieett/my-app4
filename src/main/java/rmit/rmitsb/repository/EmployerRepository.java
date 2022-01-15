package rmit.rmitsb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rmit.rmitsb.model.Employer;


public interface EmployerRepository extends JpaRepository<Employer, Long> {
}
