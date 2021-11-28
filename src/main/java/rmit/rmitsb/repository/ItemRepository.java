package rmit.rmitsb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rmit.rmitsb.model.Item;


public interface ItemRepository extends JpaRepository<Item, Long> {
}
