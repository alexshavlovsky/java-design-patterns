package abstractfactory.xmlviews;

import javax.xml.bind.annotation.*;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@XmlRootElement(name = "table")
@XmlAccessorType(XmlAccessType.FIELD)
public class TableModel {
    @XmlAnyElement
    private Collection<RowModel> table;

    TableModel() {
    }

    private TableModel(Collection<RowModel> table) {
        this.table = table;
    }

    static TableModel newInstance(List<List<String>> t) {
        return new TableModel(t.stream().map(r -> new RowModel(r.stream().map(CellModel::new)
                .collect(Collectors.toList()))).collect(Collectors.toList()));
    }

    public Collection<RowModel> getTable() {
        return table;
    }

    public void setTable(Collection<RowModel> table) {
        this.table = table;
    }
}

@XmlRootElement(name = "row")
@XmlAccessorType(XmlAccessType.FIELD)
class RowModel {
    @XmlAnyElement
    private Collection<CellModel> row;

    RowModel() {
    }

    RowModel(Collection<CellModel> row) {
        this.row = row;
    }

    public Collection<CellModel> getRow() {
        return row;
    }

    public void setRow(Collection<CellModel> row) {
        this.row = row;
    }
}

@XmlRootElement(name = "cell")
@XmlAccessorType(XmlAccessType.FIELD)
class CellModel {
    @XmlValue
    private String cell;

    CellModel() {
    }

    CellModel(String cell) {
        this.cell = cell;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }
}
