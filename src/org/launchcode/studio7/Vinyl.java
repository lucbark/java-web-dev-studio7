package org.launchcode.studio7;

public class Vinyl extends BaseDisk implements Spinnable {
    public Vinyl(double transferRate, String encryptionType, double capacity, String content, double storageUsed) {
        super(transferRate, encryptionType, capacity, content, storageUsed);
    }

    @Override
    public void spinSpeed() {
        System.out.println("45");
    }

    @Override
    public void storesData() {
        System.out.println("not for long");

    }

    @Override
    public void readsData() {
        System.out.println("ya man");

    }

    @Override
    public void deleteData() {
        System.out.println("1 time");

    }
}
