package aqa_hw_2;

import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PetNotFoundTests {
    @Test
    public void errorMessagePet() {

        Response response = given().get("https://petstore.swagger.io/v2/pet/333333333333");
        Assert.assertEquals(404, response.getStatusCode());

        NotFoundPetDto actualError = response.as(NotFoundPetDto.class);
        Assert.assertEquals("Pet not found", actualError.getMessage());

    }

    @Test
    public void deleteErrorPet() {

        Response responseDeletePet = given().delete("https://petstore.swagger.io/v2/pet/333333333333");
        Assert.assertEquals(404, responseDeletePet.getStatusCode());

    }
}
