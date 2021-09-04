package gameproject;

import gameproject.Abstract.GameMarketService;
import gameproject.Abstract.MemberCheckService;
import gameproject.Adapter.MernisServiceAdapter;
import gameproject.Concrate.GameMarketManager;
import gameproject.Concrate.MemberCheckManager;
import gameproject.Concrate.MemberManager;
import gameproject.Entities.Game;
import gameproject.Entities.Member;
import gameproject.Entities.Offer;

public class Main {

	public static void main(String[] args) {
Member member1 = new Member("deneme@gmail.com","12345","mert","yýlmaz",1998,"21788570806",1000);
MemberManager memberManager = new MemberManager(new MernisServiceAdapter());
memberManager.memberRegister(member1);

Offer offer1 = new Offer("Yaz Kampanyasý",10);

Game game = new Game("Grand Theft Auto 5","Gerekli Donanýmlar..",200,offer1);
GameMarketManager gameMarket = new GameMarketManager();
gameMarket.gameBuy(game,offer1,member1);

	}

}
