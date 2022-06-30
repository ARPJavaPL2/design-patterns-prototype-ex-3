public class GPU extends Product {

    private String model;

    public GPU() {
    }

    public GPU(GPU gpu) {
        super(gpu);
        this.model = gpu.model;
    }

    @Override
    public final Product clone() {
        System.out.println("Cloning product: " + this.getClass().getName());
        return new GPU(this);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "GPU{" +
                "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", model='" + model + '\'' +
                '}';

    }
}
