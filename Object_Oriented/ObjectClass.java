public class ObjectClass {
    private int val;

    public ObjectClass(int val) {
        this.val = val;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    } // hashCode method returns the number represented by the memory address of the
      // object

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    } // checks if contents of two objects are same or not, unlike, comparator which
      // compares the memory address

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    /* Getters & Setters */
    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    /*
     * This method is called by the garbage collector on an object, before the
     * object is discarded.
     * when garbage collection determines that there are no more references to the
     * object.
     * 
     * @Override
     * protected void finalize() throws Throwable {
     * super.finalize();
     * }
     */

    public static void main(String[] args) {
        ObjectClass obj = new ObjectClass(10);
        System.out.println(obj.hashCode());

        ObjectClass obj1 = new ObjectClass(100);
        ObjectClass obj2 = new ObjectClass(100);
        obj = obj1; // this will give same memory address

        if (obj1.equals(obj2))
            System.out.println("Both have same content");
        if (obj1 == obj)
            System.out.println("Both have same memory address");


        // instance operator checks for the instance of the object
        if (obj instanceof ObjectClass)
            System.out.println("obj is an instance of ObjectClass");
        if (obj instanceof Object)
            System.out.println("obj is an instance of ObjectClass");

        // get Class of an object
        System.out.println(obj.getClass().getName());
        System.out.println(obj.toString()); // uses getClass().getName() + "@" + Integer.toHexString(hashCode())
    }
}
