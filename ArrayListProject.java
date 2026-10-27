
import java.util.ArrayList;

public class ArrayListProject
{
    public static void main(String[] args)
    {
        // List 1: Names
        ArrayList<String> names = new ArrayList<String>();
        names.add("Alex");                    // 1. add()
        names.add("Bob");
        names.add("Sam");
        System.out.println(names);

        names.add(1, "John");                  // 2. add(index, element)
        System.out.println(names);

        System.out.println(names.get(0));      // 3. get()
        System.out.println(names.size());      // 4. size()
        System.out.println(names.contains("Bob")); // 5. contains()

        names.set(0, "Mike");                  // 6. set()
        System.out.println(names);

        System.out.println(names.indexOf("Sam")); // 7. indexOf()
        System.out.println(names.lastIndexOf("Sam")); // 8. lastIndexOf()
        System.out.println(names.subList(0, 2)); // 9. subList()

        names.remove("Bob");                   // 10. remove(Object)
        System.out.println(names);


        // List 2: Scores
        ArrayList<Integer> scores = new ArrayList<Integer>();
        scores.add(90);
        scores.add(80);
        scores.add(70);
        System.out.println(scores);

        scores.remove(0);                      // 11. remove(index)
        System.out.println(scores);

        System.out.println(scores.isEmpty());  // 12. isEmpty()


        // List 3: Answers
        ArrayList<Boolean> answers = new ArrayList<Boolean>();
        answers.add(true);
        answers.add(false);
        answers.add(true);
        System.out.println(answers);

        Object[] answerArray = answers.toArray(); // 13. toArray()
        System.out.println(answerArray.length);

        answers.clear();                       // 14. clear()
        System.out.println(answers);

      names.ensureCapacity(10); // 15. ensureCapacity()
    }
}
