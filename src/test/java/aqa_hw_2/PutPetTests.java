package aqa_hw_2;


import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PutPetTests {

    @Test
    public void verifyPetCanBeModified() {
        int newPetId = 777;
        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setName("Doberman");
        String newPetName = "Sharik";
        String status = "available";

        PetDto newPetCreated = new PetDto(newPetId, categoryDto, newPetName, status);

        Response newPetCreatedResponse = given()
                .contentType("application/json")
                .body(newPetCreated)
                .post("https://petstore.swagger.io/v2/pet");

        PetDto postResponseDto = newPetCreatedResponse.as(PetDto.class);
        Assert.assertEquals(newPetId, postResponseDto.getId());

        int actualId = postResponseDto.getId();

        Response checkNewPet = given().get("https://petstore.swagger.io/v2/pet/" + actualId);

        System.out.println(checkNewPet.asPrettyString());

        PetDto changePetCreated = new PetDto();
        changePetCreated.setId(actualId);
        changePetCreated.setName("Bobik");
        changePetCreated.setStatus("sold");
        CategoryDto categoryDto1 = new CategoryDto();
        categoryDto1.setName("shpithz");
        changePetCreated.setCategory(categoryDto1);

        Response updateNewPet = given()
                .contentType("application/json")
                .body(changePetCreated)
                .put("https://petstore.swagger.io/v2/pet");

        System.out.println(updateNewPet.asPrettyString());


    }


}
