package structural.decorator;

public class HtmlTextBold implements HtmlText {
    private HtmlText htmlText;

    public HtmlTextBold(HtmlText htmlText) {
        this.htmlText = htmlText;
    }

    @Override
    public String getHtml() {
        return "<b>" + htmlText.getHtml() + "</b>";
    }
}
