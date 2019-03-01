package core;

public class RequestVote extends BaseParams {

    // Candiate Requesting vote id.
    String candidateId;
    // index of the last log entry
    long lastLogIndex;
    // term of candidate last log entry.
    long lastLogTerm;

}
