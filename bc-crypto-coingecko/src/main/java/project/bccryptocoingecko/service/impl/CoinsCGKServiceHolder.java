package project.bccryptocoingecko.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import project.bccryptocoingecko.infra.BcUtil;
import project.bccryptocoingecko.infra.Scheme;
import project.bccryptocoingecko.model.Coins;
import project.bccryptocoingecko.service.CoinsService;

@Service
public class CoinsCGKServiceHolder implements CoinsService {

  @Value("${api.coingecko.domain}")
  private String domain;

  @Value("${api.coingecko.version}")
  private String version;

  @Value("${api.coingecko.endpoints.markets}")
  private String markets;

  @Value("${api.coingecko.endpoints.currency}")
  private String currency;

  @Value("${api.coingecko.endpoints.key}")
  private String key;

  @Autowired
  private RestTemplate restTemplate;

  @Override
  public List<Coins> getCoins(String id) throws RestClientException {
  // RestTemplate restTemplate = new RestTemplate();
  // call API
  // 1. invoke jsonplaceholder.typicode.com/users
  // 2. deserialization (From JSON String to Java Object)
  //String url =
  //BcUtil.getUrl(Scheme.HTTPS, domain, version, markets, currency, key)+ "&ids=" + id;
  String url =
  BcUtil.getUrl(Scheme.HTTPS, domain, version, markets, currency, key);
  //System.out.println("url : " + url);
  Coins[] coins = restTemplate.getForObject(url, Coins[].class);

  // array -> list
  //return Arrays.asList(coins);

  return Arrays.stream(coins).filter(e->e.getId().equals(id)).collect(Collectors.toList());
  }

  @Override
  public List<Coins> getCoins() throws RestClientException {
  // RestTemplate restTemplate = new RestTemplate();
  // call API
  // 1. invoke jsonplaceholder.typicode.com/users
  // 2. deserialization (From JSON String to Java Object)
  String url =
  BcUtil.getUrl(Scheme.HTTPS, domain, version, markets, currency, key);
  //System.out.println("url : " + url);
  Coins[] coins = restTemplate.getForObject(url, Coins[].class);

  // array -> list
  return Arrays.stream(coins)
  .collect(Collectors.toList());
  }

}
