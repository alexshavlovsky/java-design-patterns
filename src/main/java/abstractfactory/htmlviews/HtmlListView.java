package abstractfactory.htmlviews;

import abstractfactory.ListView;

import java.util.List;

public class HtmlListView extends ListView {

    HtmlListView(List<String> items) {
        super(items);
    }

    private final String LIST_OT = "<ol>\n";
    private final String LIST_CT = "</ol>";
    private final String ITEM_OT = "<li>";
    private final String ITEM_CT = "</li>\n";

    @Override
    public String representAsString() {
        if (items.size() == 0) return "";
        StringBuilder sb = new StringBuilder(LIST_OT);
        items.forEach(s -> sb.append(ITEM_OT).append(s).append(ITEM_CT));
        sb.append(LIST_CT);
        return sb.toString();
    }
}
