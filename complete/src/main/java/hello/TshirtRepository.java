package hello;

import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface TshirtRepository extends CrudRepository<Tshirt, Long > {

}
