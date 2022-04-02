package modeliee.mvmf.model.generation.view;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import modeliee.mvmf.model.generation.SemanticLink;

import java.util.LinkedList;
import java.util.List;

/**
 * ViewAttribute.
 */
@JsonPropertyOrder({"name", "identifier", "dataType", "value", "unit"})
public class ViewAttribute {

    @JsonProperty(value = "attribute")
    protected String name;

    @JsonProperty(defaultValue = "false", required = false)
    protected boolean isIdentifier;

    protected String dataType;

    @JsonProperty
    protected List<SemanticLink> relations;

    @JsonProperty(required = false)
    protected String unit;

    @JsonProperty(required = false)
    protected String value;

    public ViewAttribute() {
        this.relations = new LinkedList<>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty(value = "isIdentifier")
    public boolean isIdentifier() {
        return isIdentifier;
    }

    public void setIdentifier(boolean isIdentifier) {
        this.isIdentifier = isIdentifier;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public List<SemanticLink> getRelations() {
        return this.relations;
    }

    public void setRelations(List<SemanticLink> relations) {
        this.relations = relations;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void addRelation(SemanticLink relation) {
        this.relations.add(relation);
    }
}
