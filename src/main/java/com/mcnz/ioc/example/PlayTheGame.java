package com.mcnz.ioc.example;

public class PlayTheGame {

	public static void main(String args[]) {
		GameService gameService = GameService.context.getBean("gameService", GameService.class);
		gameService.playTheGame("scissors");
		gameService.playTheGame("paper");
		gameService.playTheGame("scissors");
		int wins = gameService.score.wins;
		System.out.println("Wins: " + wins);

	}
}
