package common;

import java.util.HashSet;
import java.util.Set;

public class Node {

    private String address;
    private String name;
    Set<Node> peers;

    public Node(String address, String name) {
        this.address = address;
        this.name = name;
        this.peers = new HashSet<>();
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addPeer(Node node) {
        this.peers.add(node);
    }

    public void removePeer(Node node) {
        this.peers.remove(node);
    }






}
