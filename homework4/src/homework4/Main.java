package homework4;

import java.time.LocalDate;

import homework4.adapters.EDevletServiceAdapter;
import homework4.business.concretes.CampaignManager;
import homework4.business.concretes.GameManager;
import homework4.business.concretes.GamerManager;
import homework4.entitity.Campaign;
import homework4.entitity.Game;
import homework4.entitity.Gamer;

public class Main {

 
	    public static void main(String[] args) {
		
		Gamer gamer1=new Gamer(1,"XXXXXX","YYYYYY",LocalDate.of(2000,10,10),"12345678910");
  
		Game game1=new Game(2,"XYZ",20);
		
		Campaign campaign=new Campaign(1,"New year campaign",10,LocalDate.of(2021,10,12),LocalDate.of(2020,11,12));
		
		
		GamerManager gamerManager = new GamerManager(new EDevletServiceAdapter());
		gamerManager.add(gamer1);
	
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.update(campaign);

		GameManager gameManager=new GameManager();
		gameManager.delete(game1);
}
}