package rmit.rmitsb.model;

import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column (nullable = false)
    private String description;

    @Column (nullable = false)
    private String price;

    @Column (nullable = false)
    private String brand;

    @Column (nullable = false)
    private String amount;

    @Column
    private String imgUrl;

    @Column
    private String type;
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }




    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public String toString() {
        return "Item{" +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price='" + price + '\'' +
                ", brand='" + brand + '\'' +
                ", amount='" + amount + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }

    public Item(String name, String description, String price, String brand, String amount, String imgUrl,String type) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.brand = brand;
        this.amount = amount;
        this.imgUrl = imgUrl;
        this.type = type;
    }



    public Item() {
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
