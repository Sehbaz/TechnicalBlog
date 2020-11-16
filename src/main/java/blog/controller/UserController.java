package blog.controller;

import blog.model.Post;
import blog.model.User;
import blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@Controller
public class UserController {


	@Autowired
	private PostService postService;

	@RequestMapping("users/login")
	public String login(){
		return "users/login";
	}

	@RequestMapping("users/registration")
	public String registration(){
		return "users/registration";
	}


	//The data coming from UI to the server

	@RequestMapping(value = "users/login", method = RequestMethod.POST)
	public  String loginUser(User user){
		return "redirect:/posts";
	}
	@RequestMapping(value = "users/logout", method = RequestMethod.POST)
	public String logout(Model model){

		//Getting single post from postservice
		ArrayList<Post> posts= postService.getAllPosts();

		//Providing the key using the model in the spring controller

		model.addAttribute("posts",posts);
		return "index";
	}

}
