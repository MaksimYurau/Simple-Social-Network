package by.maksim.springsocialnetwork.repository;

import by.maksim.springsocialnetwork.domain.Comment;
import by.maksim.springsocialnetwork.domain.Post;
import by.maksim.springsocialnetwork.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
