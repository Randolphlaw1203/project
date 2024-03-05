package project.bcstockfinnhub.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import project.bcstockfinnhub.infra.BcUtil;
import project.bcstockfinnhub.infra.Scheme;
import project.bcstockfinnhub.model.Quote;
import project.bcstockfinnhub.service.QuoteService;

@Service
public class QuoteFHServiceHolder implements QuoteService {

  @Value("${api.finnhub.domain}")
  private String domain;

  @Value("${api.finnhub.version}")
  private String version;

  @Value("${api.finnhub.endpoints.quote}")
  private String quote;

  @Value("${api.finnhub.endpoints.key}")
  private String key;

  @Autowired
  private RestTemplate restTemplate;

  @Override
  public Quote getQuote(String symbol) throws RestClientException {

    String url =
        BcUtil.getUrl(Scheme.HTTPS, domain, version, quote, symbol, key);
    System.out.println("url : " + url);
    Quote quote = restTemplate.getForObject(url, Quote.class);

    // array -> list
   // return Arrays.stream(quote).collect(Collectors.toList());
   return quote;
  }

}
