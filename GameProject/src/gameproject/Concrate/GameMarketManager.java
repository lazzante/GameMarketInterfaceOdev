package gameproject.Concrate;

import gameproject.Abstract.GameMarketService;
import gameproject.Entities.Game;
import gameproject.Entities.Member;
import gameproject.Entities.Offer;

public class GameMarketManager implements GameMarketService{

	@Override
	public void gameBuy(Game game, Offer offer, Member member) {
		String game1 = "Oyunun Ismi : "+game.getName()
					  +"\nOyunun Detaylari :"+game.getDetails()
					  +"\nOyunun Fiyati :"+game.getPrice()
					  +"\nKampanya Ýsmi :"+offer.getName()+" %"+offer.getDiscountRate()
					  +"\nKampanyali Fiyati :"+game.getPriceAfterDiscount();
		System.out.println(game1);
		System.out.println("Sepete Eklendi");
		System.out.println(member.getFirstName()+" "+member.getLastName()+" "+(member.getBalance()-game.getPriceAfterDiscount())
				+" TL Bakiyeniz Kalmistir.");
	}

}
