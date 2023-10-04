import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < 3; i++){
                list.add(scanner.nextInt());
            }
            list.sort(Comparator.naturalOrder());
            if (list.get(0) == 0 && list.get(1) == 0 && list.get(2) == 0){
                break;
            }

            if (list.get(2)*list.get(2) == list.get(0)* list.get(0) + list.get(1)* list.get(1)) {
                System.out.println("right");
            }
            else System.out.println("wrong");

        }

    }
}