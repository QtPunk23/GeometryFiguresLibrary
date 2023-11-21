package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ObjectGroup {
    List<Point> points = new ArrayList<>();
    List<Segment> segments = new ArrayList<>();
    List<Polygon> polygons = new ArrayList<>();

    public void addSegment(Segment segment) {
        segments.add(segment);
    }

    public void addPolygon(Polygon polygon) {
        polygons.add(polygon);
    }

    public double totalArea() {
        double totalArea = 0;

        for (Polygon polygon : polygons) {
            totalArea += polygon.calculateArea();
        }

        return totalArea;
    }

    public List<Segment> getSegments() {
        return segments;
    }

    public List<Polygon> getPolygons() {
        return polygons;
    }

   /* public void findLineIntersections() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите координаты начала первого отрезка (x1 y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("Введите координаты конца первого отрезка (x2 y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.print("Введите координаты начала второго отрезка (x1 y1): ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        System.out.print("Введите координаты конца второго отрезка (x2 y2): ");
        double x4 = scanner.nextDouble();
        double y4 = scanner.nextDouble();

        Point start1 = new Point(x1, y1);
        Point end1 = new Point(x2, y2);
        Point start2 = new Point(x3, y3);
        Point end2 = new Point(x4, y4);

        Segment segment1 = new Segment(start1, end1);
        Segment segment2 = new Segment(start2, end2);

        Point intersection = segment1.findIntersection(segment2);

        if (intersection != null) {
            System.out.println("Пересечение между " + segment1 + " и " + segment2 + " в точке " + intersection);
        } else {
            System.out.println("Отрезки не пересекаются.");
        }
    }

    public void findPointsForUnion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите координаты начала первого отрезка (x1 y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("Введите координаты конца первого отрезка (x2 y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.print("Введите координаты начала второго отрезка (x1 y1): ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        System.out.print("Введите координаты конца второго отрезка (x2 y2): ");
        double x4 = scanner.nextDouble();
        double y4 = scanner.nextDouble();

        Point start1 = new Point(x1, y1);
        Point end1 = new Point(x2, y2);
        Point start2 = new Point(x3, y3);
        Point end2 = new Point(x4, y4);

        Segment segment1 = new Segment(start1, end1);
        Segment segment2 = new Segment(start2, end2);

        Segment unitedSegment = segment1.unite(segment2);

        if (unitedSegment != null) {
            System.out.println("Можно объединить " + segment1 + " и " + segment2 + " в " + unitedSegment);
        } else {
            System.out.println("Отрезки не могут быть объединены.");
        }
    }

    public void calculateParcelArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество точек вершин полигона: ");
        int numberOfPoints = scanner.nextInt();

        List<Point> points = new ArrayList<>();

        for (int i = 1; i <= numberOfPoints; i++) {
            System.out.print("Введите координаты точки " + i + " (x y): ");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            points.add(new Point(x, y));
        }

        LandParcel landParcel = new LandParcel(points);
        double parcelArea = landParcel.calculateParcelArea();

        System.out.println("Площадь придомового участка: " + parcelArea);
    }
    public void calculateTotalLandArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество участков: ");
        int numberOfParcels = scanner.nextInt();

        double totalArea = 0.0;

        for (int i = 1; i <= numberOfParcels; i++) {
            System.out.print("Введите количество точек вершин для участка " + i + ": ");
            int numberOfPoints = scanner.nextInt();

            List<Point> points = new ArrayList<>();

            for (int j = 1; j <= numberOfPoints; j++) {
                System.out.print("Введите координаты точки " + j + " (x y): ");
                double x = scanner.nextDouble();
                double y = scanner.nextDouble();
                points.add(new Point(x, y));
            }

            LandParcel landParcel = new LandParcel(points);
            double parcelArea = landParcel.calculateParcelArea();
            totalArea += parcelArea;
        }

        System.out.println("Общая земельная площадь " + numberOfParcels + " участков: " + totalArea);
    }*/

}
