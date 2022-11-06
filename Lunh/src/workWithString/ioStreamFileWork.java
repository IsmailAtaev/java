package workWithString;
import java.util.Comparator;


abstract class GeometricObject {
    public abstract double getArea();
}
class RectangleGO extends GeometricObject {
    private double sideA;
    private double sideB;

    public RectangleGO(double a, double b) {
        sideA = a;
        sideB = b;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }
}
class CircleGO extends GeometricObject {
    private double radius;

    public CircleGO(double r) {
        radius = r;
    }

    @Override
    public double getArea() {
// TODO Auto-generated method stub
        return 2 * 3.14 * radius * radius;
    }
}

class GeometricObjectComparator implements Comparator<GeometricObject> {
    public int compare(GeometricObject o1, GeometricObject o2) {
        double area1 = o1.getArea();
        double area2 = o2.getArea();
        if (area1 < area2) {
            return -1;
        } else if (area1 == area2) {
            return 0;
        } else {
            return 1;
        }
    }
}



class  Walk implements  Runnable {
    public void run() {
        for (int i = 0; i < 8; i++) {
            System.out.println("Wallking");
        }
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            System.err.println(e);
        }
    }
}


class Talk extends Thread {
    public void run() {
        for (int i = 0; i < 8; i++) {
            System.out.println("Tallking");
        }
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            System.err.println(e);
        }
    }
}












public class ioStreamFileWork {
    public static void main(String[] args) {
      /*  try {
            FileWriter out = new FileWriter("text.txt");
            BufferedWriter br = new BufferedWriter(out);
            PrintWriter pw = new PrintWriter(br);
            pw.println("I'm a sentence in a text-file.");
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        /*try {
// сериализация
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            Object objSave = new Integer(1);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(objSave);
// смотрим, во что превратился сериализованный объект
            byte[] bArray = os.toByteArray();
            for (byte b : bArray) {
                System.out.print((char) b);
            }
            System.out.println();
// десериализация
            ByteArrayInputStream is = new ByteArrayInputStream(bArray);
            ObjectInputStream ois = new ObjectInputStream(is);
            Object objRead = ois.readObject();
// проверяем идентичность объектов
            System.out.println("readed object is: " + objRead.toString());
            System.out.println("Object equality is: " + (objSave.equals(objRead)));
            System.out.println("Reference equality is: " + (objSave == objRead));
        } catch (NotSerializableException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/

        Thread t =  Thread.currentThread();
        System.out.println(t);

        Talk talk = new Talk();
        Thread walk = new Thread(new Walk());
        // запуск потоков
        talk.start();
        walk.start();

        /*Comparator<GeometricObject> comparator = new
                GeometricObjectComparator();
        Set<GeometricObject> set = new TreeSet<GeometricObject>(comparator);
        set.add(new RectangleGO(4, 5));
        set.add(new CircleGO(40));
        set.add(new CircleGO(40));
        set.add(new RectangleGO(4, 1));
        System.out.println("A sorted set of geometric objects");
        for (GeometricObject elements : set) {
            System.out.println("area = " + elements.getArea());
        }*/
    }
}



class GetStateDemo implements Runnable {
    public void run() {
        Thread.State state = Thread.currentThread().getState();
        System.out.println(Thread.currentThread().getName() + " " + state);
    }
    public static void main(String[] argc) {
        Thread th1 = new Thread(new GetStateDemo());
        th1.start();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        Thread.State state = th1.getState();
        System.out.println(th1.getName() + " " + state);
    }
}


class NewThread implements Runnable {
    String name;
    Thread t;

    NewThread(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("new thread " + t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " interraped.");
        }
        System.out.println(name + "exiting ");
    }
}



class   DemoJoin {
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("one");
        NewThread ob2 = new NewThread("two");
        NewThread ob3 = new NewThread("there");
        System.out.println("one " + ob1.t.isAlive());
        System.out.println("two " + ob2.t.isAlive());
        System.out.println("there " + ob3.t.isAlive());
        ob1.t.setDaemon(true);
        try {
            System.out.println("Waiting for threads to finish.");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();

        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
    }
}