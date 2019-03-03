package com.designpattern;

/**
 * 2.Implement Factory Pattern to get the Polygon of different type.
 */
interface Get_polygon {
    public void polygonType();
}

class Pentagon implements Get_polygon {
    @Override
    public void polygonType() {
        System.out.println("I am pentagon");
    }
}

class Hexagon implements Get_polygon {
    @Override
    public void polygonType() {
        System.out.println("I am Hexagon");
    }
}

class Heptagon implements Get_polygon {
    @Override
    public void polygonType() {
        System.out.println("I am heptagon");
    }
}

class Polygon {
    Get_polygon getPolygon;

    public Get_polygon getGetPolygon() {
        return getPolygon;
    }

    public void setGetPolygon(Get_polygon getPolygon) {
        this.getPolygon = getPolygon;
    }
}

class PolygonFactory {
    static Polygon getPolygonObject(int side) {
        Polygon polygon = new Polygon();
        switch (side) {
            case 5:
                polygon.setGetPolygon(new Pentagon());
                break;
            case 6:
                polygon.setGetPolygon(new Hexagon());
                break;
            case 7:
                polygon.setGetPolygon(new Heptagon());
                break;
        }
        return polygon;
    }
}

public class FactoryPattern {
    public static void main(String[] args) {
        Polygon poly1 = PolygonFactory.getPolygonObject(5);
        poly1.getPolygon.polygonType();

        Polygon poly2 = PolygonFactory.getPolygonObject(7);
        poly2.getPolygon.polygonType();
    }
}
