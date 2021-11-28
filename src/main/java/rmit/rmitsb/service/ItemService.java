package rmit.rmitsb.service;

import rmit.rmitsb.model.Item;

import java.util.List;

public interface ItemService {


    public void saveItem(Item item);

    public List<Item> getAllItems();
    public Item getItem(Long id);

    public Item deleteItem(Long id);


}
