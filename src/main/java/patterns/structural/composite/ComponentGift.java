package patterns.structural.composite;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ComponentGift implements Gift {
    private final List<Gift> gifts;

    public ComponentGift(Gift... gifts) {
        this.gifts = Arrays.stream(gifts)
                .collect(Collectors.toList());
    }

    public void addGift(Gift gift) {
        gifts.add(gift);
    }

    public void removeGift(Gift gift) {
        gifts.remove(gift);
    }

    @Override
    public void printName() {
        gifts.forEach(Gift::printName);
    }
}
