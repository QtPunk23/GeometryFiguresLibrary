package org.example;

public class Segment {

    Point start;
    Point end;


    public Segment(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Point findIntersection(Segment other) {
        double x1 = start.x;
        double y1 = start.y;
        double x2 = end.x;
        double y2 = end.y;

        double x3 = other.start.x;
        double y3 = other.start.y;
        double x4 = other.end.x;
        double y4 = other.end.y;

        double det = (x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4);

        if (det == 0) {
            return null; // Отрезки параллельны или совпадают
        }

        double t = ((x1 - x3) * (y3 - y4) - (y1 - y3) * (x3 - x4)) / det;
        double u = -((x1 - x2) * (y1 - y3) - (y1 - y2) * (x1 - x3)) / det;

        if (t >= 0 && t <= 1 && u >= 0 && u <= 1) {
            double intersectionX = x1 + t * (x2 - x1);
            double intersectionY = y1 + t * (y2 - y1);
            return new Point(intersectionX, intersectionY);
        }

        return null; // Отрезки не пересекаются
    }

    public Segment unite(Segment other) {
        if (this.start.equals(other.end) || this.end.equals(other.start)) {
            // Если один из отрезков начинается там, где другой заканчивается,
            // то их можно объединить
            if (this.start.equals(other.end)) {
                return new Segment(other.start, this.end);
            } else {
                return new Segment(this.start, other.end);
            }
        }

        // Если отрезки не могут быть объединены, вернем null
        return null;
    }

    public double length() {
        return start.distanceTo(end);
    }

    @Override
    public String toString() {
        return "Segment from " + start + " to " + end;
    }


}
