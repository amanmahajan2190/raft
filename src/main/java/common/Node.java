package common;

import java.util.HashSet;
import java.util.Set;

public class Node {

    private String address;
    private String nodeId;
    Set<Node> peers;

    public Node(String address, String name) {
        this.address = address;
        this.nodeId = name;
        this.peers = new HashSet<>();
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public void addPeer(Node node) {
        this.peers.add(node);
    }

    public void removePeer(Node node) {
        this.peers.remove(node);
    }






}
