package modeliee.mvmf.model.generation.graph;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Graph.
 */
public class Graph {

    @JsonProperty
    private List<NodeElement> elements;

    @JsonProperty
    private List<NodeLink> links;

    public Graph() {
        elements = new ArrayList<>();
        links = new ArrayList<>();
    }

    public List<NodeElement> getElements() {
        return elements;
    }

    public void addElement(NodeElement element) {
        this.elements.add(element);
    }

    public void addElements(List<NodeElement> elements) {
        this.elements.addAll(elements);
    }

    public List<NodeLink> getLinks() {
        return links;
    }

    public void addLinks(List<NodeLink> links) {
        this.links.addAll(links);
    }
}
