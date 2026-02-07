package org.openapitools.api;

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
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-07T15:23:57.425124504Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public interface ApiApiService {
      Response abilityList(Integer limit,Integer offset,String q,SecurityContext securityContext)
      throws NotFoundException;
      Response abilityRetrieve(String id,SecurityContext securityContext)
      throws NotFoundException;
      Response berryFirmnessList(Integer limit,Integer offset,String q,SecurityContext securityContext)
      throws NotFoundException;
      Response berryFirmnessRetrieve(String id,SecurityContext securityContext)
      throws NotFoundException;
      Response berryFlavorList(Integer limit,Integer offset,String q,SecurityContext securityContext)
      throws NotFoundException;
      Response berryFlavorRetrieve(String id,SecurityContext securityContext)
      throws NotFoundException;
      Response berryList(Integer limit,Integer offset,String q,SecurityContext securityContext)
      throws NotFoundException;
      Response berryRetrieve(String id,SecurityContext securityContext)
      throws NotFoundException;
      Response characteristicList(Integer limit,Integer offset,String q,SecurityContext securityContext)
      throws NotFoundException;
      Response characteristicRetrieve(String id,SecurityContext securityContext)
      throws NotFoundException;
      Response contestEffectList(Integer limit,Integer offset,String q,SecurityContext securityContext)
      throws NotFoundException;
      Response contestEffectRetrieve(String id,SecurityContext securityContext)
      throws NotFoundException;
      Response contestTypeList(Integer limit,Integer offset,String q,SecurityContext securityContext)
      throws NotFoundException;
      Response contestTypeRetrieve(String id,SecurityContext securityContext)
      throws NotFoundException;
      Response eggGroupList(Integer limit,Integer offset,String q,SecurityContext securityContext)
      throws NotFoundException;
      Response eggGroupRetrieve(String id,SecurityContext securityContext)
      throws NotFoundException;
      Response encounterConditionList(Integer limit,Integer offset,String q,SecurityContext securityContext)
      throws NotFoundException;
      Response encounterConditionRetrieve(String id,SecurityContext securityContext)
      throws NotFoundException;
      Response encounterConditionValueList(Integer limit,Integer offset,String q,SecurityContext securityContext)
      throws NotFoundException;
      Response encounterConditionValueRetrieve(String id,SecurityContext securityContext)
      throws NotFoundException;
      Response encounterMethodList(Integer limit,Integer offset,String q,SecurityContext securityContext)
      throws NotFoundException;
      Response encounterMethodRetrieve(String id,SecurityContext securityContext)
      throws NotFoundException;
      Response evolutionChainList(Integer limit,Integer offset,String q,SecurityContext securityContext)
      throws NotFoundException;
      Response evolutionChainRetrieve(String id,SecurityContext securityContext)
      throws NotFoundException;
      Response evolutionTriggerList(Integer limit,Integer offset,String q,SecurityContext securityContext)
      throws NotFoundException;
      Response evolutionTriggerRetrieve(String id,SecurityContext securityContext)
      throws NotFoundException;
      Response genderList(Integer limit,Integer offset,String q,SecurityContext securityContext)
      throws NotFoundException;
      Response genderRetrieve(String id,SecurityContext securityContext)
      throws NotFoundException;
      Response generationList(Integer limit,Integer offset,String q,SecurityContext securityContext)
      throws NotFoundException;
      Response generationRetrieve(String id,SecurityContext securityContext)
      throws NotFoundException;
      Response growthRateList(Integer limit,Integer offset,String q,SecurityContext securityContext)
      throws NotFoundException;
      Response growthRateRetrieve(String id,SecurityContext securityContext)
      throws NotFoundException;
      Response itemAttributeList(Integer limit,Integer offset,String q,SecurityContext securityContext)
      throws NotFoundException;
      Response itemAttributeRetrieve(String id,SecurityContext securityContext)
      throws NotFoundException;
      Response itemCategoryList(Integer limit,Integer offset,String q,SecurityContext securityContext)
      throws NotFoundException;
      Response itemCategoryRetrieve(String id,SecurityContext securityContext)
      throws NotFoundException;
      Response itemFlingEffectList(Integer limit,Integer offset,String q,SecurityContext securityContext)
      throws NotFoundException;
      Response itemFlingEffectRetrieve(String id,SecurityContext securityContext)
      throws NotFoundException;
      Response itemList(Integer limit,Integer offset,String q,SecurityContext securityContext)
      throws NotFoundException;
      Response itemPocketList(Integer limit,Integer offset,String q,SecurityContext securityContext)
      throws NotFoundException;
      Response itemPocketRetrieve(String id,SecurityContext securityContext)
      throws NotFoundException;
      Response itemRetrieve(String id,SecurityContext securityContext)
      throws NotFoundException;
      Response languageList(Integer limit,Integer offset,String q,SecurityContext securityContext)
      throws NotFoundException;
      Response languageRetrieve(String id,SecurityContext securityContext)
      throws NotFoundException;
      Response locationAreaList(Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response locationAreaRetrieve(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      Response locationList(Integer limit,Integer offset,String q,SecurityContext securityContext)
      throws NotFoundException;
      Response locationRetrieve(String id,SecurityContext securityContext)
      throws NotFoundException;
      Response machineList(Integer limit,Integer offset,String q,SecurityContext securityContext)
      throws NotFoundException;
      Response machineRetrieve(String id,SecurityContext securityContext)
      throws NotFoundException;
      Response moveAilmentList(Integer limit,Integer offset,String q,SecurityContext securityContext)
      throws NotFoundException;
      Response moveAilmentRetrieve(String id,SecurityContext securityContext)
      throws NotFoundException;
      Response moveBattleStyleList(Integer limit,Integer offset,String q,SecurityContext securityContext)
      throws NotFoundException;
      Response moveBattleStyleRetrieve(String id,SecurityContext securityContext)
      throws NotFoundException;
      Response moveCategoryList(Integer limit,Integer offset,String q,SecurityContext securityContext)
      throws NotFoundException;
      Response moveCategoryRetrieve(String id,SecurityContext securityContext)
      throws NotFoundException;
      Response moveDamageClassList(Integer limit,Integer offset,String q,SecurityContext securityContext)
      throws NotFoundException;
      Response moveDamageClassRetrieve(String id,SecurityContext securityContext)
      throws NotFoundException;
      Response moveLearnMethodList(Integer limit,Integer offset,String q,SecurityContext securityContext)
      throws NotFoundException;
      Response moveLearnMethodRetrieve(String id,SecurityContext securityContext)
      throws NotFoundException;
      Response moveList(Integer limit,Integer offset,String q,SecurityContext securityContext)
      throws NotFoundException;
      Response moveRetrieve(String id,SecurityContext securityContext)
      throws NotFoundException;
      Response moveTargetList(Integer limit,Integer offset,String q,SecurityContext securityContext)
      throws NotFoundException;
      Response moveTargetRetrieve(String id,SecurityContext securityContext)
      throws NotFoundException;
      Response natureList(Integer limit,Integer offset,String q,SecurityContext securityContext)
      throws NotFoundException;
      Response natureRetrieve(String id,SecurityContext securityContext)
      throws NotFoundException;
      Response palParkAreaList(Integer limit,Integer offset,String q,SecurityContext securityContext)
      throws NotFoundException;
      Response palParkAreaRetrieve(String id,SecurityContext securityContext)
      throws NotFoundException;
      Response pokeathlonStatList(Integer limit,Integer offset,String q,SecurityContext securityContext)
      throws NotFoundException;
      Response pokeathlonStatRetrieve(String id,SecurityContext securityContext)
      throws NotFoundException;
      Response pokedexList(Integer limit,Integer offset,String q,SecurityContext securityContext)
      throws NotFoundException;
      Response pokedexRetrieve(String id,SecurityContext securityContext)
      throws NotFoundException;
      Response pokemonColorList(Integer limit,Integer offset,String q,SecurityContext securityContext)
      throws NotFoundException;
      Response pokemonColorRetrieve(String id,SecurityContext securityContext)
      throws NotFoundException;
      Response pokemonFormList(Integer limit,Integer offset,String q,SecurityContext securityContext)
      throws NotFoundException;
      Response pokemonFormRetrieve(String id,SecurityContext securityContext)
      throws NotFoundException;
      Response pokemonHabitatList(Integer limit,Integer offset,String q,SecurityContext securityContext)
      throws NotFoundException;
      Response pokemonHabitatRetrieve(String id,SecurityContext securityContext)
      throws NotFoundException;
      Response pokemonList(Integer limit,Integer offset,String q,SecurityContext securityContext)
      throws NotFoundException;
      Response pokemonRetrieve(String id,SecurityContext securityContext)
      throws NotFoundException;
      Response pokemonShapeList(Integer limit,Integer offset,String q,SecurityContext securityContext)
      throws NotFoundException;
      Response pokemonShapeRetrieve(String id,SecurityContext securityContext)
      throws NotFoundException;
      Response pokemonSpeciesList(Integer limit,Integer offset,String q,SecurityContext securityContext)
      throws NotFoundException;
      Response pokemonSpeciesRetrieve(String id,SecurityContext securityContext)
      throws NotFoundException;
      Response regionList(Integer limit,Integer offset,String q,SecurityContext securityContext)
      throws NotFoundException;
      Response regionRetrieve(String id,SecurityContext securityContext)
      throws NotFoundException;
      Response statList(Integer limit,Integer offset,String q,SecurityContext securityContext)
      throws NotFoundException;
      Response statRetrieve(String id,SecurityContext securityContext)
      throws NotFoundException;
      Response superContestEffectList(Integer limit,Integer offset,String q,SecurityContext securityContext)
      throws NotFoundException;
      Response superContestEffectRetrieve(String id,SecurityContext securityContext)
      throws NotFoundException;
      Response typeList(Integer limit,Integer offset,String q,SecurityContext securityContext)
      throws NotFoundException;
      Response typeRetrieve(String id,SecurityContext securityContext)
      throws NotFoundException;
      Response versionGroupList(Integer limit,Integer offset,String q,SecurityContext securityContext)
      throws NotFoundException;
      Response versionGroupRetrieve(String id,SecurityContext securityContext)
      throws NotFoundException;
      Response versionList(Integer limit,Integer offset,String q,SecurityContext securityContext)
      throws NotFoundException;
      Response versionRetrieve(String id,SecurityContext securityContext)
      throws NotFoundException;


}
