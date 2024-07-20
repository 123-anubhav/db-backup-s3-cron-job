package click.selfcare.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import click.selfcare.entity.User;
import click.selfcare.repo.UserRepo;

@RestController
public class UserRestController {

	@Autowired
	private UserRepo userRepo;

	@PostMapping("/insert")
	public ResponseEntity<User> home(@RequestBody User user) {
		System.out.println("UserRestController.home()" + "    ::  \nuser inserted data is" + user);

		User save = userRepo.save(user);
		return new ResponseEntity<User>(save, HttpStatus.OK);
	}
}
