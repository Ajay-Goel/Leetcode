package SystemDesign.LowLevelCacheDesign.main.java.com.uditagarwal.cache.exceptions;

public class StorageFullException extends RuntimeException {

    public StorageFullException(String message) {
        super(message);
    }
}
