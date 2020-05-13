package patterns.behavioral.iterator;


public class Order implements Collection {
    private Item[] items;

    public Order(Item[] items) {
        this.items = items;
    }

    @Override
    public Iterator getIterator() {
        return new ItemIterator();
    }

    class ItemIterator implements Iterator {
        private int index;

        @Override
        public boolean hasNext() {
            return index < items.length - 1;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return items[index++];
            } else {
                throw new RuntimeException("No such next element");
            }
        }
    }
}
