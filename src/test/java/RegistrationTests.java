import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

//@Epic("User Management")
@Feature("User Registration")
@DisplayName("Registration test")
public class RegistrationTests  {


    @Test
    @Story("Register with valid credentials")
    @DisplayName("register user")
    public void successfulRegistration() {
        System.out.println("Registration successful");
    }

    @Test
    @Story("Register with invalid credentials")
    @DisplayName("register with invalid credentials")
    public void failedRegistration() {
        System.out.println("Registration failed");
    }
}
