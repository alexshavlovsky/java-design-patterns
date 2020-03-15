package structural;

import structural.composite.Group;
import structural.composite.Item;
import structural.composite.Leaf;

public class Composite {
    public static void main(String[] args) {
        Group root = new Group("Root");
        Group songs = new Group("Songs");
        Group movies = new Group("Movies");
        root.addItem(songs);
        root.addItem(movies);
        root.addItem(new Leaf(10, "Leaf 1"));
        root.addItem(new Leaf(15, "Leaf 2"));
        root.addItem(new Leaf(4, "Leaf 3"));
        Item song;
        songs.addItem(song = new Leaf(210, "Domino dancing"));
        songs.addItem(new Leaf(110, "Never gonna give you up"));
        Group drama = new Group("Drama");
        drama.addItem(new Leaf(256, "Forrest Gump"));
        drama.addItem(new Leaf(128, "Apocalypse Now"));
        Group comedy = new Group("Comedy");
        comedy.addItem(new Leaf(65, "Groundhog Day"));
        comedy.addItem(new Leaf(89, "Dumb And Dumber"));
        movies.addItem(drama);
        movies.addItem(comedy);
        System.out.println("===The full composite===");
        System.out.print(root);
        System.out.println("===The songs group only===");
        System.out.print(songs);
        System.out.println("===A single leaf===");
        System.out.print(song);
    }
}
