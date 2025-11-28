
public class ForEachLoop {
    public static void main(String[] args) {
        String[] array = new String[]{"Ram", "Shyam", "Mohan", "Sohan", "Seeta", "Geeta"};

        printArray(array);
    }

    public static void printArray(String[] array) {
        for (String element : array) {
            System.out.println(element);
        }
    }
}
