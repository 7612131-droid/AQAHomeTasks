package aqa_hw_11;

import java.util.Base64;
import static io.restassured.RestAssured.given;
public class TestRailController {
    private static final String RUN_ID = "13";
    private static final String BASE_API_URL = "https://danitschool13group.testrail.io/index.php?/api/v2/";
    private static final String USER_EMAIL = "7612131@gmail.com";
    private static final String USER_PASSWORD = "102938Polina!";
    private static final String CREDENTIALS = Base64.getEncoder().encodeToString((USER_EMAIL + ":" + USER_PASSWORD).getBytes());

    public static void publishResults(int statusId, int testCaseId) {
        given().header("Authorization", "Basic " + CREDENTIALS)
                .contentType("Application/json")
                .body(new TestRailRequestDto(statusId))
                .post(BASE_API_URL + String.format("add_result_for_case/%s/%s", RUN_ID, testCaseId));
    }

}

