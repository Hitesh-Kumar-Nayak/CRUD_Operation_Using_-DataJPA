package in.ashokit;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Fruit {
	
	@Id
	private Integer fruitId;
	
	private String fruitName;
	
	private Double fruitPrice;
	


}
