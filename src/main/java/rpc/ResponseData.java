package rpc;

import java.io.Serializable;

public class ResponseData<T> implements Serializable {

    private T result;

    public ResponseData(T result) {
        this.result = result;
    }

    public  T getResult() {
        return result;
    }
}
