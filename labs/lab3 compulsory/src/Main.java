public class Main{
    public static void main() {

        Computer computerA = new Computer("Computer A", "1234", "v1", "12345", 256);
        Router routerA = new Router("Router A", "1234", "v2", "12345");
        Switch switchA = new Switch("Switch A", "1234", "v3");
        Switch switchB = new Switch("Switch B", "1234", "v4");
        Router routerB = new Router("Router B", "1234", "v5", "12345");
        Computer computerB = new Computer("Computer B", "1234", "v6", "12345", 256);

        Network network = new Network();
        network.add(computerA);
        network.add(routerA);
        network.add(switchA);
        network.add(switchB);
        network.add(routerB);
        network.add(computerB);

        System.out.println(network.toString());
    }

}
