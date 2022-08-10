package client;

import io.qameta.allure.Step;
import io.restassured.response.ValidatableResponse;

import static client.RestAssuredClient.getBaseSpec;
import static endpoints.Endpoints.GET_INGREDIENTS;
import static endpoints.Endpoints.GET_USER_ORDERS;
import static io.restassured.RestAssured.given;

public class GetUserOrders {
    @Step("GET user orders ")
    public static ValidatableResponse getUserOrders(String token){
        return given()
                .spec(getBaseSpec())
                .header("authorization", token)
                .when()
                .get(GET_USER_ORDERS)
                .then();
    }
}
