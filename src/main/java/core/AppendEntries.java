package core;


import java.util.List;

/**
 *
 * Append entries are used by the leader to replicate the logs
 * in the followers using heartbeat logic.
* */
public class AppendEntries  extends BaseParams{

    String leaderId; // Follower use this leader id to redirect followers.
    long prevLogIndex; // index of the log entry immediately preceding the new ones.
    long prevLogTerm; //Term of the previous log entry
    long leaderCommit; // Commit index of the leader;
    LogEntry[] logEntries;


    public String getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(String leaderId) {
        this.leaderId = leaderId;
    }

    public long getPrevLogIndex() {
        return prevLogIndex;
    }

    public void setPrevLogIndex(long prevLogIndex) {
        this.prevLogIndex = prevLogIndex;
    }

    public long getPrevLogTerm() {
        return prevLogTerm;
    }

    public void setPrevLogTerm(long prevLogTerm) {
        this.prevLogTerm = prevLogTerm;
    }

    public long getLeaderCommit() {
        return leaderCommit;
    }

    public void setLeaderCommit(long leaderCommit) {
        this.leaderCommit = leaderCommit;
    }

    public LogEntry[] getLogEntries() {
        return logEntries;
    }

    public void setLogEntries(LogEntry[] logEntries) {
        this.logEntries = logEntries;
    }



}
