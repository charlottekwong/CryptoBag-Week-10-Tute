package au.edu.unsw.infs3634.cryptobag.Entities;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CoinService {

    @GET("/api/tickers/")
    Call<CoinLoreResponse> getCoins();

}
