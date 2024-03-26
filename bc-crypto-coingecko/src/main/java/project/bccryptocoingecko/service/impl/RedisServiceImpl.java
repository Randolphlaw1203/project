// package project.bccryptocoingecko.service.impl;

// import org.springframework.beans.factory.annotation.Autowired;
// import com.fasterxml.jackson.core.JsonProcessingException;
// import project.bccryptocoingecko.infra.RedisHelper;
// import project.bccryptocoingecko.model.Coins;
// import project.bccryptocoingecko.service.RedisService;

// public class RedisServiceImpl implements RedisService {

//   @Autowired
//   private RedisHelper redisHelper;

//   @Override
//   public Coins createCoins(String key, Coins coin)
//       throws JsonProcessingException {
//     redisHelper.set(key, coin);
//     return coin;
//   }

// }
