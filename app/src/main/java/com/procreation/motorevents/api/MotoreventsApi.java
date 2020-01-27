package com.procreation.motorevents.api;

import com.procreation.motorevents.EventModel;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface MotoreventsApi {
    @GET("comingEvents")
    Call<List<EventModel>> getData();
}
