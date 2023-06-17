package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.ashokit.repository.FruitRepository;

@SpringBootApplication
public class CrudOpeartionApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(CrudOpeartionApplication.class, args);
		
		Fruit fruit = new Fruit();
		fruit.setFruitId(101);
		fruit.setFruitName("Apple");
		fruit.setFruitPrice(100.0);
		
		FruitRepository repository = context.getBean(FruitRepository.class);
		
		Fruit save = repository.save(fruit);
		System.out.println(save);
	}

}
