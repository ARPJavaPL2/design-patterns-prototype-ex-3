import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ProductsCache {

    private final Map<ProductType, Product> products;

    public ProductsCache() {

        GPUModelsProvider gpuModelsProvider = new GPUModelsProvider();

        GPU msiGPU = new GPU();
        msiGPU.setId(UUID.randomUUID());
        msiGPU.setName("MSI GeForce RTX 3060 GAMING X Graphics Card");

        String msiGPUModel = gpuModelsProvider.getMsiGPUModel();
        msiGPU.setModel(msiGPUModel);

        GPU asusGPU = new GPU();
        asusGPU.setId(UUID.randomUUID());
        asusGPU.setName("ASUS Geforce RTX 3050 OC Edition Gaming Graphic");

        String asusGPUModel = gpuModelsProvider.getAsusGPUModel();
        asusGPU.setModel(asusGPUModel);

        products = new HashMap<>();

        products.put(ProductType.MSI_GPU, msiGPU);
        products.put(ProductType.ASUS_GPU, asusGPU);
    }


    public Map<ProductType, Product> getProducts() {
        return products;
    }
}
