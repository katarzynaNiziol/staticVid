package com.company;

public class Main {
        private String firstName;
        private String name;
        private int memberID;
        private static int ID;

        public Main (String firstName, String name) {
            this.firstName = firstName;
            this.name= name;
            this.memberID = ID++;
            System.out.printf("firstName: %s lastName: %s id: %d %n", firstName, name, memberID);
        }
        public static void main (String[] args) {
            Main c1= new Main("Sylwester", "Stallone");
            Main c2= new Main("Robert", "Stry");
            Main c3= new Main("Sylwia", "Mallone");
            Main c4= new Main("Grzegorz", "Wlaź");
            int test = Main.getSomeInt(55);
            System.out.println(test);
        }
        public static int getSomeInt (int a) {
            return ID + a;

        }
}
