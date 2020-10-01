package io.lightkun.nasgorcloud;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * In my domain, Nasi Goreng ingredients are fairly simple objects.
 * Each has a name as well as a type so that it can be visually
 * categorized (proteins, cheeses, sauces, and so on).
 * Each also has an ID by which it can easily and unambiguously be referenced
 */
@Data
@RequiredArgsConstructor
public class Ingredient {

    private final String id;
    private final String name;
    private final Type type;

    public static enum Type {
       AYAM, SPESIAL, KAMBING, IKANASIN, RENDANG
    }

}
