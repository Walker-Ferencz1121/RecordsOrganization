package Login;

import java.util.List;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsersController {
	
	private UsersRepository usersRepository;
	
	@GetMapping("/welcome")
	public String login() {
		return "login";
	}
	
	@GetMapping("/register")
	public String showRegistrationForm(Model model) {
		model.addAttribute("users", new Users());
		
		return "signup_form";
	}
	
	@PostMapping("/process_register")
	public String processRegister(Users users) {
	    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	    String encodedPassword = passwordEncoder.encode(users.getPassword());
	    users.setPassword(encodedPassword);
	     
	    usersRepository.save(users);
	     
	    return "register_success";
	}
	
	@GetMapping("/users")
	public String listUsers(Model model) {
		List<Users> listUsers = usersRepository.findAll();
	    model.addAttribute("listUsers", listUsers);
	     
	    return "users";
	}
}
