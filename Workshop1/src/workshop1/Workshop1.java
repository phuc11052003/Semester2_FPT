package workshop1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author tran Hoang Phuc
 */
public class Workshop1 {

    public static void main(String[] args) {
        handleMainMenu();
    }

    public static void handleMainMenu() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            showMainMenu();
            System.out.print("Enter your choice: ");
            String choice = sc.nextLine().toUpperCase();
            switch (choice) {
                case "O":
                    handleOneDimensionalArray(sc);
                    break;
                case "T":
                    handleTwoDimensionalArray(sc);
                    break;
                case "E":
                    System.out.println("Exit the program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }

    }

    public static void handleSubMenu(Scanner sc, int[] arr) {
        int option = getAPositive(sc, "Enter your option: ");
        switch (option) {
            case 1:
                System.out.println("Array after sorting by ascending: " + Arrays.toString(sortArray(arr)));
                break;
            case 2:
                System.out.println("The largest number in the array is " + findMax(arr));
                System.out.println("The smallest number in the array is " + findMin(arr));
                break;
            case 3:
                printEvenOdd(arr);
                break;
            case 4:
                findElement(arr, sc);
                break;
            case 5:
                handleMainMenu();
                break;
            default:
                System.out.println("Invalid option. Please try again");
                break;
        }
    }

    public static int getAPositive(Scanner sc, String notice) {
        int number;
        while (true) {
            try {
                System.out.print(notice);
                number = Integer.parseInt(sc.nextLine());
                if (number <= 0) {
                    throw new Exception("Invalid value. Try agian");
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid value. Try again");
            }
        }
        return number;
    }

    public static int getAnInteger(Scanner sc, String notice) {
        int number;
        while (true) {
            try {
                System.out.print(notice);
                number = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Invalid value. Try again");
            }
        }
        return number;
    }

    public static void handleOneDimensionalArray(Scanner sc) {
        int size = getAPositive(sc, "Enter the size of array: ");
        int[] arr = inputOneDimensionArray(sc, size);
        while (true) {
            showSubMenu();
            handleSubMenu(sc, arr);
        }
    }

    public static void handleTwoDimensionalArray(Scanner sc) {
        int rows, cols;
        rows = getAPositive(sc, "Enter number of rows: ");
        cols = getAPositive(sc, "Enter number of cols: ");
        int arr[][] = inputTwoDimensionalArray(sc, rows, cols);
        System.out.println("Matrix inputted:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%d\t", arr[i][j]);
            }
            System.out.printf("\n");
        }
        System.out.printf("Do you want to continue (C) or stop (S):");
        String choice = sc.nextLine().toUpperCase();
        switch (choice) {
            case "C":
                return;
            case "S":
                System.out.println("Exit the program...");
                System.exit(0);
            default:
                System.out.println("Invalid choice, the program will end automatically");
                System.exit(0);
        }
    }

    public static int[] inputOneDimensionArray(Scanner sc, int size) {
        int[] arr = new int[size];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < size; i++) {
            arr[i] = getAnInteger(sc, "arr[" + i + "] = ");
        }
        return arr;
    }

    public static int[][] inputTwoDimensionalArray(Scanner sc, int rows, int cols) {
        int arr[][] = new int[rows][cols];
        System.out.println("Enter the matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = getAnInteger(sc, String.format("arr[%d][%d] = ", i, j));
            }
        }
        return arr;
    }

    public static void findElement(int[] arr, Scanner sc) {
        int target;
        boolean found = false;
        target = getAnInteger(sc, "Enter a number to search: ");
        System.out.print("Index of " + target + " is: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.print((i + 1) + " ");
                found = true;
            }
        }
        if (found == false) {
            System.out.println("Not found " + target);
        }
        System.out.println("");
    }

    public static int findMax(int[] arr) {
        return sortArray(arr)[arr.length - 1];
    }

    public static int findMin(int[] arr) {
        return sortArray(arr)[0];
    }

    public static void printEvenOdd(int[] arr) {
        System.out.print("Even numbers: ");
        for (int i : arr) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
        System.out.print("Odd numbers: ");
        for (int i : arr) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }

    public static int[] sortArray(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public static void showMainMenu() {
        System.out.println("+--------------------------------------+");
        System.out.println("|       O. One-dimensional array       |");
        System.out.println("|       T. Two-dimensional array       |");
        System.out.println("|       E. Exit                        |");
        System.out.println("+--------------------------------------+");
    }

    public static void showSubMenu() {
        System.out.println("+---------------------------------------------------+");
        System.out.println("|    1. Sort ascending (on rows)                    |");
        System.out.println("|    2. Print the largest and the smallest number   |");
        System.out.println("|    3. Print even and odd numbers in array         |");
        System.out.println("|    4. Find an element in array                    |");
        System.out.println("|    5. Back to main menu                           |");
        System.out.println("+---------------------------------------------------+");
    }
}
