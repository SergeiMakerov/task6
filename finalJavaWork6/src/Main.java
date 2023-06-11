import hw6.Laptop;

import java.util.*;

public class Main {
    public static void filter(Set<Laptop> laptops) {
        Set<Laptop> selectLaptops = new HashSet<>();
        System.out.println("Здравствуйте");
        System.out.print("Введите цифру для выбора:\n 1 - Бренд \n 2 - цвет \n");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        HashMap<String, Object> filters = new HashMap<>();

        if (num == 1) {
            System.out.println("Введите Бренд");
            String temp = scanner.nextLine();
            filters.put("brand", temp);
        }
        if (num == 2) {
            System.out.println("Введите цвет");
            String temp = scanner.nextLine();
            filters.put("color", temp);
        }

        for (HashMap.Entry<String, Object> entry : filters.entrySet()) {

            if (entry.getKey().equals("brand")) {
                Iterator it = laptops.iterator();
                while (it.hasNext()) {
                    Laptop laptop = (Laptop) it.next();
                    if (laptop.getBrand().equals(entry.getValue())) {
                        selectLaptops.add(laptop);
                    }
                }
            }
            if (entry.getKey().equals("color")) {
                Iterator it = laptops.iterator();
                while (it.hasNext()) {
                    Laptop laptop = (Laptop) it.next();
                    if (laptop.getColor().equals(entry.getValue())) {
                        selectLaptops.add(laptop);
                    }
                }
            }
        }

        Iterator it = selectLaptops.iterator();
        while (it.hasNext()) {
            Laptop laptop = (Laptop) it.next();
            System.out.println(laptop.toString());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Laptop lap1 = new Laptop("MSI", "white");
        Laptop lap2 = new Laptop("MSI", "black");
        Laptop lap3 = new Laptop("ASUS", "white");
        Laptop lap4 = new Laptop("ASUS", "black");
        Laptop lap5 = new Laptop("MACBOOK", "white");
        Laptop lap6 = new Laptop("MACBOOK", "black");
        Laptop lap7 = new Laptop("MACBOOK", "black");

        Set<Laptop> laptops = new HashSet<>();

        laptops.add(lap1);
        laptops.add(lap2);
        laptops.add(lap3);
        laptops.add(lap4);
        laptops.add(lap5);
        laptops.add(lap6);
        laptops.add(lap7);
        System.out.println(laptops);

        filter(laptops);
    }
}

