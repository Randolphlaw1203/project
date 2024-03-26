// package project.bccryptocoingecko.controller.impl;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;
// import com.fasterxml.jackson.core.JsonProcessingException;
// import project.bccryptocoingecko.controller.RedisOperaton;
// import project.bccryptocoingecko.model.Coins;
// import project.bccryptocoingecko.service.RedisService;

// @RestController
// @RequestMapping(value = "/redis/api/v1")
// public class RedisController implements RedisOperaton {

//   @Autowired
//   private RedisService redisService;

//   @Override
//   public Coins createCoins(String key, Coins coin)
//       throws JsonProcessingException {
//     return redisService.createCoins(key, coin);
//   }

// }
