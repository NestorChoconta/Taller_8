package co.edu.sena.proyect_7.model.repository;
import co.edu.sena.proyect_7.model.Product;
import java.sql.SQLException;
public class TestProductRepositoryImpl {
    public static void main(String[] args) throws SQLException {
        Repository<Product> repository = new ProductRepositoryImpl();

        System.out.println("========== createObj Insert =========="); //insert
        Product productInsert = new Product();
        productInsert.setProduct_name("hola");
        productInsert.setProduct_value(20000);
        productInsert.setCategory_id(1);
        repository.saveObj(productInsert);
        productInsert.setProduct_name("buenas2");
        productInsert.setProduct_value(40000);
        productInsert.setCategory_id(1);
        repository.saveObj(productInsert);

    }
}

