package rmit.rmitsb.contrller;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rmit.rmitsb.model.Item;
import rmit.rmitsb.service.ItemService;

import java.io.IOException;
import java.util.*;
import java.io.FileReader;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping(path = "/items", method = RequestMethod.GET)
    public List<Item> getAllItems(){
        return itemService.getAllItems();
    }

    @RequestMapping(path = "/items", method = RequestMethod.POST)
    public void addItem(@RequestBody Item item){
         itemService.saveItem(item);
    }

    @RequestMapping(path = "/items", method = RequestMethod.PUT)
    public void updateItem(@RequestBody Item item){
        itemService.saveItem(item);
    }

    @RequestMapping(path = "/items/{id}", method = RequestMethod.DELETE)
    public void deleteItem(@PathVariable(value = "id") Long id){
        itemService.deleteItem(id);
    }

    @RequestMapping(path = "/items/{id}", method = RequestMethod.GET)
    public Item getItem(@PathVariable(value = "id") Long id){
        return itemService.getItem(id);
    }

    @RequestMapping(path = "/getItems", method =  RequestMethod.GET)
    public List<Item> getFilterItems (@RequestParam String page){
        List<Item> items = new ArrayList<Item>();
        List<Item> allItems = getAllItems();
        for (int i = (Integer.parseInt(page) -1 ) *10; i <( (Integer.parseInt(page) -1 ) *10 )+10;i++ ){
            items.add(allItems.get(i));
        }
        return items;
    }

    @RequestMapping(path = "/items/search", method =  RequestMethod.GET)
    public List<Item> getSearchItem (@RequestParam String currentPage,@RequestParam String keyword,@RequestParam String order,@RequestParam String sortType,@RequestParam String type,@RequestParam String brand){
        List<Item> items = new ArrayList<Item>();
        List<Item> allItems = getAllItems();
        for (Item item:allItems){
            if(item.getName().toLowerCase().contains(keyword.toLowerCase())){
                items.add(item);
            }
        }
        if(order.equals("acs") && sortType.equals("id")){
            items.sort(new Comparator<Item>() {

                public int compare(Item o1, Item o2) {

                    return (int)(o1.getId() - o2.getId());
                }
            });
        }
        else if(order.equals("des") && sortType.equals("id")){
            items.sort(new Comparator<Item>() {

                public int compare(Item o1, Item o2) {

                    return (int)(o1.getId() - o2.getId());
                }
            });
            Collections.reverse(items);
        }
        if(order.equals("acs") && sortType.equals("name")){
            items.sort(new Comparator<Item>() {

                public int compare(Item o1, Item o2) {

                    return o1.getName().compareTo(o2.getName());
                }
            });
        }
        else if(order.equals("des") && sortType.equals("name")){
            items.sort(new Comparator<Item>() {

                public int compare(Item o1, Item o2) {

                    return o1.getName().compareTo(o2.getName());
                }
            });
            Collections.reverse(items);
        }
        if(order.equals("acs") && sortType.equals("price")){
            items.sort(new Comparator<Item>() {

                public int compare(Item o1, Item o2) {

                    return (int)(Integer.parseInt(o1.getPrice()) - Integer.parseInt(o2.getPrice()));
                }
            });
        }
        else if(order.equals("des") && sortType.equals("price")){
            items.sort(new Comparator<Item>() {

                public int compare(Item o1, Item o2) {

                    return (int)(Integer.parseInt(o1.getPrice()) - Integer.parseInt(o2.getPrice()));
                }
            });
            Collections.reverse(items);
        }
        if(order.equals("acs") && sortType.equals("brand")){
            items.sort(new Comparator<Item>() {

                public int compare(Item o1, Item o2) {

                    return o1.getBrand().compareTo(o2.getBrand());
                }
            });
        }
        else if(order.equals("des") && sortType.equals("brand")){
            items.sort(new Comparator<Item>() {

                public int compare(Item o1, Item o2) {

                    return o1.getBrand().compareTo(o2.getBrand());
                }
            });
            Collections.reverse(items);
        }
        if(order.equals("acs") && sortType.equals("amount")){
            items.sort(new Comparator<Item>() {

                public int compare(Item o1, Item o2) {

                    return(int)(Integer.parseInt(o1.getAmount()) - Integer.parseInt(o2.getAmount()));
                }
            });
        }
        else if(order.equals("des") && sortType.equals("amount")){
            items.sort(new Comparator<Item>() {

                public int compare(Item o1, Item o2) {

                    return(int)(Integer.parseInt(o1.getAmount()) - Integer.parseInt(o2.getAmount()));
                }
            });
            Collections.reverse(items);
        }
        switch (type) {
            case "shoes":
                switch (brand) {
                    case "adidas":
                        items.removeIf(item -> !item.getType().equals("shoes") || !item.getBrand().equals("adidas"));
                        break;
                    case "nike":
                        items.removeIf(item -> !item.getType().equals("shoes") || !item.getBrand().equals("nike"));
                        break;
                    case "puma":
                        items.removeIf(item -> !item.getType().equals("shoes") || !item.getBrand().equals("puma"));
                        break;
                    case "New Balance":
                        items.removeIf(item -> !item.getType().equals("shoes") || !item.getBrand().equals("new balance"));
                        break;
                    default:
                        items.removeIf(item -> !item.getType().equals("shoes"));
                        break;
                }
                break;
            case "clothes":
                switch (brand) {
                    case "gucci":
                        items.removeIf(item -> !item.getType().equals("clothes") || !item.getBrand().equals("gucci"));
                        break;
                    case "fendi":
                        items.removeIf(item -> !item.getType().equals("clothes") || !item.getBrand().equals("fendi"));
                        break;
                    default:
                        items.removeIf(item -> !item.getType().equals("clothes"));
                        break;
                }
                break;
            case "phone":
                switch (brand) {
                    case "iphone":
                        items.removeIf(item -> !item.getType().equals("phone") || !item.getBrand().equals("apple"));
                        break;
                    case "samsung":
                        items.removeIf(item -> !item.getType().equals("phone") || !item.getBrand().equals("samsung"));
                        break;
                    case "xiaomi":
                        items.removeIf(item -> !item.getType().equals("phone") || !item.getBrand().equals("xiaomi"));
                        break;
                    case "huwei":
                        items.removeIf(item -> !item.getType().equals("phone") || !item.getBrand().equals("huwei"));
                        break;
                    default:
                        items.removeIf(item -> !item.getType().equals("phone"));
                        break;
                }
                break;
        }
        return items;
    }
//    @RequestMapping(path = "/items/", method = RequestMethod.GET)
//    public Item getItem(@Param() Long id){
//        return itemService.getItem(id);
//    }


    @RequestMapping(path = "/setUpDatabase", method = RequestMethod.GET)
    public void setUpDatabase() throws IOException {
        FileReader filereader = new FileReader("data.csv");
        List<Item> items = new ArrayList<Item>();
        // create csvReader object and skip first Line
        CSVReader csvReader = new CSVReaderBuilder(filereader)
                .withSkipLines(1)
                .build();

        String[] row;


        while ((row = csvReader.readNext()) != null)
            items.add(new Item(row[0],row[1],row[2],row[3].toLowerCase(),row[4],row[5],row[6]));
        Collections.shuffle(items);
        for (Item item: items) itemService.saveItem(item);

    }


}
