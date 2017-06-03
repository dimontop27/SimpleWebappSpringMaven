package productmanager.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import productmanager.dao.ProductDao;
import productmanager.model.Product;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private ProductDao productDao;

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }


    @Transactional
    public void addProduct(Product product) {
        this.productDao.addProduct(product);
    }

    @Transactional
    public void updateProduct(Product product) {
        this.productDao.updateProduct(product);
    }

    @Transactional
    public void removeProduct(int id) {
        this.productDao.removeProduct(id);
    }

    @Transactional
    public Product getProductById(int id) {

        return this.productDao.getProductById(id);
    }

    @Transactional
    public List<Product> listProducts() {
        return this.productDao.listProducts();
    }
}
