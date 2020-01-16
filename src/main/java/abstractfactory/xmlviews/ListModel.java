package abstractfactory.xmlviews;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "list")
@XmlAccessorType(XmlAccessType.FIELD)
class ListModel {
    @XmlElement(name = "item")
    private List<String> list;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    static ListModel newInstance(List<String> list) {
        ListModel listModel = new ListModel();
        listModel.setList(list);
        return listModel;
    }
}
