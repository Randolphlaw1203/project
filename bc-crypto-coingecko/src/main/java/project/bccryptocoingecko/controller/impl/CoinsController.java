package project.bccryptocoingecko.controller.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.bccryptocoingecko.controller.CoinsOperation;
import project.bccryptocoingecko.infra.ApiResponse;
import project.bccryptocoingecko.infra.Syscode;
import project.bccryptocoingecko.model.Coins;
import project.bccryptocoingecko.service.CoinsService;


@RestController
@RequestMapping(value = "/crypto/coingecko/api/v1")
public class CoinsController implements CoinsOperation {

  @Autowired
  private CoinsService coinsService;

  @Override
  public List<Coins> getCoins(String id) {
    if (id == null || id.isEmpty())
      return coinsService.getCoins();
    return coinsService.getCoins(id);
  }

  @Override
  public ApiResponse<List<Coins>> getCoinsResponse(String id) {
    List<Coins> coins = coinsService.getCoins(id);
    return ApiResponse.<List<Coins>>builder() //
        .status(Syscode.OK) //
        .data(coins) //
        .build();
  }

}
