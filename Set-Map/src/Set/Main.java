package Set;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Pride and Prejudice");
        ArrayList<String> words1 = new ArrayList<>();
        FileOperation.readFile("pride-and-prejudice.txt", words1);
        System.out.println("Total words: " + words1.size());

        LinkedListSet<String> set1= new LinkedListSet<String>();
        for (String word : words1) {
            set1.add(word);
        }
        System.out.println("Total different words: " + set1.getSize());

    }
}