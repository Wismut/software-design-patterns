package patterns.structural.flyweight;

public class CacheRunner {
    public static void main(String[] args) {
        CacheFactory cacheFactory = new CacheFactory();
        System.out.println(cacheFactory.createCache("123"));
        System.out.println(cacheFactory.createCache("123"));
        System.out.println(cacheFactory.createCache("123"));
        System.out.println(cacheFactory.createCache("123"));
        System.out.println(cacheFactory.createCache("123"));
        System.out.println(cacheFactory.createCache("123"));
        System.out.println(cacheFactory.createCache("123"));
        System.out.println(cacheFactory.createCache("123"));
        System.out.println(cacheFactory.createCache("123"));
        System.out.println(cacheFactory.createCache("dfgderge"));
        System.out.println(cacheFactory.createCache("dfgderge"));
        System.out.println(cacheFactory.createCache("dfgderge"));
        System.out.println(cacheFactory.createCache("dfgderge"));
        System.out.println(cacheFactory.createCache("dfgderge"));
        System.out.println(cacheFactory.createCache("dfgderge"));
        System.out.println(cacheFactory.createCache("dfgderge"));
    }
}
