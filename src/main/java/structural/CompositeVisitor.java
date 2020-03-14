package structural;

import structural.compositevisitor.Composite;

import static structural.compositevisitor.Composite.*;

public class CompositeVisitor {

    private static void match(String s, Composite composite) {
        String regexp = composite.toString();
        boolean matches = s.matches(regexp);
        System.out.println(String.format("'%s' matches '%s' = %b", s, regexp, matches));
    }

    public static void main(String[] args) {
        Composite composite = union(
                star(
                        concatenation(
                                concatenation(
                                        normalChar('a'),
                                        normalChar('b'),
                                        normalChar('c')
                                ),
                                star(concatenation("qwerty"))
                        )
                ),
                union(
                        concatenation(
                                normalChar('b'),
                                anyChar(),
                                normalChar('d')
                        ),
                        concatenation(
                                normalChar('d'),
                                star(anyChar()),
                                normalChar('m')
                        )
                )
        );
        match("abc", composite);
        match("abcqwertyqwertyabc", composite);
        match("bad", composite);
        match("bed", composite);
        match("doom", composite);
        match("downstream", composite);
        match("abcxabc", composite);
        match("apple", composite);
    }
}
