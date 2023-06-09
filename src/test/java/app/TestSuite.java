package app;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CarritoTest.class })
public class TestSuite {

    public static void main(String[] args) {
        System.out.println("Ejecutando la suite de pruebas...");

        Result result = JUnitCore.runClasses(TestSuite.class);

        if (result.wasSuccessful()) {
            System.out.println("Todas las pruebas pasaron exitosamente.");
        } else {
            System.out.println("Algunas pruebas fallaron. Detalles:");

            for (Failure failure : result.getFailures()) {
                System.out.println(failure.toString());
            }
        }
    }
}