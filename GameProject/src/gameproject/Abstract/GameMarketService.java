package gameproject.Abstract;

import gameproject.Entities.Game;
import gameproject.Entities.Member;
import gameproject.Entities.Offer;

public interface GameMarketService {
void gameBuy(Game game,Offer offer,Member member);
}
