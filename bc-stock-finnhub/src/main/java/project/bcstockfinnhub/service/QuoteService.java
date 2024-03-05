package project.bcstockfinnhub.service;

import java.util.List;
import project.bcstockfinnhub.model.Quote;

public interface QuoteService {

  public Quote getQuote(String symbol);

}
