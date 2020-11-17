package principles.interfacesegregation;

public interface Lockable {
    boolean isLocked();
    void lock();
    void unlock();
}
