package rmit.rmitsb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rmit.rmitsb.model.Item;
import rmit.rmitsb.repository.ItemRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public void saveItem(Item item){
        this.itemRepository.save(item);
    }

    public List<Item> getAllItems(){
        return this.itemRepository.findAll();
    }

    public Item getItem(Long id){
        Item item = null;
        try {
            item = this.itemRepository.findById(id)
                    .orElseThrow(() -> new Exception("Student not found for this id :: " + id));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return item;
    }

    public Item deleteItem(Long id){

        Item item = getItem(id);
        this.itemRepository.delete(item);
        return item;
    }



}
