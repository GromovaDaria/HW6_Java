/** Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
* Создать множество ноутбуков.
* Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
* отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
* “Введите цифру, соответствующую необходимому критерию:
* 1 - ОЗУ
* 2 - Объем HHD или SSD
* 3 - Операционная система
* 4 - Цвет …
* Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
* Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        HashSet<Notebooks> notebooks = new HashSet<>();
        notebooks.add(new Notebooks(0, 256, 8, 15, "Windows 11 Home", "green", "Lenovo"));
        notebooks.add(new Notebooks(1, 512, 8, 16, "DOS", "silver", "HP"));
        notebooks.add(new Notebooks(2, 512, 8, 16, "DOS", "silver", "HP"));
        notebooks.add(new Notebooks(3, 256, 8, 13, "macOS", "gray", "Apple MacBook"));
        notebooks.add(new Notebooks(4, 512, 16, 16, "DOS", "black", "Asus"));
        Filter(userRequest(), notebooks);

    }

    public static HashMap<String, String> userRequest() {
        HashMap<String, String> userRequest = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите параметры для поиска: ");
        System.out.print("Введите тип ОС:");
        userRequest.put("operatingSystem", scanner.nextLine());
        System.out.print("Введите цвет корпуса:");
        userRequest.put("color", scanner.nextLine());
        System.out.print("Введите производителя:");
        userRequest.put("brand", scanner.nextLine());
        System.out.print("Введите минимальный объем жесткого диска:");
        userRequest.put("capacityHardDrive", scanner.nextLine());
        System.out.print("Введите минимальный объем оперативной памяти:");
        userRequest.put("capacityRam", scanner.nextLine());
        System.out.print("Введите минимальную диагональ дисплея:");
        userRequest.put("diagonal", scanner.nextLine());
        scanner.close();
        return userRequest;
    }

    public static void Filter(HashMap<String, String> userRequest, HashSet<Notebooks> catalog) {
        Boolean flag = true;
        for (Notebooks nb : catalog) {
            if (userRequest.get("brand").equals(nb.getBrand()) || userRequest.get("brand") == "") {
                if (userRequest.get("color").equals(nb.getBrand()) || userRequest.get("color") == "") {
                    if (userRequest.get("operatingSystem").equals(nb.getBrand())
                            || userRequest.get("operatingSystem") == "") {
                        if (nb.getDisplSize() >= Integer.parseInt(userRequest.get("diagonal")) &&
                                (nb.getHDDvolume() >= Integer.parseInt(userRequest.get("capacityHardDrive"))) &&
                                (nb.getRAMvolume() >= Integer.parseInt(userRequest.get("capacityRam")))) {
                            System.out.println(nb);
                            flag = false;

                        }
                    }
                }
            }

        }
        if (!flag) {
            System.out.println("По вашему запросу ничего не найдено.");
        }
    }
}