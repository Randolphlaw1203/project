package project.bcstockfinnhub.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import project.bcstockfinnhub.model.Profile2;

public interface Profile2Operation {
  @GetMapping(value = "/profile2")
  Profile2 getProfile2(
      @RequestParam(value = "symbol", required = false) String symbol);
}
