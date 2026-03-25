package Lab06_Generics;

/**
 * TODO: Make this class generic with two independent type parameters A and B.
 * TODO: Implement getFirst(), getSecond(), and swap().
 */
public class GenericPair /* TODO: add type parameters */ {

    private /* TODO */ Object first;
    private /* TODO */ Object second;

    public GenericPair(/* TODO */ Object first, /* TODO */ Object second) {
        this.first  = first;
        this.second = second;
    }

    /**
     * TODO: Return the first element.
     */
    // Returns the first element of the pair.
    // Returnează primul element al perechii.
    public /* TODO */ Object getFirst() {
        // IMPLEMENT
        return null;
    }

    /**
     * TODO: Return the second element.
     */
    // Returns the second element of the pair.
    // Returnează al doilea element al perechii.
    public /* TODO */ Object getSecond() {
        // IMPLEMENT
        return null;
    }

    /**
     * TODO: Return a new GenericPair with the two values swapped.
     * TODO: The return type should be GenericPair<B, A> — note the reversed parameters.
     */
    // Creates and returns a new pair with the two values swapped.
    // Creează și returnează o nouă pereche cu valorile inversate.
    public /* TODO */ GenericPair swap() {
        // IMPLEMENT
        return null;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}
