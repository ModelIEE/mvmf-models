package modeliee.mvmf.model.generation.graph;

import java.util.ArrayList;
import java.util.List;

/**
 * NodeView.
 */
public class NodeView {

    private String name;
    private List<NodeAttribute> attributes;

    public NodeView() {
        attributes = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<NodeAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<NodeAttribute> attributes) {
        this.attributes = attributes;
    }

    public void addAttribute(NodeAttribute attribute) {
        this.attributes.add(attribute);
    }
}
