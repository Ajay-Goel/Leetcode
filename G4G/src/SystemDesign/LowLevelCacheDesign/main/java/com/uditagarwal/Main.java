package SystemDesign.LowLevelCacheDesign.main.java.com.uditagarwal;

import SystemDesign.LowLevelCacheDesign.main.java.com.uditagarwal.cache.Cache;
import SystemDesign.LowLevelCacheDesign.main.java.com.uditagarwal.cache.factories.CacheFactory;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CacheFactory cf = new CacheFactory();
        Cache c = cf.defaultCache(10);

    }
}
