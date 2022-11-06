package Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<Integer>();

        for (int i = 0; i < 12; i++) {
            queue.add(i * 10);
        }
        queue.print();

        System.out.print("\n");
        System.out.println(" Queue isEmpty = " + queue.isEmpty());
        System.out.println(" Queue Lenght = " + queue.getLength());
        System.out.println(" Queue Capacity = " + queue.getCapacity());


        queue.remove();
        queue.print();
        System.out.println("\n\n");

        queue.remove();
        queue.print();
        System.out.println("\n\n");

        queue.remove();
        queue.print();
        System.out.print("\n\n");

        System.out.print(queue.get(10));
        System.out.print("\n\n");

        System.out.println(".get(index) =  " + queue.get(5));
        System.out.println();

        System.out.print("Has it queue object sent " + queue.contains(30) + "\n\n");
        System.out.print("Has it queue object sent " + queue.contains(33) + "\n\n");
        System.out.print("Method IndexObject(50)  = " + queue.indexObjet(50) + "\n\n");
        System.out.print("Method IndexObject(55)  = " + queue.indexObjet(55) + "\n\n");

        Queue queue1 = new Queue();
        for (int j = 0; j < 5; j++) {
            queue1.add(j * 2);
        }

        System.out.print("queue1.print() = ");
        queue1.print();
        System.out.print("\n\n");

        System.out.print("queue1.print() = ");
        queue.addQueue(queue1);
        queue.print();
        System.out.print("\n\n");

       /* Queue<Integer> temp = queue.subQueue(3, 7);
        System.out.println("subQueue = ");
        temp.print();*/

        queue.clear();
        queue.print();
    }
}