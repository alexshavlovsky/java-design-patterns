package structural.decorator;

public class HtmlTextCapitalized implements HtmlText {
    private HtmlText htmlText;

    public HtmlTextCapitalized(HtmlText htmlText) {
        this.htmlText = htmlText;
    }

    @Override
    public String getHtml() {
        return htmlText.getHtml().toUpperCase();
    }
}
