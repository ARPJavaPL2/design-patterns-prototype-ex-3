import java.util.UUID;

public abstract class Product implements Cloneable {

    private UUID id;
    private String name;

    public Product() {
    }

    public Product(Product product) {
        this.id = product.id;
        this.name = product.name;
    }

    @Override
    public abstract Product clone();


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
