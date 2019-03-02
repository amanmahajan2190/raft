
namespace java raft.main.java.core

struct BaseParam {
    1: required i32 term;
    2: string serverId;
}

struct Command {
    1: required string key;
    2: required string value;
}


struct RequestVote {
    1: required string candidateId;
    2: required i32 lastLogIndex;
    3: required i32 lastLogTerm;
    4: required BaseParam baseParam;
}

struct RequestVoteResult {
    1: required bool voteGranted;
    2: required i32 term;
}


struct AppendEntriesResult {
    1: required bool isSuccessful;
    2: required i32 term;
}

struct LogEntry {
    1: required i32 index;
    2: required i32 term;
    3: required Command command;
}



struct AppendEntries {
    1: required string leaderId;
    2: required i32 prevLogIndex;
    3: required i32 prevLogTerm;
    4: required i32 leaderCommit;
    5: required list<LogEntry> logEntries;
    6: required BaseParam baseParam;
}






