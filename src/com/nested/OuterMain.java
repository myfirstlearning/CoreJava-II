package com.nested;

public class OuterMain {

    private int x = 10;

    public class Inner{

        private int x = 20;

        public void printer(int x){
            System.out.println(x);
            System.out.println(this.x);
            System.out.println(OuterMain.this.x);
        }
    }

    public static void main(String[] args) {

        OuterMain outerMain = new OuterMain();
        Inner inner = outerMain.new Inner();
        inner.printer(100);


    }

}
