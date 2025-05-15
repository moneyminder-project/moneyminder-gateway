package com.moneyminder.moneymindergateway;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {
        "JWK_SET_URI=http://localhost:18082/.well-known/jwks.json",
        "USERS_URL=http://localhost:18082",
        "EXPENSES_URL=http://localhost:18081",
        "CORS_ALLOWED_ORIGINS=http://localhost:5173,http://localhost:8180"
})
class MoneyMinderGatewayApplicationTests {

    @Test
    void contextLoads() {
    }

}
