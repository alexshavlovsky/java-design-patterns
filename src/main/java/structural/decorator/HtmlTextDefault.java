package structural.decorator;

public class HtmlTextDefault implements HtmlText {
    private String text;

    public HtmlTextDefault(String text) {
        this.text = text;
    }

    @Override
    public String getHtml() {
        return text;
    }
}
