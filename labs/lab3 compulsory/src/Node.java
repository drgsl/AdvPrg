public class Node {
    protected String name;
    protected String macAddr;
    protected String location;

    public Node(String name, String macAddr, String location) {
        this.name = name;
        this.macAddr = macAddr;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                ", macAddr='" + macAddr + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
