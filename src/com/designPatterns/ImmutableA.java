package com.designPatterns;

public final class ImmutableA {

    private Address address;

    public ImmutableA(Address address){
        this.address = new Address();
        this.address.setCity(address.getCity());
        this.address.setState(address.getState());
        //this.address = address;
    }

    public Address getAddress() {
        Address address = new Address();
        address.setCity(this.address.getCity());
        address.setState(this.address.getState());
        return address;
    }

    public static void main(String[] args) {
        Address address = new Address();
        address.setCity("Lewisville");
        address.setState("TX");
        ImmutableA immutableA = new ImmutableA(address);
        address.setCity("Irving");
        System.out.println(immutableA.getAddress().getCity());// === Lewisville
        immutableA.getAddress().setCity("Coppell");
    }
}
