package structural;

import structural.bridge.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Bridge {
    public static void main(String[] args) {
        List<Resource> currentFolderResources = new ArrayList<>();
        currentFolderResources.add(new DirectoryResource("My pictures", "c:\\My files\\", 10, 0));
        currentFolderResources.add(new DirectoryResource("My documents", "c:\\My files\\", 3, 7));
        currentFolderResources.add(new FileResource("song1", "mp3", "c:\\My files\\", 6_000_000));
        currentFolderResources.add(new FileResource("song2", "mp3", "c:\\My files\\", 5_000_000));

        List<Representation> shortRepresentation = currentFolderResources.stream().map(ShortView::new).collect(Collectors.toList());
        List<Representation> detailedRepresentation = currentFolderResources.stream().map(DetailedView::new).collect(Collectors.toList());
        List<Representation> fullRepresentation = currentFolderResources.stream().map(FullView::new).collect(Collectors.toList());

        System.out.println("===Short representation===");
        shortRepresentation.stream().map(Representation::show).forEach(System.out::println);

        System.out.println("===Detailed representation===");
        detailedRepresentation.stream().map(Representation::show).forEach(System.out::println);

        System.out.println("===Full representation===");
        fullRepresentation.stream().map(Representation::show).forEach(System.out::println);
    }

}
