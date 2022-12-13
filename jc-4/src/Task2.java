public class Task2 {

public static void main(String[] args) {
    telephoneBook phoneBook = new telephoneBook();
        phoneBook.add("Jane", "999999999");
        phoneBook.add("Doe", "88888888");
        phoneBook.add("Sam", "7777777");
        phoneBook.add("Will", "333");
        phoneBook.add("Rock", "4444");
        phoneBook.add("You", "22");
        phoneBook.add("Chang", "1");
        phoneBook.add("Chun", "666666");
        phoneBook.add("Chin", "55555");

        System.out.println(phoneBook.get("Rock"));
        System.out.println(phoneBook.get("Chang"));
        System.out.println(phoneBook.get("Chin"));
        System.out.println(phoneBook.get("Sam"));
        }
        }