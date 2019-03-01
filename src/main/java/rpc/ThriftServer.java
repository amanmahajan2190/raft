package rpc;

public interface ThriftServer {
    void startServer();
    void stopServer();
    ResponseData handleRequest(RequestData requestData);
}
