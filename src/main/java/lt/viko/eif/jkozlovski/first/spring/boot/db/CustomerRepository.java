package lt.viko.eif.jkozlovski.first.spring.boot.db;

import lt.viko.eif.jkozlovski.first.spring.boot.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
