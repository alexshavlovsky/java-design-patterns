package creational.abstractfactory.xmlviews;

import creational.abstractfactory.ListView;

import javax.xml.bind.JAXB;
import java.io.StringWriter;
import java.util.List;

public class XmlListView extends ListView {
    XmlListView(List<String> items) {
        super(items);
    }

    @Override
    public String representAsString() {
        StringWriter writer = new StringWriter();
        JAXB.marshal(ListModel.newInstance(items), writer);
        return writer.toString();
    }
}
