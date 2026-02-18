package tests.examples;


import org.junit.jupiter.api.*;

public class JUnitExampleTests {

    @BeforeAll
    static void startup() {
        System.out.println("Tests startup");
    }

    @AfterAll
    static void teardown() {
        System.out.println("Tests ended");
    }

    @BeforeEach
    void startBrowser() {
        System.out.println("- Browse has started");
    }

    @AfterEach
    void stopBrowser() {
        System.out.println("- Browse has stopped");
    }

    @Test
    void firstTest() {
        System.out.println("- - firstTest");
    }

    @Test
    void secondTest() {
        System.out.println("- - secondTest");
    }
}
