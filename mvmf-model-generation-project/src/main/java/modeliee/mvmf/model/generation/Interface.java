package modeliee.mvmf.model.generation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Interface.
 */
public class Interface {
    @JsonProperty(value = "viewInterface")
    protected String name;

    @JsonProperty
    protected String derivedFrom;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDerivedFrom() {
        return derivedFrom;
    }

    public void setDerivedFrom(String derivedFrom) {
        this.derivedFrom = derivedFrom;
    }
}
