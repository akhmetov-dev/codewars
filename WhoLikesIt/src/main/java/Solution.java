/*

* Функция с переменным числом аргументов.
* На вход поступает переменное количество имен.
* Требуется в зависимости от количества переданных имен вернуть правильно отформатированную строку.
* Шаблон:
* likes {"Peter"} // must be "Peter likes this"
* likes {"Jacob", "Alex"} // must be "Jacob and Alex like this"
* likes {"Max", "John", "Mark"} // must be "Max, John and Mark like this"
* likes {"Alex", "Jacob", "Mark", "Max"} // must be "Alex, Jacob and 2 others like this"
*
* */
public class Solution {
    public static String whoLikesIt(String... names) {
        int countOfNames = names.length;
        if (countOfNames == 0) {
            return "no one likes this";
        } else if (countOfNames == 1) {
            return names[0] + " likes this";
        } else if (countOfNames == 2) {
            return names[0] + " and " + names[1] + " like this";
        } else if (countOfNames == 3) {
            return names[0] + ", " + names[1] + " and " + names[2] + " like this";
        } else {
            return names[0] + ", " + names[1] + " and " + (countOfNames - 2) + " others like this";
        }
    }
}
