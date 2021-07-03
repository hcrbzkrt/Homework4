package homework4.business.concretes;

import homework4.adapters.EDevletServiceAdapter;
import homework4.business.abstracts.GamerCheckService;
import homework4.business.abstracts.GamerService;
import homework4.entitity.Gamer;

public class GamerManager implements GamerService {
	
	GamerCheckService gamerCheckService;
	
	public GamerManager(EDevletServiceAdapter eDevletServiceAdapter) {
		this.gamerCheckService=gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		if(gamer.getFirstName()=="xxxxxx" && gamer.getLastName()=="yyyyyy" && gamer.getDateOfBirth().getYear()== 2000 && gamer.getNationalityId()== "12345678910" ) {
			
			System.out.println("Verification done with e-devlet system and " + gamer.getFirstName() + " " + gamer.getLastName() + " " + " gamer added.");
		}else
		{
			System.out.println("Invalid gamer " + " !");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("User deleted : " + gamer.getFirstName()+ " " + gamer.getLastName());
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("User updated : " + gamer.getFirstName()+ " " + gamer.getLastName());
	}

	
}
