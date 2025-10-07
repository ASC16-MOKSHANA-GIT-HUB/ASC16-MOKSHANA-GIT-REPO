package storage;

public class StorageFactory {
    public static Storage getStorage() {
        return new StorageImpl();
    }
}
