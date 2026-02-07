package controllers;

import apimodels.AbilityDetail;
import apimodels.CharacteristicDetail;
import apimodels.EggGroupDetail;
import apimodels.GenderDetail;
import apimodels.GrowthRateDetail;
import apimodels.MoveDamageClassDetail;
import apimodels.NatureDetail;
import apimodels.PaginatedAbilitySummaryList;
import apimodels.PaginatedCharacteristicSummaryList;
import apimodels.PaginatedEggGroupSummaryList;
import apimodels.PaginatedGenderSummaryList;
import apimodels.PaginatedGrowthRateSummaryList;
import apimodels.PaginatedMoveDamageClassSummaryList;
import apimodels.PaginatedNatureSummaryList;
import apimodels.PaginatedPokeathlonStatSummaryList;
import apimodels.PaginatedPokemonColorSummaryList;
import apimodels.PaginatedPokemonFormSummaryList;
import apimodels.PaginatedPokemonHabitatSummaryList;
import apimodels.PaginatedPokemonShapeSummaryList;
import apimodels.PaginatedPokemonSpeciesSummaryList;
import apimodels.PaginatedPokemonSummaryList;
import apimodels.PaginatedStatSummaryList;
import apimodels.PaginatedTypeSummaryList;
import apimodels.PokeathlonStatDetail;
import apimodels.PokemonColorDetail;
import apimodels.PokemonDetail;
import apimodels.PokemonFormDetail;
import apimodels.PokemonHabitatDetail;
import apimodels.PokemonShapeDetail;
import apimodels.PokemonSpeciesDetail;
import apimodels.StatDetail;
import apimodels.TypeDetail;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-07T04:17:12.303882205Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokemonApiControllerImp extends PokemonApiControllerImpInterface {
    @Override
    public PaginatedAbilitySummaryList abilityList(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        //Do your magic!!!
        return new PaginatedAbilitySummaryList();
    }

    @Override
    public AbilityDetail abilityRetrieve(Http.Request request, String id) throws Exception {
        //Do your magic!!!
        return new AbilityDetail();
    }

    @Override
    public PaginatedCharacteristicSummaryList characteristicList(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        //Do your magic!!!
        return new PaginatedCharacteristicSummaryList();
    }

    @Override
    public CharacteristicDetail characteristicRetrieve(Http.Request request, String id) throws Exception {
        //Do your magic!!!
        return new CharacteristicDetail();
    }

    @Override
    public PaginatedEggGroupSummaryList eggGroupList(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        //Do your magic!!!
        return new PaginatedEggGroupSummaryList();
    }

    @Override
    public EggGroupDetail eggGroupRetrieve(Http.Request request, String id) throws Exception {
        //Do your magic!!!
        return new EggGroupDetail();
    }

    @Override
    public PaginatedGenderSummaryList genderList(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        //Do your magic!!!
        return new PaginatedGenderSummaryList();
    }

    @Override
    public GenderDetail genderRetrieve(Http.Request request, String id) throws Exception {
        //Do your magic!!!
        return new GenderDetail();
    }

    @Override
    public PaginatedGrowthRateSummaryList growthRateList(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        //Do your magic!!!
        return new PaginatedGrowthRateSummaryList();
    }

    @Override
    public GrowthRateDetail growthRateRetrieve(Http.Request request, String id) throws Exception {
        //Do your magic!!!
        return new GrowthRateDetail();
    }

    @Override
    public PaginatedMoveDamageClassSummaryList moveDamageClassList(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        //Do your magic!!!
        return new PaginatedMoveDamageClassSummaryList();
    }

    @Override
    public MoveDamageClassDetail moveDamageClassRetrieve(Http.Request request, String id) throws Exception {
        //Do your magic!!!
        return new MoveDamageClassDetail();
    }

    @Override
    public PaginatedNatureSummaryList natureList(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        //Do your magic!!!
        return new PaginatedNatureSummaryList();
    }

    @Override
    public NatureDetail natureRetrieve(Http.Request request, String id) throws Exception {
        //Do your magic!!!
        return new NatureDetail();
    }

    @Override
    public PaginatedPokeathlonStatSummaryList pokeathlonStatList(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        //Do your magic!!!
        return new PaginatedPokeathlonStatSummaryList();
    }

    @Override
    public PokeathlonStatDetail pokeathlonStatRetrieve(Http.Request request, String id) throws Exception {
        //Do your magic!!!
        return new PokeathlonStatDetail();
    }

    @Override
    public PaginatedPokemonColorSummaryList pokemonColorList(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        //Do your magic!!!
        return new PaginatedPokemonColorSummaryList();
    }

    @Override
    public PokemonColorDetail pokemonColorRetrieve(Http.Request request, String id) throws Exception {
        //Do your magic!!!
        return new PokemonColorDetail();
    }

    @Override
    public PaginatedPokemonFormSummaryList pokemonFormList(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        //Do your magic!!!
        return new PaginatedPokemonFormSummaryList();
    }

    @Override
    public PokemonFormDetail pokemonFormRetrieve(Http.Request request, String id) throws Exception {
        //Do your magic!!!
        return new PokemonFormDetail();
    }

    @Override
    public PaginatedPokemonHabitatSummaryList pokemonHabitatList(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        //Do your magic!!!
        return new PaginatedPokemonHabitatSummaryList();
    }

    @Override
    public PokemonHabitatDetail pokemonHabitatRetrieve(Http.Request request, String id) throws Exception {
        //Do your magic!!!
        return new PokemonHabitatDetail();
    }

    @Override
    public PaginatedPokemonSummaryList pokemonList(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        //Do your magic!!!
        return new PaginatedPokemonSummaryList();
    }

    @Override
    public PokemonDetail pokemonRetrieve(Http.Request request, String id) throws Exception {
        //Do your magic!!!
        return new PokemonDetail();
    }

    @Override
    public PaginatedPokemonShapeSummaryList pokemonShapeList(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        //Do your magic!!!
        return new PaginatedPokemonShapeSummaryList();
    }

    @Override
    public PokemonShapeDetail pokemonShapeRetrieve(Http.Request request, String id) throws Exception {
        //Do your magic!!!
        return new PokemonShapeDetail();
    }

    @Override
    public PaginatedPokemonSpeciesSummaryList pokemonSpeciesList(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        //Do your magic!!!
        return new PaginatedPokemonSpeciesSummaryList();
    }

    @Override
    public PokemonSpeciesDetail pokemonSpeciesRetrieve(Http.Request request, String id) throws Exception {
        //Do your magic!!!
        return new PokemonSpeciesDetail();
    }

    @Override
    public PaginatedStatSummaryList statList(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        //Do your magic!!!
        return new PaginatedStatSummaryList();
    }

    @Override
    public StatDetail statRetrieve(Http.Request request, String id) throws Exception {
        //Do your magic!!!
        return new StatDetail();
    }

    @Override
    public PaginatedTypeSummaryList typeList(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        //Do your magic!!!
        return new PaginatedTypeSummaryList();
    }

    @Override
    public TypeDetail typeRetrieve(Http.Request request, String id) throws Exception {
        //Do your magic!!!
        return new TypeDetail();
    }

}
