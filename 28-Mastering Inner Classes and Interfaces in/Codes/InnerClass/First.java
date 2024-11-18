public class First {
    int num; // Non-static variable

    public void show() {
        System.out.println("In show method: " + num); // Non-static method
    }

    public static void main(String[] args) {
        // If we directly call show() here, it will throw an error.
        // We can't call a non-static method from a static context directly.

        First obj = new First(); // Creating an instance of First
        obj.show(); // Calling the non-static method show() on the instance obj
    }
}
