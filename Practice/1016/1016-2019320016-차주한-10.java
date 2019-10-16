package io.github.hanchaa;

public class Book {
    String title;
    String author;

    public Book(String t){
        title = t;
        author = "작자미상";
    }

    public Book(String t, String a){
        title = t;
        author = a;
    }

    public static void main(String[] args) {
        Book loveStory = new Book("춘향전");
        Book littlePrince = new Book("어린왕자","생텍쥐페리");

        System.out.println(littlePrince.title + ":" + littlePrince.author);
        System.out.println(loveStory.title + ":" + loveStory.author);
    }
}
