package org.launchcode.studio7;

public class Main {


    public static void main(String[] args){



        // TODO: Declare and initialize a CD and a DVD object.
        CD myCD = new CD(100, "WPA", 1000, "Music", 50);
        DVD myDVD = new DVD(800, "WPA2", 10000, "Jaws", 500);
        Vinyl myVinyl = new Vinyl(45, "none", 45, "One Love", 45);
        // TODO: Call each CD and DVD method to verify that they work as expected.

        myCD.deleteData();
        myCD.readsData();
        myCD.spinSpeed();
        myCD.storesData();

        myDVD.deleteData();
        myDVD.readsData();
        myDVD.spinSpeed();
        myDVD.storesData();

        myVinyl.deleteData();
        myVinyl.readsData();
        myVinyl.spinSpeed();
        myVinyl.storesData();
    }
}
