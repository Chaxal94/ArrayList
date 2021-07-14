import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Awerde3t");
        words.add("Chhargxa");
        words.add("tahrtrit");
        words.add("tgrnit");
        words.add("llkolk");

        Iterator<String> it = words.iterator();
        while (it.hasNext()) {
            String next = it.next();
            System.out.println(next);

        }
        System.out.println("+++++");

        for (int i = words.size()-1;i>=0;i--){
            System.out.println(words.get(i));
        }


        }

            }
















