package by.maksim.springsocialnetwork.repository;

import by.maksim.springsocialnetwork.domain.Post;
import by.maksim.springsocialnetwork.domain.SocialNetwork;
import by.maksim.springsocialnetwork.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySocialNetwork(SocialNetwork socialNetwork);

    List<Post> findByUser(User user);
}
