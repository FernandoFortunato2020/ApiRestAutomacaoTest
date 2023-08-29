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
                .get("https://jsonplaceholder.typicode.com/comments/1")
                .then()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("name", equalTo("id labore ex et quam laborum"))
                .body("email", equalTo("Eliseo@gardner.biz"));
    }

    @Test
    public void testPost() {
        given()
                .body("{\"userId\":\"11\",\"id\":\"101\",\"title\": \"Post Post Post \",\"body\": \"Very Good today Post\"}")
                .when()
                .post("https://jsonplaceholder.typicode.com/posts")
                .then()
                .statusCode(201)
                .body("id", equalTo(101));

    }

    @Test
    public void testPut() {
        given()
                .body("{\"title\": \"Put Put Put\",\"body\": \"Very Good today Put\"}")
                .when()
                .put("http://jsonplaceholder.typicode.com/posts/1")
                .then()
                .statusCode(200)
                .body("id", equalTo(1));
    }

    @Test
    public void testDelete() {
        given()
                .when()
                .delete("https://jsonplaceholder.typicode.com/posts/100")
                .then()
                .statusCode(200);
    }
}
