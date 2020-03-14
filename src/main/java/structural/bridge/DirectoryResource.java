package structural.bridge;

public class DirectoryResource implements Resource {
    private String name;
    private String path;
    private int filesCount;
    private int subDirsCount;

    public DirectoryResource(String name, String path, int filesCount, int subDirsCount) {
        this.name = name;
        this.path = path;
        this.filesCount = filesCount;
        this.subDirsCount = subDirsCount;
    }

    @Override
    public String type() {
        return "Folder";
    }

    @Override
    public String title() {
        return name;
    }

    @Override
    public String icon() {
        return "DIRECTORY ICON";
    }

    @Override
    public String image() {
        return "NO IMAGE";
    }

    @Override
    public String location() {
        return path;
    }

    @Override
    public String description() {
        return "contains: files: " + filesCount + ", dirs: " + subDirsCount;
    }
}
