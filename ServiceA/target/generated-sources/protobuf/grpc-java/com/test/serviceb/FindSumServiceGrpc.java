package com.test.serviceb;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: findsum.proto")
public final class FindSumServiceGrpc {

  private FindSumServiceGrpc() {}

  public static final String SERVICE_NAME = "com.test.serviceb.FindSumService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.test.serviceb.SumRequest,
      com.test.serviceb.SumResponse> METHOD_FIND_SUM =
      io.grpc.MethodDescriptor.<com.test.serviceb.SumRequest, com.test.serviceb.SumResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.test.serviceb.FindSumService", "findSum"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.test.serviceb.SumRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.test.serviceb.SumResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FindSumServiceStub newStub(io.grpc.Channel channel) {
    return new FindSumServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FindSumServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new FindSumServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FindSumServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new FindSumServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class FindSumServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void findSum(com.test.serviceb.SumRequest request,
        io.grpc.stub.StreamObserver<com.test.serviceb.SumResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FIND_SUM, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_FIND_SUM,
            asyncUnaryCall(
              new MethodHandlers<
                com.test.serviceb.SumRequest,
                com.test.serviceb.SumResponse>(
                  this, METHODID_FIND_SUM)))
          .build();
    }
  }

  /**
   */
  public static final class FindSumServiceStub extends io.grpc.stub.AbstractStub<FindSumServiceStub> {
    private FindSumServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FindSumServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FindSumServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FindSumServiceStub(channel, callOptions);
    }

    /**
     */
    public void findSum(com.test.serviceb.SumRequest request,
        io.grpc.stub.StreamObserver<com.test.serviceb.SumResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_FIND_SUM, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FindSumServiceBlockingStub extends io.grpc.stub.AbstractStub<FindSumServiceBlockingStub> {
    private FindSumServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FindSumServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FindSumServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FindSumServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.test.serviceb.SumResponse findSum(com.test.serviceb.SumRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_FIND_SUM, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FindSumServiceFutureStub extends io.grpc.stub.AbstractStub<FindSumServiceFutureStub> {
    private FindSumServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FindSumServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FindSumServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FindSumServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.test.serviceb.SumResponse> findSum(
        com.test.serviceb.SumRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_FIND_SUM, getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_SUM = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FindSumServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FindSumServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_SUM:
          serviceImpl.findSum((com.test.serviceb.SumRequest) request,
              (io.grpc.stub.StreamObserver<com.test.serviceb.SumResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class FindSumServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.test.serviceb.Findsum.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (FindSumServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FindSumServiceDescriptorSupplier())
              .addMethod(METHOD_FIND_SUM)
              .build();
        }
      }
    }
    return result;
  }
}
