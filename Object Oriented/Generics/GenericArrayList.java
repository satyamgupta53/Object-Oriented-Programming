package Generics;
import java.util.Arrays;
import java.util.Objects;

public class GenericArrayList<T> {
    private Object[] data;
    private final int DEFAULT_SIZE = 10;
    private int curr_idx = 0;

    public GenericArrayList() {
        data = new Object[DEFAULT_SIZE];
    }

    public GenericArrayList(int size) {
        data = new Object[size];
    }

    public GenericArrayList(Object[] data) {
        this.data = data;
        this.curr_idx = data.length;
    }

    public void add(T element) {
        if (isFull())
            resizeList();
        data[curr_idx] = element;
        curr_idx++;
    }

    public T remove() {
        if(curr_idx == 0) 
            throw new IndexOutOfBoundsException("List is empty. Nothing to remove.");
        @SuppressWarnings("unchecked")
        T element = (T)(data[curr_idx-1]);
        curr_idx--;
        return element;
    }

    public T remove(int index) {
        if (outOfBound(index))
            throw new IndexOutOfBoundsException("Index out of the bound ! Search within arraylist.");
        @SuppressWarnings("unchecked")
        T element = (T)(data[index]);
        for (int i = index; i < curr_idx - 1; i++) {
            data[i] = data[i + 1];
        }
        curr_idx--;
        return element;
    }

    public T get(int index) {
        if (outOfBound(index))
            throw new IndexOutOfBoundsException("Index out of the bound ! Search within arraylist.");
        @SuppressWarnings("unchecked")
        T element = (T)(data[index]);
        return element;
    }

    public void set(int index, T element) {
        if (outOfBound(index))
            throw new IndexOutOfBoundsException("Index out of the bound ! Search within arraylist.");
        data[index] = element;
    }

    public int size() {
        return curr_idx;
    }

    public boolean isEmpty() {
        return curr_idx == 0;
    }

    public void display() {
        for (int i = 0; i < curr_idx; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public int getDEFAULT_SIZE() {
        return this.DEFAULT_SIZE;
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, DEFAULT_SIZE, curr_idx);
    }

    @Override
    public String toString() {
        return "{" +
            " data='" + Arrays.toString(data) +
            ", DEFAULT_SIZE='" + getDEFAULT_SIZE() + "'" +
            "}";
    }

    private boolean isFull() {
        return curr_idx == data.length;
    }

    private void resizeList() {
        Object[] temp = new Object[data.length * 2];
        System.arraycopy(data, 0, temp, 0, data.length); // Copying elements from old array to new array
        data = temp;
    }

    private boolean outOfBound(int index) {
        return index < 0 && index >= curr_idx;
    }
}