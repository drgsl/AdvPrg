import java.util.LinkedList;
import java.util.List;

public class Network {
    private LinkedList<Node> nodes;

    public void add(Node node){
        this.nodes.add(node);
    }

    @Override
    public String toString() {
        return "Network{" +
                "nodes=" + nodes +
                '}';
    }
}
