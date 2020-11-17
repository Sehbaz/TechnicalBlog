package blog.service;

import blog.model.Post;
import blog.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

	@Autowired
	private PostRepository repository;

	public List<Post> getAllPosts() {
		return repository.getTwoPost();
	}


	public Post getOnePost(){
		return repository.getOnePost();
	}

	public void createPost(Post newPost){

	}
}
