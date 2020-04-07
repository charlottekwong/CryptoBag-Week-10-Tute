package au.edu.unsw.infs3634.cryptobag.Entities;

import au.edu.unsw.infs3634.cryptobag.Entities.Coin;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface CoinService {

    @GET("/api/tickers/")
    Call<CoinLoreResponse> getCoins();

}
