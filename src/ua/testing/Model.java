package ua.testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * <h1>Arrays MVC Pattern</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-06
 */
public class Model {
    private int[] numberArray;
    private int lengthArray;
    private int minBoundary;
    private int maxBoundary;

    public int getLengthArray() {
        return lengthArray;
    }

    public void setLengthArray(int lengthArray) {
        this.lengthArray = lengthArray;
        numberArray = new int[lengthArray];
    }

    public int[] getNumberArray() {
        return numberArray;
    }

    public int getMinBoundary() {
        return minBoundary;
    }

    public void setMinBoundary(int minBoundary) {
        this.minBoundary = minBoundary;
    }

    public int getMaxBoundary() {
        return maxBoundary;
    }

    public void setMaxBoundary(int maxBoundary) {
        this.maxBoundary = maxBoundary;
    }

    public void setArrayElements() {
        Random random = new Random();
        for (int i = 0; i < this.getLengthArray(); i++) {
            getNumberArray()[i] = random.nextInt(getMaxBoundary() - getMinBoundary() + 1) + getMinBoundary();
        }
    }

    public void getArrayToString(int[] Array) {
        System.out.println(Arrays.toString(Array));
    }

    //        Желательно уметь написать любую задачу из нижеприведенных на листке бумаги (в блокноте) без ошибок
    //        Найти сумму элементов массива
    public int getSumArrayElements() {
        int sum = 0;
        Random random = new Random();
        for (int i = 0; i < this.getLengthArray(); i++) {
            sum += getNumberArray()[i];
        }
        return sum;
    }

    //        Найти максимальный элемент, значение и индекс
    public ArrayList<Integer> getMaxArrayElement() {
        int valueMax = Integer.MAX_VALUE + 1;
        int indexMax = 0;
        for (int i = 0; i < getLengthArray(); i++) {
            if (getNumberArray()[i] > valueMax) {
                valueMax = getNumberArray()[i];
                indexMax = i;
            }
        }
        ArrayList<Integer> max = new ArrayList<Integer>();
        max.add(valueMax);
        max.add(indexMax);
        return max;
    }

    //        Найти минимальный элемент, значение и индекс
    public ArrayList<Integer> getMinArrayElement() {
        int valueMin = Integer.MAX_VALUE;
        int indexMin = 0;
        for (int i = 0; i < getLengthArray(); i++) {
            if (getNumberArray()[i] < valueMin) {
                valueMin = getNumberArray()[i];
                indexMin = i;
            }
        }
        ArrayList<Integer> max = new ArrayList<Integer>();
        max.add(valueMin);
        max.add(indexMin);
        return max;
    }

    //        Найти среднее значение элементов массива
    public float getAverageArrayElements() {
        int sum = 0;
        for (int i = 0; i < getLengthArray(); i++) {
            sum += getNumberArray()[i];
        }
        if (getLengthArray() != 0) {
            return (float) sum / getLengthArray();
        }
        return 0;
    }

    //        Посчитать количество элементов, равных заданному
    public int getCountOfArrayElementsEqualToValue(int value) {
        int count = 0;
        for (int i = 0; i < getLengthArray(); i++) {
            if (getNumberArray()[i] == value) {
                count++;
            }
        }
        return count;
    }

    //        Посчитать количество элементов больше нуля
    public int getCountOfArrayElementsMoreThanZero() {
        int count = 0;
        for (int i = 0; i < getLengthArray(); i++) {
            if (getNumberArray()[i] > 0) {
                count++;
            }
        }
        return count;
    }

    //        Помножить элементы массива на число
    public void multiplyArrayElementsByNumber(int value) {
        for (int i = 0; i < getLengthArray(); i++) {
            getNumberArray()[i] *= value;
        }
    }

    //        Прибавить к элементам массива их индекс
    public void addIndexToArrayElements() {
        for (int i = 0; i < getLengthArray(); i++) {
            getNumberArray()[i] += i;
        }
    }

    //        Обнулить четные по значению элементы массива
    public void setZeroToEvenInValueArrayElements() {
        for (int i = 0; i < getLengthArray(); i++) {
            if (getNumberArray()[i] % 2 == 0) {
                getNumberArray()[i] = 0;
            }
        }
    }

    //        Обнулить элементы с нечетным индексом
    public void setZeroToOddIndexArrayElements() {
        for (int i = 0; i < getLengthArray(); i++) {
            if (i % 2 != 0) {
                getNumberArray()[i] = 0;
            }
        }
    }

    //        Найти первый положительный элемент
    public int getFirstPositiveArrayElement() {
        int elem = -1;
        for (int i = 0; i < getLengthArray(); i++) {
            if (getNumberArray()[i] > 0) {
                elem = getNumberArray()[i];
                break;
            }
        }
        return elem;
    }

    //        Найти последний отрицательный элемент
    public int getLastNegativeArrayElement() {
        int elem = 1;
        for (int i = getLengthArray() - 1; i >= 0; i--) {
            if (getNumberArray()[i] < 0) {
                elem = getNumberArray()[i];
                break;
            }
        }
        return elem;
    }

    //        Найти индексы вхождения элемента в массив
    public ArrayList<Integer> getIndexesOfOccurrenceOfElementInArray(int value) {
        ArrayList<Integer> indexes = new ArrayList<Integer>();
        for (int i = 0; i < getLengthArray(); i++) {
            if (getNumberArray()[i] == value) {
                indexes.add(i);
            }
        }
        return indexes;
    }

    //        Проверить массив на упорядоченность элементов по возрастанию
    public boolean checkArrayForSortAscOrder(int[] Array) {
        for (int i = 0; i < Array.length - 1; i++) {
            if (Array[i] > Array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    //        Проверить массив на упорядоченность элементов по убыванию
    public boolean checkArrayForSortDescOrder() {
        for (int i = 0; i < getLengthArray() - 1; i++) {
            if (getNumberArray()[i] < getNumberArray()[i + 1]) {
                return false;
            }
        }
        return true;
    }

    //        Циклический сдвиг элементов массива на k-позиций вправо
    public void cyclicShiftOfArrayElementsToTheRight(int countPos) {
        for (int i = 0; i < countPos; i++) {
            int temp = getNumberArray()[getLengthArray() - 1];
            for (int j = getLengthArray() - 1; j > 0; j--) {
                getNumberArray()[j] = getNumberArray()[j - 1];
            }
            getNumberArray()[0] = temp;
        }
    }

    //        Вывести элементы, значения которых равны значениям других элементов
    public ArrayList<Integer> getDuplicateArrayElements() {
        ArrayList<Integer> duplicates = new ArrayList<Integer>();
        for (int i = 0; i < getLengthArray() - 1; i++) {
            for (int j = i + 1; j < getLengthArray(); j++) {
                if ((getNumberArray()[i] == getNumberArray()[j]) && (!duplicates.contains(getNumberArray()[i]))) {
                    duplicates.add(getNumberArray()[i]);
                }
            }
        }
        return duplicates;
    }

    //        Найти количество элементов, больших среднего значения
    public int getCountOfArrayElementsMoreThanAverage() {
        int count = 0;
        float average = getAverageArrayElements();
        for (int i = 0; i < getLengthArray(); i++) {
            if (getNumberArray()[i] > average) {
                count++;
            }
        }
        return count;
    }

    //        Вывести элементы, значения которых не равны значениям других элементов
    public ArrayList<Integer> getUniqueArrayElements() {
        ArrayList<Integer> uniqueElements = new ArrayList<Integer>();
        boolean uniqueElement;
        for (int i = 0; i < getLengthArray() - 1; i++) {
            uniqueElement = true;
            for (int j = 0; j < i; j++) {
                if (getNumberArray()[i] == getNumberArray()[j]) {
                    uniqueElement = false;
                    break;
                }
            }
            for (int k = i + 1; k < getLengthArray(); k++) {
                if (getNumberArray()[i] == getNumberArray()[k]) {
                    uniqueElement = false;
                    break;
                }
            }
            if (uniqueElement) {
                uniqueElements.add(getNumberArray()[i]);
            }
        }
        return uniqueElements;
    }

    //        Вывести элементы одного массива, которые не равны элементам второго массива
    public ArrayList<Integer> getUniqueArrayElementsComparedToTheSecondArray(int[] secondArray) {
        ArrayList<Integer> uniqueElements = new ArrayList<Integer>();
        boolean uniqueElement;
        for (int i = 0; i < getLengthArray(); i++) {
            uniqueElement = true;
            for (int j = 0; j < secondArray.length; j++) {
                if (getNumberArray()[i] == secondArray[j]) {
                    uniqueElement = false;
                    break;
                }
            }
            if (uniqueElement) {
                uniqueElements.add(getNumberArray()[i]);
            }
        }
        return uniqueElements;
    }

    //        Посчитать, сколько элементов в массиве с таким же значением, как и первый
    public int getCountArrayElementsEqualToTheFirstElement() {
        int count = 0;
        for (int i = 1; i < getLengthArray(); i++) {
            if (getNumberArray()[i] == getNumberArray()[0]) {
                count++;
            }
        }
        return count;
    }

    public void SortArrayWithChecking(int[] Array) {
        if (!checkArrayForSortAscOrder(Array)) {
            Arrays.sort(Array);
        }
    }

    //        Из двух отсортированных массивов сделать третий отсортированный, не сортируя его
    public int[] getSortedArrayByConcatTwoSortedArrays(int[] secondArray) {
        int[] resultArray = new int[getLengthArray() + secondArray.length];
        SortArrayWithChecking(getNumberArray());
        SortArrayWithChecking(secondArray);
        int k = 0;
        for (int i = 0; i < getLengthArray(); i++) {
            for (int j = k; j < secondArray.length; j++) {
                if (secondArray[j] <= getNumberArray()[i]) {
                    resultArray[k] = secondArray[j];
                    k++;
                } else break;
            }
            resultArray[k] = getNumberArray()[i];
            k++;
        }
        return resultArray;
    }

    //        Поменять первый положительный элемент с последним положительным, второй с предпоследним и т.д.
    public void SwapPositiveArrayElements() {
        int j = 0;
        int k = getLengthArray() - 1;
        for (int i = 0; i < getLengthArray(); i++) {
            if (getNumberArray()[i] <= 0) {
                continue;
            }
            for (j = k; j >= 0; j--) {
                if (getNumberArray()[j] <= 0) {
                    continue;
                } else {
                    k = j - 1;
                    break;
                }
            }
            if (i < j) {
                int tmp = getNumberArray()[i];
                getNumberArray()[i] = getNumberArray()[j];
                getNumberArray()[j] = tmp;
            } else break;
        }
    }
}
