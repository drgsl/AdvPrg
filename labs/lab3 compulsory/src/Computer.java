public class Computer extends Node implements Identifiable, Storage{
    private String ipAddr;
    private float storage;

    public Computer(String name, String macAddr, String location, String ipAddr, float storage) {
        super(name, macAddr, location);
        this.ipAddr = ipAddr;
        this.storage = storage;
    }

    @Override
    public void getIP() {

    }

    @Override
    public void getStorage() {

    }

    @Override
    public String toString() {
        return "Computer{" +
                "ipAddr='" + ipAddr + '\'' +
                ", storage=" + storage +
                ", name='" + name + '\'' +
                ", macAddr='" + macAddr + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
