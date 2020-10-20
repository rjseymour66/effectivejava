package edu.rseymour.java.creatinganddestroyingobjects;

/**
 * This is useful when a calls has a few required fields and a number of optional fields.
 * Use Builders when you have 4+ constructor parameters.
 *
 * Instead of making the object directly, the client calls a constructor or static factory
 * with all of the required parameters and gets a builder object. Then, the client calls
 * setter-like methods to add the desired parameters. Finally, the parameterless .build()
 * method is called to return the object, which is usually immutable. The builder is static
 * member class of the class it builds.
 *
 * The following example models a user that is registering on a web page, where some fields are
 * required, but some are not.
 *
 * Check validity of parameters and throw IllegalArgumentException if it is not correct.
 *
 * Builders are useful with class hierarchies. Abstract classes have abstract builders:
 *
 * public abstract class Example
 *     abstract static class Builder<T extends Builder<T>>
 */
public class BuilderWhenManyConstructorParams {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;
    private final int age;
    private final String address;
    private final int aptNumber;
    private final String city;
    private final String state;
    private final int zipCode;

    public static class Builder {
        // required parameters
        private final String firstName;
        private final String lastName;
        private final String email;
        private final String password;

        // optional parameters - initialized to default values
        private int age = 0;
        private String address = "Not applicable";
        private int aptNumber = 0;
        private String city = "Not applicable";
        private String state = "Not applicable";
        private int zipCode = 00000;

        // build with required params
        public Builder(String firstName, String lastName, String email, String password) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.password = password;
        }

        // add optional params as needed
        public Builder age(int val) {
            age = val;
            return this;
        }
        public Builder address(String val) {
            address = val;
            return this;
        }
        public Builder aptNumber(int val) {
            aptNumber = val;
            return this;
        }
        public Builder city(String val) {
            city = val;
            return this;
        }
        public Builder state(String val) {
            state = val;
            return this;
        }
        public Builder zipCode(int val) {
            zipCode = val;
            return this;
        }

        public BuilderWhenManyConstructorParams build() {
            return new BuilderWhenManyConstructorParams(this);
        }
    }

    private BuilderWhenManyConstructorParams(Builder builder) {
        firstName = builder.firstName;
        lastName = builder.lastName;
        email = builder.email;
        password = builder.password;
        age = builder.age;
        address = builder.address;
        aptNumber = builder.aptNumber;
        city = builder.city;
        state = builder.state;
        zipCode = builder.zipCode;
    }

    public static void main(String[] args) {
        // example how to chain builder invocations
        BuilderWhenManyConstructorParams user = new BuilderWhenManyConstructorParams.Builder(
                "roger",
                "miller",
                "email@example.com",
                "password")
                .age(35)
                .city("Boston")
                .state("Massachusetts")
                .build();
    }
}
