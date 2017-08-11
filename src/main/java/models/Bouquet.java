package models;

import java.util.ArrayList;

public class Bouquet {
    private String flower1;
    private String flower2;
    private String flower3;
    private String flower4;

    private static ArrayList<Bouquet> allFlowers = new ArrayList<Bouquet>();

    public Bouquet(String flower1, String flower2, String flower3, String flower4) {
        this.flower1 = flower1;
        this.flower2 = flower2;
        this.flower3 = flower3;
        this.flower4 = flower4;
        allFlowers.add(this);
    }



    /// getters ///
    public String getFlower1() {
        return flower1;
    }

    public String getFlower2() {
        return flower2;
    }

    public String getFlower3() {
        return flower3;
    }

    public String getFlower4() {
        return flower4;
    }

    public static ArrayList<Bouquet> getAllFlowers() {
        return allFlowers;
    }
    ////////////////
}