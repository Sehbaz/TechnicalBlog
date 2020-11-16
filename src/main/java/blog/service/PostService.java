package blog.service;

import blog.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
@Service
public class PostService {

	//CRUD functionality

	public ArrayList<Post> getAllPosts(){
		//Generating the static data without the database

		Post post1=new Post();
		post1.setTitle("Post 1");
		post1.setBody("Post body 1");
		post1.setDate(new Date());

		Post post2=new Post();
		post2.setTitle("Post 2");
		post2.setBody("Post body 2");
		post2.setDate(new Date());

		Post post3=new Post();
		post3.setTitle("Post 3");
		post3.setBody("Post body 3");
		post3.setDate(new Date());

		//Creating the array list for storing all the temporary data

		ArrayList<Post> posts=new ArrayList();

		posts.add(post1);
		posts.add(post2);
		posts.add(post3);

		return posts;
	}
}
