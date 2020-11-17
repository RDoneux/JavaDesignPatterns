package patterns.observer;

/**
 * <b>Best Practise</b>
 * Overriding equals means you should also override hashCode.
 *
 * Josh Bloch - Effective Java:
 * <i>You must override hashCode() in every class that overrides equals(). Failure to do so will result in a violation of the general
 * contract for Object.hashCode(), which will prevent your class from functioning properly in conjunction with all hash-based collections,
 * including HashMap, HashSet, and Hashtable.</i>
 */
public abstract class AbstractObserver implements Observer {

    @Override
    public int hashCode() {
        return this.getId().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        return this.getId() == ((Observer) obj).getId();
    }
}
