package dsecommercewebapp.productlist;

import java.util.List;
import java.util.Arrays;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductListController {

	@RequestMapping("/productlist")
	public List<productlist> p_list(){
		
		return Arrays.asList(
				new productlist(1,"asdasdasd",20.00,"asdasdasdasdasdasdasd"),
				new productlist(1,"asdasdasd",20.00,"asdasdasdasdasdasdasd"),
				new productlist(1,"asdasdasd",20.00,"asdasdasdasdasdasdasd")
		);
		
		
	}
}
