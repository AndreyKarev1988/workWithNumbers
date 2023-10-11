import java.util.*;

class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> afterSortList = new ArrayList<>();

        for (int x : intList) {
            if (x <= 0) continue;
            if (x % 2 != 0) continue;
            afterSortList.add(x);
        }
        Collections.sort(afterSortList);
        for (int i : afterSortList) {
            System.out.print(i + "  ");
        }
    }
}