package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;


import java.util.List;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2024-07-09T12:14:36.402178476Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public interface ApiApiService {
      public Response abilityList(Integer limit, Integer offset, SecurityContext securityContext);
      public Response abilityRead(Integer id, SecurityContext securityContext);
      public Response berryFirmnessList(Integer limit, Integer offset, SecurityContext securityContext);
      public Response berryFirmnessRead(Integer id, SecurityContext securityContext);
      public Response berryFlavorList(Integer limit, Integer offset, SecurityContext securityContext);
      public Response berryFlavorRead(Integer id, SecurityContext securityContext);
      public Response berryList(Integer limit, Integer offset, SecurityContext securityContext);
      public Response berryRead(Integer id, SecurityContext securityContext);
      public Response characteristicList(Integer limit, Integer offset, SecurityContext securityContext);
      public Response characteristicRead(Integer id, SecurityContext securityContext);
      public Response contestEffectList(Integer limit, Integer offset, SecurityContext securityContext);
      public Response contestEffectRead(Integer id, SecurityContext securityContext);
      public Response contestTypeList(Integer limit, Integer offset, SecurityContext securityContext);
      public Response contestTypeRead(Integer id, SecurityContext securityContext);
      public Response eggGroupList(Integer limit, Integer offset, SecurityContext securityContext);
      public Response eggGroupRead(Integer id, SecurityContext securityContext);
      public Response encounterConditionList(Integer limit, Integer offset, SecurityContext securityContext);
      public Response encounterConditionRead(Integer id, SecurityContext securityContext);
      public Response encounterConditionValueList(Integer limit, Integer offset, SecurityContext securityContext);
      public Response encounterConditionValueRead(Integer id, SecurityContext securityContext);
      public Response encounterMethodList(Integer limit, Integer offset, SecurityContext securityContext);
      public Response encounterMethodRead(Integer id, SecurityContext securityContext);
      public Response evolutionChainList(Integer limit, Integer offset, SecurityContext securityContext);
      public Response evolutionChainRead(Integer id, SecurityContext securityContext);
      public Response evolutionTriggerList(Integer limit, Integer offset, SecurityContext securityContext);
      public Response evolutionTriggerRead(Integer id, SecurityContext securityContext);
      public Response genderList(Integer limit, Integer offset, SecurityContext securityContext);
      public Response genderRead(Integer id, SecurityContext securityContext);
      public Response generationList(Integer limit, Integer offset, SecurityContext securityContext);
      public Response generationRead(Integer id, SecurityContext securityContext);
      public Response growthRateList(Integer limit, Integer offset, SecurityContext securityContext);
      public Response growthRateRead(Integer id, SecurityContext securityContext);
      public Response itemAttributeList(Integer limit, Integer offset, SecurityContext securityContext);
      public Response itemAttributeRead(Integer id, SecurityContext securityContext);
      public Response itemCategoryList(Integer limit, Integer offset, SecurityContext securityContext);
      public Response itemCategoryRead(Integer id, SecurityContext securityContext);
      public Response itemFlingEffectList(Integer limit, Integer offset, SecurityContext securityContext);
      public Response itemFlingEffectRead(Integer id, SecurityContext securityContext);
      public Response itemList(Integer limit, Integer offset, SecurityContext securityContext);
      public Response itemPocketList(Integer limit, Integer offset, SecurityContext securityContext);
      public Response itemPocketRead(Integer id, SecurityContext securityContext);
      public Response itemRead(Integer id, SecurityContext securityContext);
      public Response languageList(Integer limit, Integer offset, SecurityContext securityContext);
      public Response languageRead(Integer id, SecurityContext securityContext);
      public Response locationAreaList(Integer limit, Integer offset, SecurityContext securityContext);
      public Response locationAreaRead(Integer id, SecurityContext securityContext);
      public Response locationList(Integer limit, Integer offset, SecurityContext securityContext);
      public Response locationRead(Integer id, SecurityContext securityContext);
      public Response machineList(Integer limit, Integer offset, SecurityContext securityContext);
      public Response machineRead(Integer id, SecurityContext securityContext);
      public Response moveAilmentList(Integer limit, Integer offset, SecurityContext securityContext);
      public Response moveAilmentRead(Integer id, SecurityContext securityContext);
      public Response moveBattleStyleList(Integer limit, Integer offset, SecurityContext securityContext);
      public Response moveBattleStyleRead(Integer id, SecurityContext securityContext);
      public Response moveCategoryList(Integer limit, Integer offset, SecurityContext securityContext);
      public Response moveCategoryRead(Integer id, SecurityContext securityContext);
      public Response moveDamageClassList(Integer limit, Integer offset, SecurityContext securityContext);
      public Response moveDamageClassRead(Integer id, SecurityContext securityContext);
      public Response moveLearnMethodList(Integer limit, Integer offset, SecurityContext securityContext);
      public Response moveLearnMethodRead(Integer id, SecurityContext securityContext);
      public Response moveList(Integer limit, Integer offset, SecurityContext securityContext);
      public Response moveRead(Integer id, SecurityContext securityContext);
      public Response moveTargetList(Integer limit, Integer offset, SecurityContext securityContext);
      public Response moveTargetRead(Integer id, SecurityContext securityContext);
      public Response natureList(Integer limit, Integer offset, SecurityContext securityContext);
      public Response natureRead(Integer id, SecurityContext securityContext);
      public Response palParkAreaList(Integer limit, Integer offset, SecurityContext securityContext);
      public Response palParkAreaRead(Integer id, SecurityContext securityContext);
      public Response pokeathlonStatList(Integer limit, Integer offset, SecurityContext securityContext);
      public Response pokeathlonStatRead(Integer id, SecurityContext securityContext);
      public Response pokedexList(Integer limit, Integer offset, SecurityContext securityContext);
      public Response pokedexRead(Integer id, SecurityContext securityContext);
      public Response pokemonColorList(Integer limit, Integer offset, SecurityContext securityContext);
      public Response pokemonColorRead(Integer id, SecurityContext securityContext);
      public Response pokemonFormList(Integer limit, Integer offset, SecurityContext securityContext);
      public Response pokemonFormRead(Integer id, SecurityContext securityContext);
      public Response pokemonHabitatList(Integer limit, Integer offset, SecurityContext securityContext);
      public Response pokemonHabitatRead(Integer id, SecurityContext securityContext);
      public Response pokemonList(Integer limit, Integer offset, SecurityContext securityContext);
      public Response pokemonRead(Integer id, SecurityContext securityContext);
      public Response pokemonShapeList(Integer limit, Integer offset, SecurityContext securityContext);
      public Response pokemonShapeRead(Integer id, SecurityContext securityContext);
      public Response pokemonSpeciesList(Integer limit, Integer offset, SecurityContext securityContext);
      public Response pokemonSpeciesRead(Integer id, SecurityContext securityContext);
      public Response regionList(Integer limit, Integer offset, SecurityContext securityContext);
      public Response regionRead(Integer id, SecurityContext securityContext);
      public Response statList(Integer limit, Integer offset, SecurityContext securityContext);
      public Response statRead(Integer id, SecurityContext securityContext);
      public Response superContestEffectList(Integer limit, Integer offset, SecurityContext securityContext);
      public Response superContestEffectRead(Integer id, SecurityContext securityContext);
      public Response typeList(Integer limit, Integer offset, SecurityContext securityContext);
      public Response typeRead(Integer id, SecurityContext securityContext);
      public Response versionGroupList(Integer limit, Integer offset, SecurityContext securityContext);
      public Response versionGroupRead(Integer id, SecurityContext securityContext);
      public Response versionList(Integer limit, Integer offset, SecurityContext securityContext);
      public Response versionRead(Integer id, SecurityContext securityContext);
}
