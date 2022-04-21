package com.test.servicea;

import com.test.serviceb.FindSumServiceGrpc;
import com.test.serviceb.SumRequest;
import com.test.serviceb.SumResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Service;

@Service
public class GRPCClientService {
    public int findSum(int num1, int num2) {
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 8083)
                .usePlaintext()
                .build();

        FindSumServiceGrpc.FindSumServiceBlockingStub stub =
                FindSumServiceGrpc.newBlockingStub(channel);

        SumResponse response = stub.findSum(
                SumRequest.newBuilder()
                        .setNum1(num1)
                        .setNum2(num2)
                        .build()
        );

        channel.shutdown();
        return response.getResult();
    }
}
