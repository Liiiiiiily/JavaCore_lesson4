import java.util.*;

public class Task1 {
    public static void main(String[] args) {

//1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
//Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
// Посчитать, сколько раз встречается каждое слово.

        String[] massive = {"jinx", "vi", "victor", "galio", "galio", "victor", "darius", "shen", "victor","morgana", "shen", "katarina", "vi", "vi", "victor"};
        Set<String> uniqueMassive = new HashSet(Arrays.asList(massive));
        System.out.println("Уникальные значения массива: ");
        System.out.println(uniqueMassive + "\n");
        Map<String, Integer> massiveMap = new HashMap();

        for(int i = 0; i < massive.length; ++i) {
            if (massiveMap.containsKey(massive[i])) {
                massiveMap.put(massive[i], (Integer)massiveMap.get(massive[i]) + 1);
            } else {
                massiveMap.put(massive[i], 1);
            }
        }
        System.out.println("Количество повторений каждого элемента массива: ");
        System.out.println(massiveMap + "\n");
    }
}