package com.example

import io.grpc.stub.StreamObserver
import jakarta.inject.Singleton

@Singleton
class DemoService (): DemoServiceGrpc.DemoServiceImplBase() {

    override fun send(request: DemoRequest?, responseObserver: StreamObserver<DemoReply>?) {
        var message = DemoReply.newBuilder().setMessage("Hello World o/").build()

        responseObserver?.onNext(message)
        responseObserver?.onCompleted()
    }

}