package fr.gestion.lan.repository;

import fr.gestion.lan.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by Florian NICOLAS on 03/04/2017.
 */
public interface TeamRepository extends JpaRepository<Team, Long> {

    Optional<Team> findOneById(Long teamId);
}
