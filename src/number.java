public class number {
    //Составить алгоритм: если введенное число больше 7, то вывести “Привет”
    public static void hello(int number) {
        if (number > 7) {
            System.out.println("Привет");
        }
    }
    //Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"

    public static void name(String name) {
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
    //Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3

    public static void array() {
        int[] myList = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] % 3 == 0) {
                System.out.println(myList[i]);
            }
        }
    }


}
