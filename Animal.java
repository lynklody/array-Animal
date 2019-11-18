import java.util.*;

public class Animal {
    String name;
    String type;
    int num_legs;
    boolean has_fur;

    public Animal(String name, String type, int num_legs, boolean has_fur) {
        this.name = name;
        this.type = type;
        this.num_legs = num_legs;
        this.has_fur = has_fur;
    }

    public String toString() {
        if (this.has_fur) {
            return (this.name + " is " + this.type + ". It has " + this.num_legs + " legs with fur.");
        } else {
            return (this.name + " is " + this.type + ". It has " + this.num_legs + " legs without fur.");
        }
    }
}
