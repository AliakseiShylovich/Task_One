public class Main {
    public static void main(String[] args) {
        int numberOff = 3;                           // хранит число которое необходимо исключить из суммы
        int sum = 0;
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);   // заполняеи массив случайными числами от 0 до 10
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberOff) {
                continue;
            }
            sum = sum + array[i];
        }
        System.out.println();
        System.out.println(sum);
    }
}