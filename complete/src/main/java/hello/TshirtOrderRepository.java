package hello;

import org.springframework.data.repository.CrudRepository;

public interface TshirtOrderRepository extends CrudRepository<TshirtOrder, Long> {

}
