package personal.radekpiotrowski.shoes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoeController {
	
	@Autowired
	private ShoeService shoeService;
	
	@RequestMapping("/shoes")
	public List<Shoe> getAllShoes(){
		return shoeService.getAllShoes();
	}
	
	@RequestMapping("/shoes/{id}")
	public Shoe getShoeById(@PathVariable int id) {
		return shoeService.getShoeById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/shoes")
	public void addShoe(@RequestBody Shoe shoe) {
		shoeService.addShoe(shoe);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/shoes/{id}")
	public void updateShoe(@RequestBody Shoe shoe, @PathVariable int id) {
		shoeService.updateShoe(id, shoe);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/shoes/{id}")
	public void deleteShoe(@PathVariable int id) {
		shoeService.deleteShoe(id);
	}

}
