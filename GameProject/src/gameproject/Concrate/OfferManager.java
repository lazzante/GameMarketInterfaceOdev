package gameproject.Concrate;

import gameproject.Abstract.OfferService;
import gameproject.Entities.Offer;

public class OfferManager implements OfferService{

	@Override
	public void offerAdd(Offer offer) {
		System.out.println("Kampanya Sisteme Eklendi : "+offer.getName());
		
	}

	@Override
	public void offerUpdate(Offer offer) {
		System.out.println("Kampanya Sistemde Güncellendi : "+offer.getName());		
	}

	@Override
	public void offerDelete(Offer offer) {
		System.out.println("Kampanya Sistemden Silindi : "+offer.getName());		
		
	}

	
}
