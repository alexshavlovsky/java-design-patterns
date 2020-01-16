package abstractfactory.htmlviews;

import abstractfactory.TableView;

import java.util.List;

public class HtmlTableView extends TableView {

    HtmlTableView(List<List<String>> cells) {
        super(cells);
    }

    private final String TABLE_OT = "<table>\n";
    private final String TABLE_CT = "</table>";
    private final String ROW_OT = "\t<tr>";
    private final String ROW_CT = "</tr>\n";
    private final String CELL_OT = "<td>";
    private final String CELL_CT = "</td>";

    @Override
    public String representAsString() {
        if (cells.size() == 0) return "";
        StringBuilder sb = new StringBuilder(TABLE_OT);
        cells.forEach(row -> {
            sb.append(ROW_OT);
            row.forEach(cell -> sb.append(CELL_OT).append(cell).append(CELL_CT));
            sb.append(ROW_CT);
        });
        sb.append(TABLE_CT);
        return sb.toString();
    }
}
