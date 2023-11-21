package org.example;
import java.util.ArrayList;
import java.util.List;

public class Polygon {
    public Polygon(List<Point> vertices) {
        this.vertices = vertices;
    }

    public List<Segment> getSegments() {
        List<Segment> segments = new ArrayList<>();
        int numVertices = vertices.size();
        for (int i = 0; i < numVertices; i++) {
            Point start = vertices.get(i);
            Point end = vertices.get((i + 1) % numVertices);

            Segment segment = new Segment(start, end);
            segments.add(segment);
        }

        return segments;
    }
    List<Point> vertices = new ArrayList<>();

    public void addVertex(Point point) {
        vertices.add(point);
    }

    public double calculateArea() {
        int n = vertices.size();
        double area = 0;

        for (int i = 0; i < n; i++) {
            Point current = vertices.get(i);
            Point next = vertices.get((i + 1) % n);
            area += (current.x * next.y) - (next.x * current.y);
        }

        return Math.abs(area) / 2.0;
    }
}
