package homework4.business.concretes;

import homework4.business.abstracts.CampaignService;
import homework4.entitity.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " campaign added.");
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " campaign deleted.");
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " campaign updated.");
	}

}
