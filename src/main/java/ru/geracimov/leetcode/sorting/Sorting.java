package ru.geracimov.leetcode.sorting;

public class Sorting {
    private Sorting() {
    }

    public static <E extends Comparable<? super E>> void bubbleSort(E[] comparable) {
        boolean changed;
        do {
            changed = false;
            for (int a = 0; a < comparable.length - 1; a++) {
                if (comparable[a].compareTo(comparable[a + 1]) > 0) {
                    E tmp = comparable[a];
                    comparable[a] = comparable[a + 1];
                    comparable[a + 1] = tmp;
                    changed = true;
                }
            }
        } while (changed);
    }

    public static <E extends Comparable<? super E>> void quickSort(E[] array, int low, int high) {
        if (array.length == 0)
            return;//завершить выполнение если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        E pivot = array[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low;
        int j = high;
        while (i <= j) {
            while (array[i].compareTo(pivot) < 0) {
                i++;
            }

            while (array[j].compareTo(pivot) > 0) {
                j--;
            }

            if (i <= j) {//меняем местами
                E temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }
}
