package Lists;

import java.util.*;

public class RenditListen {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);
        //rend zbrites
        //list.sort(Collections.reverseOrder());

        //rend rrites
        Collections.sort(list);

        System.out.println(list);

    }
}
