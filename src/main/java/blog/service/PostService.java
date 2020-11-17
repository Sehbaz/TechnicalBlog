package blog.service;

import blog.model.Post;
import blog.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

	@Autowired
	private PostRepository repository;

	public List<Post> getAllPosts() {
		return repository.getPost();
	}
	public Post getOnePost(){
		return repository.getOnePost();
	}

/*
	public ArrayList<Post> getOnePost(){
		ArrayList<Post> posts=new ArrayList();


		Connection connection=null;
		try {
			Class.forName("org.postgresql.Driver");

			 connection=DriverManager.getConnection("jdbc:postgresql://localhost:5433/postgres", "Sehbaz", "1234");
			Statement statement=connection.createStatement();
			ResultSet rs=statement.executeQuery("select *from posts where id=2");
			while(rs.next()){
				Post post=new Post();
				post.setTitle(rs.getString("title"));
				post.setBody(rs.getString("body"));
				posts.add(post);

			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException throwables) {
				throwables.printStackTrace();
			}
		}
		return  posts;
	}

 */
	public void createPost(Post newPost){

	}
}
