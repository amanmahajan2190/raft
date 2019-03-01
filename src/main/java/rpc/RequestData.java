package rpc;


import java.io.Serializable;

public class RequestData<T>  implements Serializable {

    public enum REQUEST_TYPE {
        DEFAULF(0),
        REQUEST_VOTE(1),
        APPEND_ENTRIES(2),
        CLIENT_REQUEST(3),
        ADD_NEW_NODE(4),
        REMOVE_NODE(5);


        private final int value;
        REQUEST_TYPE(int v) {
            this.value = v;
        }
        public int getValue() { return value; }

    }

    private REQUEST_TYPE command = REQUEST_TYPE.DEFAULF;
    private String nodeAddress = "";
    private T obj;

    public RequestData(REQUEST_TYPE command, T obj, String nodeAddress) {
        this.command = command;
        this.nodeAddress = nodeAddress;
        this.obj = obj;
    }






}
