package homework4.business.concretes;

import homework4.business.abstracts.GameService;
import homework4.entitity.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " game added.");
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + " game deleted.");
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() + " game updated.");
	}

}
