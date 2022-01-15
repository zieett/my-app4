package rmit.rmitsb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rmit.rmitsb.model.Item;
import rmit.rmitsb.model.Job;


public interface JobRepository extends JpaRepository<Job, Long> {
}
