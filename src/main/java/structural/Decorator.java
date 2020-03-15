package structural;

import structural.decorator.*;

public class Decorator {
    public static void main(String[] args) {
        System.out.println("===Default text===");
        HtmlText text = new HtmlTextDefault("hello");
        System.out.println(text.getHtml());
        System.out.println("===Bold decorator===");
        HtmlText bold = new HtmlTextBold(text);
        System.out.println(bold.getHtml());
        System.out.println("===Bold and Italic decorator===");
        HtmlText boldItalic = new HtmlTextItalic(bold);
        System.out.println(boldItalic.getHtml());
        System.out.println("===Capitalized and Bold decorator===");
        HtmlText capitalizedBold = new HtmlTextBold(new HtmlTextCapitalized(text));
        System.out.println(capitalizedBold.getHtml());
    }
}
