package project.bccryptocoingecko.infra;

import org.springframework.web.util.UriComponentsBuilder;

public class BcUtil {

  // https://api.coingecko.com/api/v3/coins/markets?vs_currency=usd&x_cg_demo_api_key=CG-yFLXx3AdoAYUF8bxyn6XBUzY
  public static String getUrl(Scheme scheme, String domain, String version,
      String markets, String currency, String key) {
    return UriComponentsBuilder.newInstance()//
        .scheme(scheme.toLowerCase())//
        .host(domain)//
        .path(version)//
        .path(markets)//
        .replaceQueryParam("vs_currency", currency)//
        .replaceQueryParam("x_cg_demo_api_key", key)//
        .build(false)//
        .toUriString();
  }
}
