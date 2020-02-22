package compositevisitor;

import java.util.Arrays;

public abstract class Composite {
    private static String OPERATORS = "()*|";
    private static Character ANY_CHAR = '.';
    private Composite parent = null;

    int getParentPrecedence() {
        return parent == null ? 0 : parent.getPrecedence();
    }

    void applyParent(Composite... children) {
        Arrays.stream(children).forEach(child -> child.parent = this);
    }

    static boolean isOperator(Character c) {
        return OPERATORS.contains(c.toString());
    }

    static boolean isAnyChar(Character c) {
        return c == ANY_CHAR;
    }

    private static boolean isChar(Character c) {
        return !isOperator(c);
    }

    private static Composite fromChar(Character c) {
        if (!isChar(c)) throw new AssertionError("Not a char");
        return isAnyChar(c) ? new AnyChar() : new NormalChar(c);
    }

    public abstract void acceptVisitor(Visitor visitor);

    int getPrecedence() {
        return 0;
    }

    @Override
    public String toString() {
        return ToStringVisitor.toString(this);
    }

    public static Empty empty() {
        return new Empty();
    }

    public static AnyChar anyChar() {
        return new AnyChar();
    }

    public static NormalChar normalChar(char e) {
        return new NormalChar(e);
    }

    public static Concatenation concatenation(Composite... arr) {
        return new Concatenation(arr);
    }

    public static Concatenation concatenation(String s) {
        return new Concatenation(s.codePoints().mapToObj(i -> fromChar((char) i)).toArray(Composite[]::new));
    }

    public static Star star(Composite composite) {
        return new Star(composite);
    }

    public static Union union(Composite e1, Composite e2) {
        return new Union(e1, e2);
    }

}
