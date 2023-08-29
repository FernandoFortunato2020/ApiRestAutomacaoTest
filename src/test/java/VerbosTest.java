import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

@DisplayName("Testes de API Rest")
public class VerbosTest {
    @Test
    public void testGet() {
        given()
                .when()
                .get("https://jsonplaceholder.typicode.com/users")
                .then()
                .statusCode(200);

    }

    @Test
    public void testPost() {
        given()

                .body("{\n" +
                        "        \"id\": 1,\n" +
                        "        \"name\": \"Fernando Fortunato\",\n" +
                        "        \"username\": \"FerFortunato\",\n" +
                        "        \"email\": \"fernandofortunato@hotmail.com\",\n" +
                        "        \"address\": {\n" +
                        "            \"street\": \"Frederico Maurer\",\n" +
                        "            \"suite\": \"Apt. 208\",\n" +
                        "            \"city\": \"Curitiba\",\n" +
                        "            \"zipcode\": \"81630-020\",\n" +
                        "            \"geo\": {\n" +
                        "                \"lat\": \"-40.7779\",\n" +
                        "                \"lng\": \"80.8886\"\n" +
                        "            }\n" +
                        "        },\n" +
                        "        \"phone\": \"5-123-876-1111 x56442\",\n" +
                        "        \"website\": \"teste.org\",\n" +
                        "        \"company\": {\n" +
                        "            \"name\": \"Parana\",\n" +
                        "            \"catchPhrase\": \"Multi-layered client-server neural-net\",\n" +
                        "            \"bs\": \"harness real-time e-markets\"\n" +
                        "        }\n" +
                        "    }'")
                .when()
                .post("https://jsonplaceholder.typicode.com/users")
                .then()
                .statusCode(201)
                .body("id", equalTo(11));

    }

    @Test
    public void testPut() {
        given()
                .body("{\n" +
                        "        \"id\": 1,\n" +
                        "        \"name\": \"Fernando Fortunato\",\n" +
                        "        \"username\": \"FerFortunato\",\n" +
                        "        \"email\": \"fernandofortunato@hotmail.com\",\n" +
                        "        \"address\": {\n" +
                        "            \"street\": \"Frederico Maurer\",\n" +
                        "            \"suite\": \"Apt. 208\",\n" +
                        "            \"city\": \"Curitiba\",\n" +
                        "            \"zipcode\": \"81630-020\",\n" +
                        "            \"geo\": {\n" +
                        "                \"lat\": \"-40.7779\",\n" +
                        "                \"lng\": \"80.8886\"\n" +
                        "            }\n" +
                        "        },\n" +
                        "        \"phone\": \"5-123-876-1111 x56442\",\n" +
                        "        \"website\": \"teste.org\",\n" +
                        "        \"company\": {\n" +
                        "            \"name\": \"Parana\",\n" +
                        "            \"catchPhrase\": \"Multi-layered client-server neural-net\",\n" +
                        "            \"bs\": \"harness real-time e-markets\"\n" +
                        "        }\n" +
                        "    }'")
                .when()
                .put("https://jsonplaceholder.typicode.com/users")
                .then()
                .statusCode(200)
                .body("id", equalTo(1));
    }

    @Test
    public void testDelete() {
        given()
                .when()
                .delete("https://jsonplaceholder.typicode.com/users")
                .then()
                .statusCode(200);
    }
}
