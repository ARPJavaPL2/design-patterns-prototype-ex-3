import java.util.Map;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        ProductsCache productsCache = new ProductsCache();

        Map<ProductType, Product> products = productsCache.getProducts();

        Product msiGPU = products.get(ProductType.MSI_GPU);
        Product asusGPU = products.get(ProductType.ASUS_GPU);

        for (int i = 0; i < 10; i++) {
            Product gpu1 = msiGPU.clone();
            gpu1.setId(UUID.randomUUID());

            Product gpu2 = asusGPU.clone();
            gpu2.setId(UUID.randomUUID());

            System.out.println(gpu1);
            System.out.println(gpu2);
        }
    }

}
