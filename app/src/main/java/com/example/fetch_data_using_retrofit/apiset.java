package com.example.fetch_data_using_retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface apiset {
    @GET("json_fetch")
  Call<List<ResponceModel>>  getdata();

}
