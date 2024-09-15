package Q2;

class Address {
    private String city;
    private String street;

    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }
}

class Person {
    private String name;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
}


public class Association {
    public static void main(String[] args) {
        Address address = new Address("New York", "Wall Street");
        Person person = new Person("John", address);

        System.out.println("Name: " + person.getName());
        System.out.println("City: " + person.getAddress().getCity());
        System.out.println("Street: " + person.getAddress().getStreet());
    }
}
