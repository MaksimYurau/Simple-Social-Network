package by.maksim.springsocialnetwork.repository;

import by.maksim.springsocialnetwork.domain.Post;
import by.maksim.springsocialnetwork.domain.User;
import by.maksim.springsocialnetwork.domain.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
