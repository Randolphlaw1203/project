package project.bcstockfinnhub.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import project.bcstockfinnhub.model.Quote;

public interface QuoteOperation {

  @GetMapping(value = "/quote")
  Quote getQuote(
      @RequestParam(value = "symbol", required = false) String symbol);

}
