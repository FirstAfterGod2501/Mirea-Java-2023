import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    }

    public static <T> List<T> arrayToList(T[] array) {

        List<T> list = new ArrayList<>();

        Collections.addAll(list, array);

        return list;
    }

    public static void printFirstFiveElements(String directory) {
        File folder = new File(directory);
        File[] files = folder.listFiles();

        List<String> fileList = new ArrayList<>();

        for (int i = 0; i < files.length && i < 5; i++) {
            fileList.add(files[i].getName());
        }

        System.out.println(fileList);
    }
}