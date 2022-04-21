package com.test.serviceb;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class FindSumService extends FindSumServiceGrpc.FindSumServiceImplBase{

    @Override
    public void findSum(SumRequest request, StreamObserver<SumResponse> responseObserver) {
        int result = request.getNum1() + request.getNum2();

        SumResponse response = SumResponse
                                        .newBuilder()
                                        .setResult(result)
                                        .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
