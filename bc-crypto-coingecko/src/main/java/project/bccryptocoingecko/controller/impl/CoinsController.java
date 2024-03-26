package project.bccryptocoingecko.controller.impl;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.bccryptocoingecko.controller.CoinsOperation;
import project.bccryptocoingecko.infra.ApiResponse;
import project.bccryptocoingecko.infra.Syscode;
import project.bccryptocoingecko.model.CoinsResp;
import project.bccryptocoingecko.model.Mapper;
import project.bccryptocoingecko.service.CoinsService;


@RestController
@RequestMapping(value = "/crypto/coingecko/api/v1")
public class CoinsController implements CoinsOperation {

  @Autowired
  private CoinsService coinsService;

  @Autowired
  private Mapper mapper;

  @Override
  public ApiResponse<List<CoinsResp>> getCoinsResponse(String id) {
    if (id == null || id.isEmpty()) {
      List<CoinsResp> coins = coinsService.getCoins().stream()//
          .map(e -> mapper.map(e))//
          .collect(Collectors.toList());

      return ApiResponse.<List<CoinsResp>>builder() //
          .status(Syscode.OK) //
          .data(coins) //
          .build();
    }
    List<CoinsResp> coins = coinsService.getCoins(id).stream()//
        .map(e -> mapper.map(e))//
        .collect(Collectors.toList());

    return ApiResponse.<List<CoinsResp>>builder() //
        .status(Syscode.OK) //
        .data(coins) //
        .build();
  }

}
