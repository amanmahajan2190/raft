package core;

import java.io.Serializable;

public class RequestVoteResult implements Serializable {
    // current term, for the candidate to update itself
    long term;
    // true means candidate has recieved a vote or not.
    boolean voteGranted;
}
