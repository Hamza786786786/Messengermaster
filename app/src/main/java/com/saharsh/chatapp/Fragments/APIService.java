package com.saharsh.chatapp.Fragments;

import com.saharsh.chatapp.Notifications.MyResponse;
import com.saharsh.chatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAA-kv17PI:APA91bG_gxnc8OVnp7Fqe4s3Q192cCvtTU2t8HbEuLChetsWXp2VcMrFcbZol-lDP0rW1g0Hy8HZNznCtvkwA6oOsXielZp6Yl7wM0VyPGtwInY-OVQqPOuQ13lhFa48DSfo61B4Se7J"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
