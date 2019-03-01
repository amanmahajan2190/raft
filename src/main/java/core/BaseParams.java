package core;

import java.io.Serializable;

public class BaseParams implements Serializable {

    private long term;
    private String  serverId;


    public long getTerm() {
        return term;
    }

    public void setTerm(long term) {
        this.term = term;
    }

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }
}
