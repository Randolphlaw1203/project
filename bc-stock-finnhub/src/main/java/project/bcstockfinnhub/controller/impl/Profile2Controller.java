package project.bcstockfinnhub.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.bcstockfinnhub.controller.Profile2Operation;
import project.bcstockfinnhub.model.Profile2;
import project.bcstockfinnhub.service.Profile2Service;

@RestController
@RequestMapping(value = "/stock/finnhub/api/v1")
public class Profile2Controller implements Profile2Operation {

  @Autowired
  private Profile2Service profile2Service;

  @Override
  public Profile2 getProfile2(String symbol) {
    return profile2Service.getProfile2(symbol);
  }
}
