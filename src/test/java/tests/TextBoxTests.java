package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {
    @BeforeAll
    static void beforeAll() {

    }

    @Test
    void successfulFillFormTest() {
        open("https://demoqa.com/text-box");
        System.out.println("done");
    }

}
