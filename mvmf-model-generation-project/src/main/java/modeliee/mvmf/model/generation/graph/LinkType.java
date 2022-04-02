package modeliee.mvmf.model.generation.graph;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * LinkType.
 */
public enum LinkType {
    CHILDREN("Child"),
    REQUIRED("Required"),
    RESOURCE_PROCESS("ResourceProcess"),
    PRODUCT_PROCESS("ProductProcess");
    private final String value;

    LinkType(final String value) {
        this.value = value;
    }

    @JsonCreator
    public static LinkType fromValue(String v) {
        for (LinkType c : LinkType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    @JsonValue
    public String toValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
