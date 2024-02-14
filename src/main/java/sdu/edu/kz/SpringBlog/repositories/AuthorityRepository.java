package sdu.edu.kz.SpringBlog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sdu.edu.kz.SpringBlog.models.Authority;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Long>{
    
}
