package exercise;

import exercise.annotation.Inspect;
import exercise.model.Address;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        var address = new Address("London", 12345678);

        // BEGIN
        Arrays.stream(address.getClass().getMethods())
                .filter(method -> method.isAnnotationPresent(Inspect.class))
                .forEach(method -> System.out.println(String.format("Method %s returns a value of a type %s", method.getName(), method.getReturnType())));
        // END
    }
}
