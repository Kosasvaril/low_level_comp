package store.lc.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import store.lc.demo.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
