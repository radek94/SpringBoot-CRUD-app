package personal.radekpiotrowski.shoes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import personal.radekpiotrowski.ShoeRepository.ShoeRepository;


@Service
public class ShoeService {
	
	@Autowired
	private ShoeRepository shoeRespository;
	
	
	public List<Shoe> getAllShoes(){
		List<Shoe> shoes = new ArrayList<>();
		shoeRespository.findAll().forEach(shoes::add);
		return shoes;
	}
	
	public Shoe getShoeById(int id) {
		return shoeRespository.findOne(id);
	}
	
	public void addShoe(Shoe shoe) {
		shoeRespository.save(shoe);
	}
	
	public void updateShoe(int id, Shoe shoe) {
		shoeRespository.save(shoe);
	}
	
	public void deleteShoe(int id) {
		shoeRespository.delete(id);
	}	
}
