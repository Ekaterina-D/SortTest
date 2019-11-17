import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {
        int[] myArray = {5, 7, 3, 2, 1};
        cocktailSort(myArray); //вызов метода с передачей массива как параметра
        System.out.println(Arrays.toString(myArray));
    }

    public static void cocktailSort(int[] myArray) {
        boolean swapped;
        do { //цикл с постусловием
            swapped = false;
            //Сдвигаем к концу массива наибольшие числа
            for (int i = 0; i <= myArray.length - 2; i++) { //двигаемся слева направо
                if (myArray[i] > myArray[i + 1]) {
                    // если следующий элемент меньше текущего, меняем их местами
                    int temporary = myArray[i];
                    myArray[i] = myArray[i + 1];
                    myArray[i + 1] = temporary;
                    swapped = true;
                }
            }
            if (!swapped) {
//мы можем выйти из внешнего цикла здесь, если не произошло перестановок
                break;
            }
            swapped = false;
            //Сдвигаем к началу массива наименьшие элементы
            for (int i = myArray.length - 2; i >= 0; i--) {
                if (myArray[i] > myArray[i + 1]) {
                    int temporary = myArray[i];
                    myArray[i] = myArray[i + 1];
                    myArray[i + 1] = temporary;
                    swapped = true;
                }
            }
//если элементы не были поменяны местами, то список сортируется
        } while (swapped);
    }

}

