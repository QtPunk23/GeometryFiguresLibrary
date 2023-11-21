package org.example;

import java.util.ArrayList;
import java.util.List;

public class LandParcel {
    private List<Point> points;

    public LandParcel(List<Point> points) {
        this.points = points;
    }

    public  double calculateParcelArea() {
        Polygon parcelPolygon = new Polygon(points);
        double area = parcelPolygon.calculateArea();
        return area;
    }

    public void addPoints(Point point) {
        points.add(point);
    }

    public List<Point> getPoints() {
        return points;
    }
}
