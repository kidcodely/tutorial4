package tutorial;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tutorial.entity.Game;
import tutorial.repository.GameRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class GameTest {

	@Autowired
	private GameRepository gameRepo;
	
	@Test
	public void testSearchGamesByTitle(){
		List<Game> results = gameRepo.searchGamesByTitle("mario");
		Assert.assertEquals(0, results.size());
	}
}
