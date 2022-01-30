package com.contest.contestnotifier;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {


@GET("code_chef")
    Call<List<postPojo>> codechef();

@GET("codeforces")
    Call<List<postPojo>> codeforces();

@GET("top_coder")
    Call<List<postPojo>> topcoder();

@GET("at_coder")
    Call<List<postPojo>> atcoder();

@GET("hacker_rank")
    Call<List<postPojo>> hackerrank();

@GET("hacker_earth")
    Call<List<postPojo>> hackerearth();

@GET("kick_start")
    Call<List<postPojo>> kickstart();

@GET("leet_code")
    Call<List<postPojo>> leetcode();

}

