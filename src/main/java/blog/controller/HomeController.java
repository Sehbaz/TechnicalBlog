package blog.controller;

import blog.model.Post;
import blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class HomeController {

	@Autowired
	private PostService postService;
	@RequestMapping("/")
	public String getAllPost(Model model){
		List<Post> posts=new PostService().getAllPosts();
		model.addAttribute("posts",posts);
		return "index";
	}

}
