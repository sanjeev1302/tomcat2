package com.mcnz.ioc.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;


@Service
public class GameService {
	
	public static ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
		
	
	Score score;
	
	public Score getScore() {
		return score;
	}

	@Autowired
	public void setScore(Score score) {
		this.score = score;
	}

	public void playTheGame(String clientGesture) {
		if (clientGesture.equals("scissors")) { getScore().wins++; }
	}
}


