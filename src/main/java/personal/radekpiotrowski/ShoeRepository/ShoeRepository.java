package personal.radekpiotrowski.ShoeRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import personal.radekpiotrowski.shoes.Shoe;

@Repository
public interface ShoeRepository extends CrudRepository<Shoe, Integer>{

}
