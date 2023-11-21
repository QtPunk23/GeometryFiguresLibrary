package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ObjectGroup objectGroup = new ObjectGroup();
        while (true) {

            System.out.println("Выберите действие:");
            System.out.println("1. Найти пересечения линий");
            System.out.println("2. Найти точки для объединения");
            System.out.println("3. Посчитать площадь придомового участка");
            System.out.println("4. Посчитать общую земельную площадь нескольких участков");
            System.out.println("5. Выход");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    ConsoleUtils.findLineIntersections();
                    break;
                case 2:
                   ConsoleUtils.findPointsForUnion();
                    break;
                case 3:
                   ConsoleUtils.calculateParcelArea();
                    break;
                case 4:
                    ConsoleUtils.calculateTotalLandArea();
                    break;
                case 5:
                    System.out.println("Выход из программы.");
                    System.exit(0);
                default:
                    System.out.println("Некорректный выбор. Пожалуйста, выберите действие от 1 до 5.");
            }

        }
    }

   /* private static void findLineIntersections(ObjectGroup objectGroup) {
        objectGroup.findLineIntersections();
    }

    private static void findPointsForUnion(ObjectGroup objectGroup) {
        objectGroup.findPointsForUnion();
    }

    private static void calculateParcelArea(ObjectGroup objectGroup) {
        objectGroup.calculateParcelArea();
    }

    private static void calculateTotalLandArea(ObjectGroup objectGroup) {
        objectGroup.calculateTotalLandArea();
    }*/
}