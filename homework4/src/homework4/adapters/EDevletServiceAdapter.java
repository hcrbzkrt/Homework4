package homework4.adapters;

import homework4.business.abstracts.GamerCheckService;
import homework4.entitity.Gamer;

public class EDevletServiceAdapter implements GamerCheckService {

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		System.out.println("Registered in the e-devlet system");
		return true;
	}

}
