import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class telephoneBook {
    private Map<String, List<String>> telephoneBook = new HashMap<>();
    private List<String> telephoneNumberList;

    public void add(String surname, String telephoneNumber) {
        if(telephoneBook.containsKey(surname)) {
            telephoneNumberList = telephoneBook.get(surname);
            telephoneNumberList.add(telephoneNumber);
            telephoneBook.put(surname, telephoneNumberList);
        } else {
            telephoneNumberList = new ArrayList<>();
            telephoneNumberList.add(telephoneNumber);
            telephoneBook.put(surname, telephoneNumberList);
        }
    }

    public List<String> get(String surname) {
        return telephoneBook.get(surname);
    }

}