package com.ddpanda;

import com.ddpanda.service.HelloServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;


public class GrpcServer {
    public static void main(String[] args) throws Exception {
        Server server = ServerBuilder
                .forPort(8081)
                .addService(new HelloServiceImpl()).build();

        server.start();
        server.awaitTermination();
    }
}
