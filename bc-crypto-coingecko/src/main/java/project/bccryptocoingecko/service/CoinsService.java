package project.bccryptocoingecko.service;

import java.util.List;
import project.bccryptocoingecko.model.Coins;

public interface CoinsService {

  List<Coins>getCoins(String id);

  List<Coins>getCoins();

}
