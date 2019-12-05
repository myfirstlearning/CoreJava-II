package com.generics;

public class GroundShippable <U> implements Shippable <U> {
    @Override
    public void Ship(U u) {
        System.out.println("!!!! Ground Shippable Value :" + u);
    }

    public static void main(String[] args) {
        GroundShippable<Integer> groundShippable = new GroundShippable<>();
        groundShippable.Ship(10);
    }
}
