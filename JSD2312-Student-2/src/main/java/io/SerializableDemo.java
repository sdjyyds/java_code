package io;

import java.io.*;

class Point implements Serializable{
    private static final long serialVersionUID = -8605337614925028892L;
    private int x;
    private int y;
    private int z;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
public class SerializableDemo {
    static Point deSerialize() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("p1.obj"));
        return (Point)ois.readObject();
    }
    static void serialize(Point p1) throws IOException
    {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("p1.obj"));
        oos.writeObject(p1);
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Point p1 = new Point();
        p1.setX(10);
        p1.setY(21);
        serialize(p1);
        System.out.println(deSerialize());
    }
}
