package org.openapitools.server.api;

import org.openapitools.server.model.AbilityDetail;
import org.openapitools.server.model.CharacteristicDetail;
import org.openapitools.server.model.EggGroupDetail;
import org.openapitools.server.model.GenderDetail;
import org.openapitools.server.model.GrowthRateDetail;
import java.util.HexFormat;
import org.openapitools.server.model.MoveDamageClassDetail;
import org.openapitools.server.model.NatureDetail;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.openapitools.server.model.PaginatedAbilitySummaryList;
import org.openapitools.server.model.PaginatedCharacteristicSummaryList;
import org.openapitools.server.model.PaginatedEggGroupSummaryList;
import org.openapitools.server.model.PaginatedGenderSummaryList;
import org.openapitools.server.model.PaginatedGrowthRateSummaryList;
import org.openapitools.server.model.PaginatedMoveDamageClassSummaryList;
import org.openapitools.server.model.PaginatedNatureSummaryList;
import org.openapitools.server.model.PaginatedPokeathlonStatSummaryList;
import org.openapitools.server.model.PaginatedPokemonColorSummaryList;
import org.openapitools.server.model.PaginatedPokemonFormSummaryList;
import org.openapitools.server.model.PaginatedPokemonHabitatSummaryList;
import org.openapitools.server.model.PaginatedPokemonShapeSummaryList;
import org.openapitools.server.model.PaginatedPokemonSpeciesSummaryList;
import org.openapitools.server.model.PaginatedPokemonSummaryList;
import org.openapitools.server.model.PaginatedStatSummaryList;
import org.openapitools.server.model.PaginatedTypeSummaryList;
import org.openapitools.server.model.PokeathlonStatDetail;
import org.openapitools.server.model.PokemonColorDetail;
import org.openapitools.server.model.PokemonDetail;
import org.openapitools.server.model.PokemonFormDetail;
import org.openapitools.server.model.PokemonHabitatDetail;
import org.openapitools.server.model.PokemonShapeDetail;
import org.openapitools.server.model.PokemonSpeciesDetail;
import org.openapitools.server.model.StatDetail;
import io.helidon.http.Status;
import org.openapitools.server.model.TypeDetail;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Pokemon'",
                             version = "7.24.0")
public interface PokemonService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.get("/ability/", this::abilityList);
        rules.get("/ability/{id}/", this::abilityRetrieve);
        rules.get("/characteristic/", this::characteristicList);
        rules.get("/characteristic/{id}/", this::characteristicRetrieve);
        rules.get("/egg-group/", this::eggGroupList);
        rules.get("/egg-group/{id}/", this::eggGroupRetrieve);
        rules.get("/gender/", this::genderList);
        rules.get("/gender/{id}/", this::genderRetrieve);
        rules.get("/growth-rate/", this::growthRateList);
        rules.get("/growth-rate/{id}/", this::growthRateRetrieve);
        rules.get("/move-damage-class/", this::moveDamageClassList);
        rules.get("/move-damage-class/{id}/", this::moveDamageClassRetrieve);
        rules.get("/nature/", this::natureList);
        rules.get("/nature/{id}/", this::natureRetrieve);
        rules.get("/pokeathlon-stat/", this::pokeathlonStatList);
        rules.get("/pokeathlon-stat/{id}/", this::pokeathlonStatRetrieve);
        rules.get("/pokemon-color/", this::pokemonColorList);
        rules.get("/pokemon-color/{id}/", this::pokemonColorRetrieve);
        rules.get("/pokemon-form/", this::pokemonFormList);
        rules.get("/pokemon-form/{id}/", this::pokemonFormRetrieve);
        rules.get("/pokemon-habitat/", this::pokemonHabitatList);
        rules.get("/pokemon-habitat/{id}/", this::pokemonHabitatRetrieve);
        rules.get("/pokemon/", this::pokemonList);
        rules.get("/pokemon/{id}/", this::pokemonRetrieve);
        rules.get("/pokemon-shape/", this::pokemonShapeList);
        rules.get("/pokemon-shape/{id}/", this::pokemonShapeRetrieve);
        rules.get("/pokemon-species/", this::pokemonSpeciesList);
        rules.get("/pokemon-species/{id}/", this::pokemonSpeciesRetrieve);
        rules.get("/stat/", this::statList);
        rules.get("/stat/{id}/", this::statRetrieve);
        rules.get("/type/", this::typeList);
        rules.get("/type/{id}/", this::typeRetrieve);
    }


    /**
     * GET /api/v2/ability/.
     *
     * @param request the server request
     * @param response the server response
     */
    void abilityList(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/ability/{id}/.
     *
     * @param request the server request
     * @param response the server response
     */
    void abilityRetrieve(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/characteristic/ : List charecterictics.
     *
     * @param request the server request
     * @param response the server response
     */
    void characteristicList(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/characteristic/{id}/ : Get characteristic.
     *
     * @param request the server request
     * @param response the server response
     */
    void characteristicRetrieve(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/egg-group/ : List egg groups.
     *
     * @param request the server request
     * @param response the server response
     */
    void eggGroupList(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/egg-group/{id}/ : Get egg group.
     *
     * @param request the server request
     * @param response the server response
     */
    void eggGroupRetrieve(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/gender/ : List genders.
     *
     * @param request the server request
     * @param response the server response
     */
    void genderList(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/gender/{id}/ : Get gender.
     *
     * @param request the server request
     * @param response the server response
     */
    void genderRetrieve(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/growth-rate/ : List growth rates.
     *
     * @param request the server request
     * @param response the server response
     */
    void growthRateList(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/growth-rate/{id}/ : Get growth rate.
     *
     * @param request the server request
     * @param response the server response
     */
    void growthRateRetrieve(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/move-damage-class/ : List move damage classes.
     *
     * @param request the server request
     * @param response the server response
     */
    void moveDamageClassList(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/move-damage-class/{id}/ : Get move damage class.
     *
     * @param request the server request
     * @param response the server response
     */
    void moveDamageClassRetrieve(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/nature/ : List natures.
     *
     * @param request the server request
     * @param response the server response
     */
    void natureList(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/nature/{id}/ : Get nature.
     *
     * @param request the server request
     * @param response the server response
     */
    void natureRetrieve(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/pokeathlon-stat/ : List pokeathlon stats.
     *
     * @param request the server request
     * @param response the server response
     */
    void pokeathlonStatList(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/pokeathlon-stat/{id}/ : Get pokeathlon stat.
     *
     * @param request the server request
     * @param response the server response
     */
    void pokeathlonStatRetrieve(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/pokemon-color/ : List pokemon colors.
     *
     * @param request the server request
     * @param response the server response
     */
    void pokemonColorList(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/pokemon-color/{id}/ : Get pokemon color.
     *
     * @param request the server request
     * @param response the server response
     */
    void pokemonColorRetrieve(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/pokemon-form/ : List pokemon forms.
     *
     * @param request the server request
     * @param response the server response
     */
    void pokemonFormList(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/pokemon-form/{id}/ : Get pokemon form.
     *
     * @param request the server request
     * @param response the server response
     */
    void pokemonFormRetrieve(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/pokemon-habitat/ : List pokemom habitas.
     *
     * @param request the server request
     * @param response the server response
     */
    void pokemonHabitatList(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/pokemon-habitat/{id}/ : Get pokemom habita.
     *
     * @param request the server request
     * @param response the server response
     */
    void pokemonHabitatRetrieve(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/pokemon/ : List pokemon.
     *
     * @param request the server request
     * @param response the server response
     */
    void pokemonList(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/pokemon/{id}/ : Get pokemon.
     *
     * @param request the server request
     * @param response the server response
     */
    void pokemonRetrieve(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/pokemon-shape/ : List pokemon shapes.
     *
     * @param request the server request
     * @param response the server response
     */
    void pokemonShapeList(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/pokemon-shape/{id}/ : Get pokemon shape.
     *
     * @param request the server request
     * @param response the server response
     */
    void pokemonShapeRetrieve(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/pokemon-species/ : List pokemon species.
     *
     * @param request the server request
     * @param response the server response
     */
    void pokemonSpeciesList(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/pokemon-species/{id}/ : Get pokemon species.
     *
     * @param request the server request
     * @param response the server response
     */
    void pokemonSpeciesRetrieve(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/stat/ : List stats.
     *
     * @param request the server request
     * @param response the server response
     */
    void statList(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/stat/{id}/ : Get stat.
     *
     * @param request the server request
     * @param response the server response
     */
    void statRetrieve(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/type/ : List types.
     *
     * @param request the server request
     * @param response the server response
     */
    void typeList(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/type/{id}/ : Get types.
     *
     * @param request the server request
     * @param response the server response
     */
    void typeRetrieve(ServerRequest request, ServerResponse response);
}
