package SystemDesign.LowLevelCacheDesign.main.java.com.uditagarwal.cache.factories;

import SystemDesign.LowLevelCacheDesign.main.java.com.uditagarwal.cache.Cache;
import SystemDesign.LowLevelCacheDesign.main.java.com.uditagarwal.cache.policies.LRUEvictionPolicy;
import SystemDesign.LowLevelCacheDesign.main.java.com.uditagarwal.cache.storage.HashMapBasedStorage;
//import com.uditagarwal.cache.Cache;
//import com.uditagarwal.cache.policies.LRUEvictionPolicy;
//import com.uditagarwal.cache.storage.HashMapBasedStorage;

public class CacheFactory<Key, Value> {

    public Cache<Key, Value> defaultCache(final int capacity) {
        return new Cache<Key, Value>(new LRUEvictionPolicy<Key>(),
                new HashMapBasedStorage<Key, Value>(capacity));
    }
}
