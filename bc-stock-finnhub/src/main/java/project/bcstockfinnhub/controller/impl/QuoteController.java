package project.bcstockfinnhub.controller.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.bcstockfinnhub.controller.QuoteOperation;
import project.bcstockfinnhub.model.Quote;
import project.bcstockfinnhub.service.QuoteService;

@RestController
@RequestMapping(value = "/stock/finnhub/api/v1")
public class QuoteController implements QuoteOperation {

  @Autowired
  private QuoteService quoteService;

  @Override
  public Quote getQuote(String symbol) {
    return quoteService.getQuote(symbol);
  }
}
