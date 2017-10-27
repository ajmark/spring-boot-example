package hello;

import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.Collection;

@Transactional
public interface TshirtOrderRepository extends CrudRepository<TshirtOrder, Long> {
    Collection<TshirtOrder> findByCustomerId(Long id);
}
