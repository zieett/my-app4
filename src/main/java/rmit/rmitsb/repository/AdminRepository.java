package rmit.rmitsb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rmit.rmitsb.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}
