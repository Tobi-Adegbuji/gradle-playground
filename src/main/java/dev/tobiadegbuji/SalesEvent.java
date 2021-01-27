package dev.tobiadegbuji;

import com.google.gson.Gson;

public class SalesEvent {

   private String id, streetAddress, city;

    public SalesEvent(String id, String streetAddress, String city) {
        this.id = id;
        this.streetAddress = streetAddress;
        this.city = city;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "SalesEvent{" +
                "id='" + id + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                '}';
    }


    public static void main(String[] args){
        SalesEvent salesEvent = new SalesEvent("1","232 revre Street","vreve");
        Gson gson = new Gson().newBuilder().create();
        System.out.println(gson.toJson(salesEvent));
    }
}
