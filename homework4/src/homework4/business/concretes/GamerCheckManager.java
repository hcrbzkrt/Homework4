package homework4.business.concretes;

import homework4.business.abstracts.GamerCheckService;
import homework4.entitity.Gamer;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		return true;
	}

}
