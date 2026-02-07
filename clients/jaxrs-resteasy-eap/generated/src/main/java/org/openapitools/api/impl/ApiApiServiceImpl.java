package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.AbilityDetail;
import org.openapitools.model.BerryDetail;
import org.openapitools.model.BerryFirmnessDetail;
import org.openapitools.model.BerryFlavorDetail;
import org.openapitools.model.CharacteristicDetail;
import org.openapitools.model.ContestEffectDetail;
import org.openapitools.model.ContestTypeDetail;
import org.openapitools.model.EggGroupDetail;
import org.openapitools.model.EncounterConditionDetail;
import org.openapitools.model.EncounterConditionValueDetail;
import org.openapitools.model.EncounterMethodDetail;
import org.openapitools.model.EvolutionChainDetail;
import org.openapitools.model.EvolutionTriggerDetail;
import org.openapitools.model.GenderDetail;
import org.openapitools.model.GenerationDetail;
import org.openapitools.model.GrowthRateDetail;
import org.openapitools.model.ItemAttributeDetail;
import org.openapitools.model.ItemCategoryDetail;
import org.openapitools.model.ItemDetail;
import org.openapitools.model.ItemFlingEffectDetail;
import org.openapitools.model.ItemPocketDetail;
import org.openapitools.model.LanguageDetail;
import org.openapitools.model.LocationAreaDetail;
import org.openapitools.model.LocationDetail;
import org.openapitools.model.MachineDetail;
import org.openapitools.model.MoveBattleStyleDetail;
import org.openapitools.model.MoveDamageClassDetail;
import org.openapitools.model.MoveDetail;
import org.openapitools.model.MoveLearnMethodDetail;
import org.openapitools.model.MoveMetaAilmentDetail;
import org.openapitools.model.MoveMetaCategoryDetail;
import org.openapitools.model.MoveTargetDetail;
import org.openapitools.model.NatureDetail;
import org.openapitools.model.PaginatedAbilitySummaryList;
import org.openapitools.model.PaginatedBerryFirmnessSummaryList;
import org.openapitools.model.PaginatedBerryFlavorSummaryList;
import org.openapitools.model.PaginatedBerrySummaryList;
import org.openapitools.model.PaginatedCharacteristicSummaryList;
import org.openapitools.model.PaginatedContestEffectSummaryList;
import org.openapitools.model.PaginatedContestTypeSummaryList;
import org.openapitools.model.PaginatedEggGroupSummaryList;
import org.openapitools.model.PaginatedEncounterConditionSummaryList;
import org.openapitools.model.PaginatedEncounterConditionValueSummaryList;
import org.openapitools.model.PaginatedEncounterMethodSummaryList;
import org.openapitools.model.PaginatedEvolutionChainSummaryList;
import org.openapitools.model.PaginatedEvolutionTriggerSummaryList;
import org.openapitools.model.PaginatedGenderSummaryList;
import org.openapitools.model.PaginatedGenerationSummaryList;
import org.openapitools.model.PaginatedGrowthRateSummaryList;
import org.openapitools.model.PaginatedItemAttributeSummaryList;
import org.openapitools.model.PaginatedItemCategorySummaryList;
import org.openapitools.model.PaginatedItemFlingEffectSummaryList;
import org.openapitools.model.PaginatedItemPocketSummaryList;
import org.openapitools.model.PaginatedItemSummaryList;
import org.openapitools.model.PaginatedLanguageSummaryList;
import org.openapitools.model.PaginatedLocationAreaSummaryList;
import org.openapitools.model.PaginatedLocationSummaryList;
import org.openapitools.model.PaginatedMachineSummaryList;
import org.openapitools.model.PaginatedMoveBattleStyleSummaryList;
import org.openapitools.model.PaginatedMoveDamageClassSummaryList;
import org.openapitools.model.PaginatedMoveLearnMethodSummaryList;
import org.openapitools.model.PaginatedMoveMetaAilmentSummaryList;
import org.openapitools.model.PaginatedMoveMetaCategorySummaryList;
import org.openapitools.model.PaginatedMoveSummaryList;
import org.openapitools.model.PaginatedMoveTargetSummaryList;
import org.openapitools.model.PaginatedNatureSummaryList;
import org.openapitools.model.PaginatedPalParkAreaSummaryList;
import org.openapitools.model.PaginatedPokeathlonStatSummaryList;
import org.openapitools.model.PaginatedPokedexSummaryList;
import org.openapitools.model.PaginatedPokemonColorSummaryList;
import org.openapitools.model.PaginatedPokemonFormSummaryList;
import org.openapitools.model.PaginatedPokemonHabitatSummaryList;
import org.openapitools.model.PaginatedPokemonShapeSummaryList;
import org.openapitools.model.PaginatedPokemonSpeciesSummaryList;
import org.openapitools.model.PaginatedPokemonSummaryList;
import org.openapitools.model.PaginatedRegionSummaryList;
import org.openapitools.model.PaginatedStatSummaryList;
import org.openapitools.model.PaginatedSuperContestEffectSummaryList;
import org.openapitools.model.PaginatedTypeSummaryList;
import org.openapitools.model.PaginatedVersionGroupSummaryList;
import org.openapitools.model.PaginatedVersionSummaryList;
import org.openapitools.model.PalParkAreaDetail;
import org.openapitools.model.PokeathlonStatDetail;
import org.openapitools.model.PokedexDetail;
import org.openapitools.model.PokemonColorDetail;
import org.openapitools.model.PokemonDetail;
import org.openapitools.model.PokemonEncountersRetrieve200ResponseInner;
import org.openapitools.model.PokemonFormDetail;
import org.openapitools.model.PokemonHabitatDetail;
import org.openapitools.model.PokemonShapeDetail;
import org.openapitools.model.PokemonSpeciesDetail;
import org.openapitools.model.RegionDetail;
import org.openapitools.model.StatDetail;
import org.openapitools.model.SuperContestEffectDetail;
import org.openapitools.model.TypeDetail;
import org.openapitools.model.VersionDetail;
import org.openapitools.model.VersionGroupDetail;

import java.util.List;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-02-07T04:17:52.397146649Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ApiApiServiceImpl implements ApiApi {
      public Response abilityList(Integer limit,Integer offset,String q,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response abilityRetrieve(String id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response berryFirmnessList(Integer limit,Integer offset,String q,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response berryFirmnessRetrieve(String id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response berryFlavorList(Integer limit,Integer offset,String q,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response berryFlavorRetrieve(String id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response berryList(Integer limit,Integer offset,String q,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response berryRetrieve(String id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response characteristicList(Integer limit,Integer offset,String q,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response characteristicRetrieve(String id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response contestEffectList(Integer limit,Integer offset,String q,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response contestEffectRetrieve(String id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response contestTypeList(Integer limit,Integer offset,String q,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response contestTypeRetrieve(String id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response eggGroupList(Integer limit,Integer offset,String q,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response eggGroupRetrieve(String id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response encounterConditionList(Integer limit,Integer offset,String q,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response encounterConditionRetrieve(String id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response encounterConditionValueList(Integer limit,Integer offset,String q,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response encounterConditionValueRetrieve(String id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response encounterMethodList(Integer limit,Integer offset,String q,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response encounterMethodRetrieve(String id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response evolutionChainList(Integer limit,Integer offset,String q,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response evolutionChainRetrieve(String id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response evolutionTriggerList(Integer limit,Integer offset,String q,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response evolutionTriggerRetrieve(String id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response genderList(Integer limit,Integer offset,String q,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response genderRetrieve(String id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response generationList(Integer limit,Integer offset,String q,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response generationRetrieve(String id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response growthRateList(Integer limit,Integer offset,String q,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response growthRateRetrieve(String id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response itemAttributeList(Integer limit,Integer offset,String q,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response itemAttributeRetrieve(String id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response itemCategoryList(Integer limit,Integer offset,String q,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response itemCategoryRetrieve(String id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response itemFlingEffectList(Integer limit,Integer offset,String q,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response itemFlingEffectRetrieve(String id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response itemList(Integer limit,Integer offset,String q,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response itemPocketList(Integer limit,Integer offset,String q,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response itemPocketRetrieve(String id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response itemRetrieve(String id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response languageList(Integer limit,Integer offset,String q,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response languageRetrieve(String id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response locationAreaList(Integer limit,Integer offset,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response locationAreaRetrieve(Integer id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response locationList(Integer limit,Integer offset,String q,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response locationRetrieve(String id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response machineList(Integer limit,Integer offset,String q,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response machineRetrieve(String id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response moveAilmentList(Integer limit,Integer offset,String q,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response moveAilmentRetrieve(String id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response moveBattleStyleList(Integer limit,Integer offset,String q,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response moveBattleStyleRetrieve(String id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response moveCategoryList(Integer limit,Integer offset,String q,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response moveCategoryRetrieve(String id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response moveDamageClassList(Integer limit,Integer offset,String q,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response moveDamageClassRetrieve(String id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response moveLearnMethodList(Integer limit,Integer offset,String q,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response moveLearnMethodRetrieve(String id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response moveList(Integer limit,Integer offset,String q,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response moveRetrieve(String id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response moveTargetList(Integer limit,Integer offset,String q,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response moveTargetRetrieve(String id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response natureList(Integer limit,Integer offset,String q,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response natureRetrieve(String id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response palParkAreaList(Integer limit,Integer offset,String q,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response palParkAreaRetrieve(String id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response pokeathlonStatList(Integer limit,Integer offset,String q,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response pokeathlonStatRetrieve(String id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response pokedexList(Integer limit,Integer offset,String q,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response pokedexRetrieve(String id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response pokemonColorList(Integer limit,Integer offset,String q,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response pokemonColorRetrieve(String id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response pokemonEncountersRetrieve(String pokemonId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response pokemonFormList(Integer limit,Integer offset,String q,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response pokemonFormRetrieve(String id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response pokemonHabitatList(Integer limit,Integer offset,String q,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response pokemonHabitatRetrieve(String id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response pokemonList(Integer limit,Integer offset,String q,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response pokemonRetrieve(String id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response pokemonShapeList(Integer limit,Integer offset,String q,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response pokemonShapeRetrieve(String id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response pokemonSpeciesList(Integer limit,Integer offset,String q,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response pokemonSpeciesRetrieve(String id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response regionList(Integer limit,Integer offset,String q,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response regionRetrieve(String id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response statList(Integer limit,Integer offset,String q,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response statRetrieve(String id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response superContestEffectList(Integer limit,Integer offset,String q,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response superContestEffectRetrieve(String id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response typeList(Integer limit,Integer offset,String q,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response typeRetrieve(String id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response versionGroupList(Integer limit,Integer offset,String q,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response versionGroupRetrieve(String id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response versionList(Integer limit,Integer offset,String q,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response versionRetrieve(String id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
