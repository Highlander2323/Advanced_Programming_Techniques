package Lab06_Generics;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO: Make this class generic so it can hold any type T.
 * TODO: Add a bounded variant of findMax() that only works when T extends Comparable<T>.
 * TODO: Throw EmptyStackException (your custom exception) from pop() and peek() when the stack is empty.
 */
public class GenericStack /* TODO: add type parameter */ {

    private List /* TODO: parameterise */ elements = new ArrayList<>();

    /**
     * TODO: Push the given item onto the top of the stack.
     */
    // Adds an item to the top of the stack.
    // Adaugă un element în vârful stivei.
    public void push(/* TODO */ Object item) {
        // IMPLEMENT
    }

    /**
     * TODO: Remove and return the top element.
     * TODO: Throw EmptyStackException if the stack is empty.
     */
    // Removes and returns the top element; throws EmptyStackException if empty.
    // Elimină și returnează elementul din vârf; aruncă EmptyStackException dacă e goală.
    public /* TODO */ Object pop() {
        // IMPLEMENT
        return null;
    }

    /**
     * TODO: Return (but do not remove) the top element.
     * TODO: Throw EmptyStackException if the stack is empty.
     */
    // Returns the top element without removing it.
    // Returnează elementul din vârf fără a-l elimina.
    public /* TODO */ Object peek() {
        // IMPLEMENT
        return null;
    }

    /**
     * TODO: Return true if the stack contains no elements.
     */
    // Returns true if the stack is empty.
    // Returnează true dacă stiva este goală.
    public boolean isEmpty() {
        // IMPLEMENT
        return true;
    }

    /**
     * TODO: Return the number of elements currently in the stack.
     */
    // Returns the number of elements in the stack.
    // Returnează numărul de elemente din stivă.
    public int size() {
        // IMPLEMENT
        return 0;
    }

    /**
     * TODO: Return the largest element in the stack using Comparable.
     * TODO: Use a bounded type parameter — this method should only compile when T extends Comparable<T>.
     * TODO: Throw EmptyStackException if the stack is empty.
     */
    // Finds and returns the maximum element in the stack.
    // Găsește și returnează elementul maxim din stivă.
    public /* TODO */ Object findMax() {
        // IMPLEMENT
        return null;
    }
}
