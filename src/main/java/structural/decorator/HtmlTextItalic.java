package structural.decorator;

public class HtmlTextItalic implements HtmlText {
    private HtmlText htmlText;

    public HtmlTextItalic(HtmlText htmlText) {
        this.htmlText = htmlText;
    }

    @Override
    public String getHtml() {
        return "<i>" + htmlText.getHtml() + "</i>";
    }
}
