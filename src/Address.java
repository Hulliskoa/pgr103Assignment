public class Address {
    private String street1, street2, city, country, zip;

    public Address(String street1, String city, String country, String zip){
        this.street1 = street1;
        this.city = city;
        this.country = country;
        this.zip = zip;
    }
    public Address(String street1, String street2, String city, String country, String zip){
        this(street1,city,country,zip);
        this.street2 = street2;

    }

    @Override
    public String toString(){
        if(street2 == null) {
            return "Street: " + street1 + "\n" + "City: " + city + "\n" + "State: " + country + "\n" + "Zip: " + zip;
        }else{
            return "Street: " + street1 + "\n" + street2 + "\n" + "City: " + city + "\n" +"State: " + country + "\n" + "Zip: " + zip;
        }
    }
}
