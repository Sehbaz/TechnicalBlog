package blog.service;

import blog.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	public boolean login(User user){
		if(user.getUsername().equals("sehbaz")){
			return true;
		}
		return false;
	}
}
