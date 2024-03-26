package project.bccryptocoingecko.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import project.bccryptocoingecko.infra.ApiResponse;
import project.bccryptocoingecko.model.CoinsResp;

public interface CoinsOperation {

  @GetMapping(value = "/coins")
  ApiResponse<List<CoinsResp>> getCoinsResponse(
      @RequestParam(value = "ids", required = false) String id);

}
