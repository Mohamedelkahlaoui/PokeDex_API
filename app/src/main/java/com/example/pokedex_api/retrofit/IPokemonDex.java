package com.example.pokedex_api.retrofit;



import com.example.pokedex_api.model.Pokedex;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface IPokemonDex {
    @GET("pokedex.json")
    Observable<Pokedex> getListPokemon();
}
