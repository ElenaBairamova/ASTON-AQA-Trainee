public class Main {

    public static void main(String[] args) {
        number service = new number();
        number.hello(9);
        number.hello(4);
        number.name("Вячеслав");
        number.name("Serega");
        number.array();
    }

}

// Дана скобочная последовательность: [((())()(())]]
//Одна лишняя закрывающая квадратная скобка, не хватает одной закрывающей скобки в первых трех скобках.
//// Правильно было бы: [((()))()(())]