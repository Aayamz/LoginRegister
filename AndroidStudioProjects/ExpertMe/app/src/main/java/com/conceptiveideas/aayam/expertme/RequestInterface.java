package com.conceptiveideas.aayam.expertme;

import com.conceptiveideas.aayam.expertme.ServerRequest;
import com.conceptiveideas.aayam.expertme.ServerResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RequestInterface {

    @POST("Android/")
    Call<ServerResponse> operation(@Body ServerRequest request);

}
