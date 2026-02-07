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

import java.util.List;
import java.util.Map;

public interface PokemonApi  {
    Future<ApiResponse<PaginatedAbilitySummaryList>> abilityList(Integer limit, Integer offset, String q);
    Future<ApiResponse<AbilityDetail>> abilityRetrieve(String id);
    Future<ApiResponse<PaginatedCharacteristicSummaryList>> characteristicList(Integer limit, Integer offset, String q);
    Future<ApiResponse<CharacteristicDetail>> characteristicRetrieve(String id);
    Future<ApiResponse<PaginatedEggGroupSummaryList>> eggGroupList(Integer limit, Integer offset, String q);
    Future<ApiResponse<EggGroupDetail>> eggGroupRetrieve(String id);
    Future<ApiResponse<PaginatedGenderSummaryList>> genderList(Integer limit, Integer offset, String q);
    Future<ApiResponse<GenderDetail>> genderRetrieve(String id);
    Future<ApiResponse<PaginatedGrowthRateSummaryList>> growthRateList(Integer limit, Integer offset, String q);
    Future<ApiResponse<GrowthRateDetail>> growthRateRetrieve(String id);
    Future<ApiResponse<PaginatedMoveDamageClassSummaryList>> moveDamageClassList(Integer limit, Integer offset, String q);
    Future<ApiResponse<MoveDamageClassDetail>> moveDamageClassRetrieve(String id);
    Future<ApiResponse<PaginatedNatureSummaryList>> natureList(Integer limit, Integer offset, String q);
    Future<ApiResponse<NatureDetail>> natureRetrieve(String id);
    Future<ApiResponse<PaginatedPokeathlonStatSummaryList>> pokeathlonStatList(Integer limit, Integer offset, String q);
    Future<ApiResponse<PokeathlonStatDetail>> pokeathlonStatRetrieve(String id);
    Future<ApiResponse<PaginatedPokemonColorSummaryList>> pokemonColorList(Integer limit, Integer offset, String q);
    Future<ApiResponse<PokemonColorDetail>> pokemonColorRetrieve(String id);
    Future<ApiResponse<PaginatedPokemonFormSummaryList>> pokemonFormList(Integer limit, Integer offset, String q);
    Future<ApiResponse<PokemonFormDetail>> pokemonFormRetrieve(String id);
    Future<ApiResponse<PaginatedPokemonHabitatSummaryList>> pokemonHabitatList(Integer limit, Integer offset, String q);
    Future<ApiResponse<PokemonHabitatDetail>> pokemonHabitatRetrieve(String id);
    Future<ApiResponse<PaginatedPokemonSummaryList>> pokemonList(Integer limit, Integer offset, String q);
    Future<ApiResponse<PokemonDetail>> pokemonRetrieve(String id);
    Future<ApiResponse<PaginatedPokemonShapeSummaryList>> pokemonShapeList(Integer limit, Integer offset, String q);
    Future<ApiResponse<PokemonShapeDetail>> pokemonShapeRetrieve(String id);
    Future<ApiResponse<PaginatedPokemonSpeciesSummaryList>> pokemonSpeciesList(Integer limit, Integer offset, String q);
    Future<ApiResponse<PokemonSpeciesDetail>> pokemonSpeciesRetrieve(String id);
    Future<ApiResponse<PaginatedStatSummaryList>> statList(Integer limit, Integer offset, String q);
    Future<ApiResponse<StatDetail>> statRetrieve(String id);
    Future<ApiResponse<PaginatedTypeSummaryList>> typeList(Integer limit, Integer offset, String q);
    Future<ApiResponse<TypeDetail>> typeRetrieve(String id);
}
