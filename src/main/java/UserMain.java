import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.demo.configuration.SpringConfiguration;
import com.demo.model.User;
import com.demo.service.UserService;

public class UserMain {

	public static void main(String[] args) {

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(
				SpringConfiguration.class);

		UserService userService = (UserService) context.getBean("userService");

//		User user1 = new User();
//		user1.setFirstName("Amol");
//		user1.setLastName("Pawar");
//		user1.setEmail("pawaramol22@googlemail.com");
//		user1.setUserName("chikoo");
//		user1.setPassword("kitkat");
//		user1.setPhoneNumber("111111111");
//		user1.setAddress("CA");
//
//		userService.saveUser(user1);

		List<User> userList = userService.findAllUsers();
		for (User user : userList) {
			System.out.println(user.getFirstName());
		}
		
		User user = userService.findById(2);
		user.setFirstName("Yash");
		user.setLastName("Pawar");
		user.setEmail("mmishra@googlemail.com");
		user.setUserName("chik");
		user.setPassword("kitkat1");
		user.setPhoneNumber("111111111");
		user.setAddress("CA");
		
		userService.updateUser(user);

		context.close();
	}

}
