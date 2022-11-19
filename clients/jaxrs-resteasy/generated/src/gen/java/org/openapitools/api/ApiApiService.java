package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-11-19T09:48:24.912647Z[Etc/UTC]")
public interface ApiApiService {
      Response abilityList(Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response abilityRead(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      Response berryFirmnessList(Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response berryFirmnessRead(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      Response berryFlavorList(Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response berryFlavorRead(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      Response berryList(Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response berryRead(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      Response characteristicList(Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response characteristicRead(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      Response contestEffectList(Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response contestEffectRead(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      Response contestTypeList(Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response contestTypeRead(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      Response eggGroupList(Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response eggGroupRead(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      Response encounterConditionList(Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response encounterConditionRead(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      Response encounterConditionValueList(Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response encounterConditionValueRead(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      Response encounterMethodList(Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response encounterMethodRead(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      Response evolutionChainList(Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response evolutionChainRead(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      Response evolutionTriggerList(Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response evolutionTriggerRead(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      Response genderList(Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response genderRead(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      Response generationList(Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response generationRead(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      Response growthRateList(Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response growthRateRead(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      Response itemAttributeList(Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response itemAttributeRead(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      Response itemCategoryList(Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response itemCategoryRead(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      Response itemFlingEffectList(Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response itemFlingEffectRead(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      Response itemList(Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response itemPocketList(Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response itemPocketRead(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      Response itemRead(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      Response languageList(Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response languageRead(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      Response locationAreaList(Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response locationAreaRead(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      Response locationList(Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response locationRead(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      Response machineList(Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response machineRead(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      Response moveAilmentList(Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response moveAilmentRead(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      Response moveBattleStyleList(Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response moveBattleStyleRead(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      Response moveCategoryList(Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response moveCategoryRead(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      Response moveDamageClassList(Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response moveDamageClassRead(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      Response moveLearnMethodList(Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response moveLearnMethodRead(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      Response moveList(Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response moveRead(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      Response moveTargetList(Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response moveTargetRead(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      Response natureList(Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response natureRead(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      Response palParkAreaList(Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response palParkAreaRead(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      Response pokeathlonStatList(Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response pokeathlonStatRead(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      Response pokedexList(Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response pokedexRead(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      Response pokemonColorList(Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response pokemonColorRead(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      Response pokemonFormList(Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response pokemonFormRead(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      Response pokemonHabitatList(Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response pokemonHabitatRead(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      Response pokemonList(Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response pokemonRead(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      Response pokemonShapeList(Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response pokemonShapeRead(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      Response pokemonSpeciesList(Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response pokemonSpeciesRead(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      Response regionList(Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response regionRead(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      Response statList(Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response statRead(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      Response superContestEffectList(Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response superContestEffectRead(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      Response typeList(Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response typeRead(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      Response versionGroupList(Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response versionGroupRead(Integer id,SecurityContext securityContext)
      throws NotFoundException;
      Response versionList(Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response versionRead(Integer id,SecurityContext securityContext)
      throws NotFoundException;
}
