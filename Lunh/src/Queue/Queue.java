package Queue;

import java.util.Arrays;
import java.util.Objects;

public class Queue<T> {
    private Integer length = 0;
    private Integer capacity = 10;
    private T queue[];

    public Queue() {
        // this.queue =  new Object[capacity];
        //   this.qq = new E[capacity];
        //this.queue = new E[capacity];
        //this.queue = new E[capacity];
        this.queue = (T[]) new Object[this.getCapacity()];
        //* if i ismailskom write this.queue=  new Object[this.capasite];
        //* auto Casting prohodit  jdk autoCast do
        //* i do not Know  maybe(может) it is standart
    }

    public Queue(Integer capacity) {
        /*if (capacity > 0) {
            this.capacity = capacity;
           // this.queue = new Integer[this.capacity];
            //this.queue = new Integer [capacity];
            this.queue = new Object[];
        } else {
            if (capacity != 0) {
                throw new IllegalArgumentException(" Capacity menshe 0 zero" + capacity);
            }
            //this.queue = new Integer[this.capacity];
            this.queue = new Integer[this.capacity];
        }*/
        this.capacity = capacity;
        this.queue = (T[]) new Object[this.getCapacity()];
    }

    public boolean add(T value) {
        // changed this.capacity to, this.getCapacity
        if (this.getCapacity() > 0 && this.getLength() < this.getCapacity()) {
            this.queue[this.getLength()] = value;
            this.length++;
            return true;
        } else if (this.getLength() == this.getCapacity()) {
            this.capacity *= 2;
            T temp[] = (T[]) new Object[capacity];
            for (int i = 0; i < this.getLength(); i++) {
                temp[i] = this.queue[i];
            }
            temp[this.getLength()] = value;
            this.queue = temp;
            return true;
        }
        return false;
    }

    public boolean remove() {
        /*if (!this.isEmpty()) {
            T temp[] = (T[]) new Object[this.getCapacity()];
            // Integer[] temp = new Integer[this.length];
            for (int i = 0; i < this.length - 1; i++) {
                temp[i] = this.queue[i + 1];
            }
            this.queue = temp;
            this.length--;
            //this.capacity -= this.length + 2; //
            this.capacity = this.length + 2; //
            return true;
        }*/
        if (!this.isEmpty()) {
            for (int i = 0; i < this.getLength() - 1; i++) {
                this.queue[i] = this.queue[i + 1];
            }
            this.queue[this.length--] = null;
            this.capacity = this.length + 2;
            return true;
        }
        return false;
    }

    public void print() {
        for (int i = 0; i < this.getLength(); i++) {
            System.out.print(this.queue[i] + " ");
        }
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public int getLength() {
        return this.length;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public T get(Integer index) {
        try {
            --index;
            if (this.isEmpty() || index > this.getLength() || index < 0) {
                throw new Exception("Size error index > or < 0 ");
            }
            return this.queue[index];
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public void clear() {
        this.capacity = 10;
        this.length = 0;
        this.queue = (T[]) new Integer[this.getCapacity()];
    }

    public boolean contains(T value) {
        for (int i = 0; i < this.getLength(); i++) {
            //if (this.queue[i] == element) { // used equals method()
            if (this.queue[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    public Integer indexObjet(T data) {
        for (int i = 0; i < this.getLength(); i++) {
            if (this.queue[i].equals(data)) {
                return i + 1;
            }
        }
        return null; // it is bad  Возврашать ноль zero very very bad (I thing Ismailskom)
    }

    public boolean set(T data) {
        if (!this.isEmpty()) {
            this.add(data);
            return true;
        }
        return false;
    }

    // что то я не то зделала tommorow finished
    // ешо не понял как typmlate typename зделать шаблонный
   /* public Queue<T> subQueue(Integer from, Integer to) {
        if (!this.isEmpty()) {
            try {
                if (to > this.getLength() || to < 0 || from > to || from < 0) {
                    throw new IndexOutOfBoundsException("From to size big or small sorry it is error ");
                }
                Integer count = to - from;
                Queue<T> qq = new Queue<T>(count--);
                while (from < to) {
                    qq.add(this.get(from));
                }
                return qq;
            } catch (IndexOutOfBoundsException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return null;
    }*/

    public boolean addQueue(Queue<T> data) {
       /* if (!data.isEmpty()) {
            Integer count = this.length + data.length;
            Integer elem[] = new Integer[count + 2];
            int i = 0;
            int n = 0;
            while (i < this.length) {
                elem[i] = this.queue[i];
                i++;
            }
            while (i < count) {
                elem[i] = data.get(n + 1);
                n++;
                i++;
            }
            this.length = count;
            this.capacity = count + 2;
            this.queue = elem;
            return true;
        }
        return false;*/

        if (!data.isEmpty()) {
            Integer overallSize = this.getLength() + data.getLength();
            T element[] = (T[]) new Object[overallSize];
            int i = 0;
            int j = 0;
            while (i < this.getLength()) {
                element[i] = this.get(i + 1);
                ++i;
            }
            while (i < overallSize) {
                element[i] = data.get(j + 1);
                i++;
                j++;
            }
            this.length = overallSize;
            this.capacity = overallSize + 2;
            this.queue = element;
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Queue<?> queue1 = (Queue<?>) o;
        return Objects.equals(length, queue1.length) && Objects.equals(capacity, queue1.capacity) && Arrays.equals(queue, queue1.queue);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(length, capacity);
        result = 31 * result + Arrays.hashCode(queue);
        return result;
    }
}