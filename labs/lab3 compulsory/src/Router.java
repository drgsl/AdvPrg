public class Router extends Node implements Identifiable{
    String ipAddr;

    public Router(String name, String macAddr, String location, String ipAddr) {
        super(name, macAddr, location);
        this.ipAddr = ipAddr;
    }

    @Override
    public void getIP() {

    }

    @Override
    public String toString() {
        return "Router{" +
                "name='" + name + '\'' +
                ", macAddr='" + macAddr + '\'' +
                ", location='" + location + '\'' +
                ", ipAddr='" + ipAddr + '\'' +
                '}';
    }
}
