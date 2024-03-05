package project.bcstockfinnhub.service;

import project.bcstockfinnhub.model.Quote;

public interface QuoteService {

  public Quote getQuote(String symbol);

}
