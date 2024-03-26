package project.bccryptocoingecko.model;

import org.springframework.stereotype.Component;

@Component
public class Mapper {

  public CoinsResp map(Coins coins) {

    CoinsResp builder = CoinsResp.builder()//
        .id(coins.getId())//
        .symbol(coins.getSymbol())//
        .name(coins.getName())//
        .image(coins.getImage())//
        .currentPrice(coins.getCurrentPrice())//
        .marketCap(coins.getMarketCap())//
        .marketCapRank(coins.getMarketCapRank())//
        .fullyDilutedValuation(coins.getFullyDilutedValuation())//
        .totalVolume(coins.getTotalVolume())//
        .high24h(coins.getHigh24h())//
        .low24h(coins.getLow24h())//
        .priceChange24h(coins.getPriceChange24h())//
        .priceChangePercentage24h(coins.getPriceChangePercentage24h())//
        .marketCapChange24h(coins.getMarketCapChange24h())//
        .marketCapChangePercentage24h(coins.getMarketCapChangePercentage24h())//
        .circulatingSupply(coins.getCirculatingSupply())//
        .totalSupply(coins.getTotalSupply())//
        .maxSupply(coins.getMaxSupply())//
        .ath(coins.getAth())//
        .athChangePercentage(coins.getAthChangePercentage())//
        .athDate(coins.getAthDate())//
        .atl(coins.getAtl())//
        .atlChangePercentage(coins.getAtlChangePercentage())//
        .atlDate(coins.getAtlDate())//
        .lastUpdated(coins.getLastUpdated())//
        .build();

    if (coins.getRoi() != null) {
      builder.setRoi(this.map(coins.getRoi()));
    }

    return builder;
  }

  public CoinsResp.Roi map(Coins.Roi roi) {
    return CoinsResp.Roi.builder()//
        .times(roi.getTimes())//
        .currency(roi.getCurrency())//
        .percentage(roi.getPercentage())//
        .build();
  }
}
