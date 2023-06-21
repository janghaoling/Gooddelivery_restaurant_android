package com.gooddelivery.restau.messages.communicator;

public interface DataMessage<T> {

    void onReceiveData(T t);
}
