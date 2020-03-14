package structural.bridge;

public class FileResource implements Resource {
    private String name;
    private String extension;
    private String directory;
    private int size;

    public FileResource(String name, String extension, String directory, int size) {
        this.name = name;
        this.extension = extension;
        this.directory = directory;
        this.size = size;
    }

    @Override
    public String type() {
        return "File";
    }

    @Override
    public String title() {
        return name + "." + extension;
    }

    @Override
    public String icon() {
        return "EXTENSION SPECIFIC ICON";
    }

    @Override
    public String image() {
        return "EXTENSION SPECIFIC IMAGE";
    }

    @Override
    public String location() {
        return directory;
    }

    @Override
    public String description() {
        return "size: " + size;
    }
}
