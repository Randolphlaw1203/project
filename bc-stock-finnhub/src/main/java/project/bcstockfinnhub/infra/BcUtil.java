package project.bcstockfinnhub.infra;

import org.springframework.web.util.UriComponentsBuilder;

public class BcUtil {

  public static String getUrl(Scheme scheme, String domain, String version,
      String quote, String symbol, String key) {
    return UriComponentsBuilder.newInstance()//
        .scheme(scheme.toLowerCase())//
        .host(domain)//
        .path(version)//
        .path(quote)//
        .replaceQueryParam("symbol", symbol)//
        .replaceQueryParam("token", key)//
        .build(false)//
        .toUriString();
  }
}
