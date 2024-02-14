package sdu.edu.kz.SpringBlog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sdu.edu.kz.SpringBlog.models.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
    
}
