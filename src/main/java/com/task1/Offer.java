package com.task1;


import java.util.Objects;

/**
 * предложение offer
 *
 *
 * */
public class Offer {

    private String offer = "";

    public Offer() {
        super();
    }

    public Offer(String offer) {
        this.offer = offer;
    }

    public void addWord(Word word) {
        this.offer += " " + word.getValue();
    }

    public String getOffer() {
        return offer;
    }

    public void setOffer(String offer) {
        this.offer = offer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Offer offer1 = (Offer) o;
        return Objects.equals(offer, offer1.offer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offer);
    }

    @Override
    public String toString() {
        return "Offer{" +
                "offer='" + offer + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Offer();
    }
}
