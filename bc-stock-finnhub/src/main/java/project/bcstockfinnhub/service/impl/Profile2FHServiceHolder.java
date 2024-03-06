package project.bcstockfinnhub.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import project.bcstockfinnhub.infra.BcUtil;
import project.bcstockfinnhub.infra.Scheme;
import project.bcstockfinnhub.model.Profile2;
import project.bcstockfinnhub.service.Profile2Service;

@Service
public class Profile2FHServiceHolder implements Profile2Service {

  @Value("${api.finnhub.domain}")
  private String domain;

  @Value("${api.finnhub.version}")
  private String version;

  @Value("${api.finnhub.endpoints.profile}")
  private String profile;

  @Value("${api.finnhub.endpoints.key}")
  private String key;

  @Autowired
  private RestTemplate restTemplate;

  @Override
  public Profile2 getProfile2(String symbol) throws RestClientException {

    String url =
        BcUtil.getUrl(Scheme.HTTPS, domain, version, profile, symbol, key);
    //System.out.println("url : " + url);
    Profile2 profile2 = restTemplate.getForObject(url, Profile2.class);

    // array -> list
    // return Arrays.stream(quote).collect(Collectors.toList());
    return profile2;
  }

}
