package com.example.demo;

import com.example.demo.models.Game;
import com.example.demo.repository.GameRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	Game game;

	@Autowired
	GameRepository repository;

	@Before
	public void before() {
		game = new Game("Dominion", "Card Drafting");
		repository.save(game);
		String awesomeName = repository.getOne((long)1).getName();
		System.out.println(awesomeName);
	}


	@Test
	public void contextLoads() {
	}

}
