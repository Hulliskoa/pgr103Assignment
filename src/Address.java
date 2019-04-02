public class Address {
    private String street1, street2, city, state, zip;

    public Address(String street1, String city, String state, String zip){
        this.street1 = street1;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    public Address(String street1, String street2, String city, String state, String zip){
        this(street1,city,state,zip);
        this.street2 = street2;

    }

    @Override
    public String toString(){
        if(street2 == null) {
            return "Street: " + street1 + "\n" + "City: " + city + "\n" + "State: " + state + "\n" + "Zip: " + zip;
        }else{
            return "Street: " + street1 + "\n" + street2 + "\n" + "City: " + city + "\n" +"State: " + state + "\n" + "Zip: " + zip;
        }
    }
}
