import java.util.Scanner;

import net.salesianos.utils.StringSmartList;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        StringSmartList stringList = new StringSmartList();
        stringList.add("Hola");
        stringList.add("Que tal?");
        stringList.add("Que tal?");
        stringList.add("Todo bien");

        stringList.display();
        
        stringList.remove("Que tal?");
        stringList.display();

    }
}
