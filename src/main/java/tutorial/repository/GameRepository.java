package tutorial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import tutorial.entity.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

	@Query("SELECT g FROM Game g WHERE lower(g.title) LIKE lower(?1)")
	public List<Game> searchGamesByTitle(String title);
}
