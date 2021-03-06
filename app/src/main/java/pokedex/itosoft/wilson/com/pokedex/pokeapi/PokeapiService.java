package pokedex.itosoft.wilson.com.pokedex.pokeapi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import pokedex.itosoft.wilson.com.pokedex.models.PokemonRespuesta;

/**
 * Created by wilsonurbano on 28/10/16.
 */

public interface PokeapiService {

    @GET("pokemon")
    Call<PokemonRespuesta> obtenerListaPokemon(@Query("limit") int limit, @Query("offset") int offset);


}
