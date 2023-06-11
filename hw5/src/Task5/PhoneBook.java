package Task5;

import java.util.*;
import java.util.stream.Collectors;

public class PhoneBook {
    private Map<String, ArrayList<String>> namesToPhone = new HashMap<>();

    public void addPhone(String name, String phone) {
        ArrayList<String> phones = namesToPhone.get(name);
        phones.add(phone);
    }

    public void fill() {
        namesToPhone.put("Ivanov", new ArrayList<>());
        namesToPhone.put("Petrov", new ArrayList<>());
        namesToPhone.put("Sidorov", new ArrayList<>());

        addPhone("Ivanov", "111");
        addPhone("Petrov", "222");
        addPhone("Petrov", "222");
        addPhone("Sidorov", "333");
        addPhone("Sidorov", "333");
        addPhone("Sidorov", "333");
    }

    public void sort() {
        namesToPhone = namesToPhone
                .entrySet()
                .stream()
                .sorted(new MyComparator())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (k, v) -> {
                            throw new RuntimeException();
                        },
                        LinkedHashMap::new
                ));
    }

    public Map<String, ArrayList<String>> getNamesToPhone() {
        return namesToPhone;
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "namesToPhone=" + namesToPhone +
                '}';
    }
}
