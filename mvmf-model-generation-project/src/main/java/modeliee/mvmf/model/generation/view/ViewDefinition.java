package modeliee.mvmf.model.generation.view;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import modeliee.mvmf.model.generation.Interface;

import java.util.LinkedList;
import java.util.List;

/**
 * ViewDefinition
 */
@JsonPropertyOrder({"name", "derivedFrom", "attributes", "interfaces"})
public class ViewDefinition {

    @JsonProperty(value = "view")
    protected String name;

    @JsonProperty
    protected String derivedFrom;

    @JsonProperty
    protected List<ViewAttribute> attributes;

    @JsonProperty
    protected List<Interface> interfaces;

    public ViewDefinition() {
        attributes = new LinkedList<>();
        interfaces = new LinkedList<>();
        derivedFrom = "";
    }

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

    public List<ViewAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<ViewAttribute> attributes) {
        this.attributes = attributes;
    }

    public void addAttribute(ViewAttribute attribute) {
        this.attributes.add(attribute);
    }

    public List<Interface> getInterfaces() {
        return interfaces;
    }

    public void setInterfaces(List<Interface> interfaces) {
        this.interfaces = interfaces;
    }

}
