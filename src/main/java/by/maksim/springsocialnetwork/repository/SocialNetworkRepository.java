package by.maksim.springsocialnetwork.repository;

import by.maksim.springsocialnetwork.domain.SocialNetwork;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SocialNetworkRepository extends JpaRepository<SocialNetwork, Long> {
    Optional<SocialNetwork> findByName(String socialNetworkName);
}
