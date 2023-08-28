package com.workintech.stack.model;

import java.util.Objects;

public class Text {
    private String text;

    public Text(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
    public boolean isPalindom(){
        String[] word=text.split(" ");
        text=text.replace(".", "")
                .replace(",", "")
                .replace("!", "")
                .trim().toLowerCase();

        StringBuilder reversed = new StringBuilder();


            for (int i = text.length() - 1; i >= 0; i--) {
                reversed.append(text.charAt(i));
            }
        String reversedNoSing=reversed.toString().replace("?", "");
        System.out.println(reversedNoSing);
        System.out.println(text.replace("?",""));
            if(reversedNoSing.equals(text.replace("?", ""))){
                return true;
        }   else return  false;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text1 = (Text) o;
        return Objects.equals(text, text1.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }

    @Override
    public String toString() {
        StringBuilder builder=new StringBuilder();
        builder.append(text);
        return  "Text: " + builder.toString();
    }
}
