package patterns.structural.flyweight;


import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class CacheFactory {
    private final Map<String, Cache> cacheMap = new HashMap<>();

    public Cache createCache(String key) {
        return cacheMap.computeIfAbsent(key, s -> new Cache(s, UUID.randomUUID().toString()));
    }
}
