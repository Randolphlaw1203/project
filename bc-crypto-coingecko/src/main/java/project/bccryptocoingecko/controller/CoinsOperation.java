package project.bccryptocoingecko.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import project.bccryptocoingecko.infra.ApiResponse;
import project.bccryptocoingecko.model.Coins;

public interface CoinsOperation {

  @GetMapping(value = "/coins")
  List<Coins> getCoins(
      @RequestParam(value = "ids", required = false) String id);

  ApiResponse<List<Coins>> getCoinsResponse(String id);

}
