package hello;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Tshirt {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String size;

    private String description;

    private Integer count;

    private String sku;

//    @OneToMany(mappedBy = "tshirt", targetEntity = TshirtOrder.class, fetch = FetchType.LAZY)
//    private Collection orders;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

//    public Collection<TshirtOrder> getOrders() {
//        return orders;
//    }
}
