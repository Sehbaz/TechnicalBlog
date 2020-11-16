package blog.controller;

import blog.model.Post;
import blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class PostController {
	@Autowired
	private PostService postService;

	@RequestMapping("posts")
	public  String getUserPosts(Model model){

		//Getting single post from postservice
		ArrayList<Post> posts= postService.getOnePost();

		//Providing the key using the model in the spring controller

		model.addAttribute("posts",posts);
		return "posts";
	}
}
