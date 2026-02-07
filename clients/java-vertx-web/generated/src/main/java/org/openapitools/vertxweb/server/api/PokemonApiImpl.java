package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AbilityDetail;
import org.openapitools.vertxweb.server.model.CharacteristicDetail;
import org.openapitools.vertxweb.server.model.EggGroupDetail;
import org.openapitools.vertxweb.server.model.GenderDetail;
import org.openapitools.vertxweb.server.model.GrowthRateDetail;
import org.openapitools.vertxweb.server.model.MoveDamageClassDetail;
import org.openapitools.vertxweb.server.model.NatureDetail;
import org.openapitools.vertxweb.server.model.PaginatedAbilitySummaryList;
import org.openapitools.vertxweb.server.model.PaginatedCharacteristicSummaryList;
import org.openapitools.vertxweb.server.model.PaginatedEggGroupSummaryList;
import org.openapitools.vertxweb.server.model.PaginatedGenderSummaryList;
import org.openapitools.vertxweb.server.model.PaginatedGrowthRateSummaryList;
import org.openapitools.vertxweb.server.model.PaginatedMoveDamageClassSummaryList;
import org.openapitools.vertxweb.server.model.PaginatedNatureSummaryList;
import org.openapitools.vertxweb.server.model.PaginatedPokeathlonStatSummaryList;
import org.openapitools.vertxweb.server.model.PaginatedPokemonColorSummaryList;
import org.openapitools.vertxweb.server.model.PaginatedPokemonFormSummaryList;
import org.openapitools.vertxweb.server.model.PaginatedPokemonHabitatSummaryList;
import org.openapitools.vertxweb.server.model.PaginatedPokemonShapeSummaryList;
import org.openapitools.vertxweb.server.model.PaginatedPokemonSpeciesSummaryList;
import org.openapitools.vertxweb.server.model.PaginatedPokemonSummaryList;
import org.openapitools.vertxweb.server.model.PaginatedStatSummaryList;
import org.openapitools.vertxweb.server.model.PaginatedTypeSummaryList;
import org.openapitools.vertxweb.server.model.PokeathlonStatDetail;
import org.openapitools.vertxweb.server.model.PokemonColorDetail;
import org.openapitools.vertxweb.server.model.PokemonDetail;
import org.openapitools.vertxweb.server.model.PokemonFormDetail;
import org.openapitools.vertxweb.server.model.PokemonHabitatDetail;
import org.openapitools.vertxweb.server.model.PokemonShapeDetail;
import org.openapitools.vertxweb.server.model.PokemonSpeciesDetail;
import org.openapitools.vertxweb.server.model.StatDetail;
import org.openapitools.vertxweb.server.model.TypeDetail;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class PokemonApiImpl implements PokemonApi {
    public Future<ApiResponse<PaginatedAbilitySummaryList>> abilityList(Integer limit, Integer offset, String q) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<AbilityDetail>> abilityRetrieve(String id) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PaginatedCharacteristicSummaryList>> characteristicList(Integer limit, Integer offset, String q) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CharacteristicDetail>> characteristicRetrieve(String id) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PaginatedEggGroupSummaryList>> eggGroupList(Integer limit, Integer offset, String q) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<EggGroupDetail>> eggGroupRetrieve(String id) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PaginatedGenderSummaryList>> genderList(Integer limit, Integer offset, String q) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GenderDetail>> genderRetrieve(String id) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PaginatedGrowthRateSummaryList>> growthRateList(Integer limit, Integer offset, String q) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GrowthRateDetail>> growthRateRetrieve(String id) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PaginatedMoveDamageClassSummaryList>> moveDamageClassList(Integer limit, Integer offset, String q) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<MoveDamageClassDetail>> moveDamageClassRetrieve(String id) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PaginatedNatureSummaryList>> natureList(Integer limit, Integer offset, String q) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<NatureDetail>> natureRetrieve(String id) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PaginatedPokeathlonStatSummaryList>> pokeathlonStatList(Integer limit, Integer offset, String q) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PokeathlonStatDetail>> pokeathlonStatRetrieve(String id) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PaginatedPokemonColorSummaryList>> pokemonColorList(Integer limit, Integer offset, String q) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PokemonColorDetail>> pokemonColorRetrieve(String id) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PaginatedPokemonFormSummaryList>> pokemonFormList(Integer limit, Integer offset, String q) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PokemonFormDetail>> pokemonFormRetrieve(String id) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PaginatedPokemonHabitatSummaryList>> pokemonHabitatList(Integer limit, Integer offset, String q) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PokemonHabitatDetail>> pokemonHabitatRetrieve(String id) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PaginatedPokemonSummaryList>> pokemonList(Integer limit, Integer offset, String q) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PokemonDetail>> pokemonRetrieve(String id) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PaginatedPokemonShapeSummaryList>> pokemonShapeList(Integer limit, Integer offset, String q) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PokemonShapeDetail>> pokemonShapeRetrieve(String id) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PaginatedPokemonSpeciesSummaryList>> pokemonSpeciesList(Integer limit, Integer offset, String q) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PokemonSpeciesDetail>> pokemonSpeciesRetrieve(String id) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PaginatedStatSummaryList>> statList(Integer limit, Integer offset, String q) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<StatDetail>> statRetrieve(String id) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PaginatedTypeSummaryList>> typeList(Integer limit, Integer offset, String q) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<TypeDetail>> typeRetrieve(String id) {
        return Future.failedFuture(new HttpException(501));
    }

}
