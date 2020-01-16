package abstractfactory.xmlviews;

import abstractfactory.TableView;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;
import java.util.List;

public class XmlTableView extends TableView {
    XmlTableView(List<List<String>> cells) {
        super(cells);
    }

    @Override
    public String representAsString() {
        try {
            JAXBContext context = JAXBContext.newInstance(TableModel.class, RowModel.class, CellModel.class);
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            StringWriter writer = new StringWriter();
            m.marshal(TableModel.newInstance(cells), writer);
            return writer.toString();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return "";
    }
}
