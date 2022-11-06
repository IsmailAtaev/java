package com.task1;

import java.util.Objects;

public class Text {

    private String header;
    private String body = "";

    public Text(){
        super();
    }

    public Text(Word word) {
        this.header = word.getValue();
    }

    public Text(Offer offer) {
        this.header = offer.getOffer();
    }

    public void addWord(Word word) {
        this.body += " " + word.getValue();
    }

    public void addOffer(Offer offer) {
        this.body += " " + offer.getOffer();
    }

    public String getHeader() {
        return header;
    }

    public String getBody() {
        return body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text = (Text) o;
        return Objects.equals(header, text.header) && Objects.equals(body, text.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(header, body);
    }

    @Override
    public String toString() {
        return "Text{" +
                "header='" + header + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}


class MainText{
    public static void main(String[] args) {

        Text text = new Text(new Word("Bmw"));

        Offer offer = new Offer();
        offer.addWord(new Word("Mercedes-Benz"));
        offer.addWord(new Word("Audi"));
        offer.addWord(new Word("Ford"));

        text.addOffer(offer);

        System.out.println("Header " + text.getHeader());
        System.out.println("Body " + text.getBody());

    }
}