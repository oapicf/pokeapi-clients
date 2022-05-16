package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;


import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2022-05-16T10:28:17.901343Z[Etc/UTC]")
public abstract class ApiApiService {
    public abstract Response abilityList(Integer limit
 ,Integer offset
 ) throws NotFoundException;
    public abstract Response abilityRead(Integer id
 ) throws NotFoundException;
    public abstract Response berryFirmnessList(Integer limit
 ,Integer offset
 ) throws NotFoundException;
    public abstract Response berryFirmnessRead(Integer id
 ) throws NotFoundException;
    public abstract Response berryFlavorList(Integer limit
 ,Integer offset
 ) throws NotFoundException;
    public abstract Response berryFlavorRead(Integer id
 ) throws NotFoundException;
    public abstract Response berryList(Integer limit
 ,Integer offset
 ) throws NotFoundException;
    public abstract Response berryRead(Integer id
 ) throws NotFoundException;
    public abstract Response characteristicList(Integer limit
 ,Integer offset
 ) throws NotFoundException;
    public abstract Response characteristicRead(Integer id
 ) throws NotFoundException;
    public abstract Response contestEffectList(Integer limit
 ,Integer offset
 ) throws NotFoundException;
    public abstract Response contestEffectRead(Integer id
 ) throws NotFoundException;
    public abstract Response contestTypeList(Integer limit
 ,Integer offset
 ) throws NotFoundException;
    public abstract Response contestTypeRead(Integer id
 ) throws NotFoundException;
    public abstract Response eggGroupList(Integer limit
 ,Integer offset
 ) throws NotFoundException;
    public abstract Response eggGroupRead(Integer id
 ) throws NotFoundException;
    public abstract Response encounterConditionList(Integer limit
 ,Integer offset
 ) throws NotFoundException;
    public abstract Response encounterConditionRead(Integer id
 ) throws NotFoundException;
    public abstract Response encounterConditionValueList(Integer limit
 ,Integer offset
 ) throws NotFoundException;
    public abstract Response encounterConditionValueRead(Integer id
 ) throws NotFoundException;
    public abstract Response encounterMethodList(Integer limit
 ,Integer offset
 ) throws NotFoundException;
    public abstract Response encounterMethodRead(Integer id
 ) throws NotFoundException;
    public abstract Response evolutionChainList(Integer limit
 ,Integer offset
 ) throws NotFoundException;
    public abstract Response evolutionChainRead(Integer id
 ) throws NotFoundException;
    public abstract Response evolutionTriggerList(Integer limit
 ,Integer offset
 ) throws NotFoundException;
    public abstract Response evolutionTriggerRead(Integer id
 ) throws NotFoundException;
    public abstract Response genderList(Integer limit
 ,Integer offset
 ) throws NotFoundException;
    public abstract Response genderRead(Integer id
 ) throws NotFoundException;
    public abstract Response generationList(Integer limit
 ,Integer offset
 ) throws NotFoundException;
    public abstract Response generationRead(Integer id
 ) throws NotFoundException;
    public abstract Response growthRateList(Integer limit
 ,Integer offset
 ) throws NotFoundException;
    public abstract Response growthRateRead(Integer id
 ) throws NotFoundException;
    public abstract Response itemAttributeList(Integer limit
 ,Integer offset
 ) throws NotFoundException;
    public abstract Response itemAttributeRead(Integer id
 ) throws NotFoundException;
    public abstract Response itemCategoryList(Integer limit
 ,Integer offset
 ) throws NotFoundException;
    public abstract Response itemCategoryRead(Integer id
 ) throws NotFoundException;
    public abstract Response itemFlingEffectList(Integer limit
 ,Integer offset
 ) throws NotFoundException;
    public abstract Response itemFlingEffectRead(Integer id
 ) throws NotFoundException;
    public abstract Response itemList(Integer limit
 ,Integer offset
 ) throws NotFoundException;
    public abstract Response itemPocketList(Integer limit
 ,Integer offset
 ) throws NotFoundException;
    public abstract Response itemPocketRead(Integer id
 ) throws NotFoundException;
    public abstract Response itemRead(Integer id
 ) throws NotFoundException;
    public abstract Response languageList(Integer limit
 ,Integer offset
 ) throws NotFoundException;
    public abstract Response languageRead(Integer id
 ) throws NotFoundException;
    public abstract Response locationAreaList(Integer limit
 ,Integer offset
 ) throws NotFoundException;
    public abstract Response locationAreaRead(Integer id
 ) throws NotFoundException;
    public abstract Response locationList(Integer limit
 ,Integer offset
 ) throws NotFoundException;
    public abstract Response locationRead(Integer id
 ) throws NotFoundException;
    public abstract Response machineList(Integer limit
 ,Integer offset
 ) throws NotFoundException;
    public abstract Response machineRead(Integer id
 ) throws NotFoundException;
    public abstract Response moveAilmentList(Integer limit
 ,Integer offset
 ) throws NotFoundException;
    public abstract Response moveAilmentRead(Integer id
 ) throws NotFoundException;
    public abstract Response moveBattleStyleList(Integer limit
 ,Integer offset
 ) throws NotFoundException;
    public abstract Response moveBattleStyleRead(Integer id
 ) throws NotFoundException;
    public abstract Response moveCategoryList(Integer limit
 ,Integer offset
 ) throws NotFoundException;
    public abstract Response moveCategoryRead(Integer id
 ) throws NotFoundException;
    public abstract Response moveDamageClassList(Integer limit
 ,Integer offset
 ) throws NotFoundException;
    public abstract Response moveDamageClassRead(Integer id
 ) throws NotFoundException;
    public abstract Response moveLearnMethodList(Integer limit
 ,Integer offset
 ) throws NotFoundException;
    public abstract Response moveLearnMethodRead(Integer id
 ) throws NotFoundException;
    public abstract Response moveList(Integer limit
 ,Integer offset
 ) throws NotFoundException;
    public abstract Response moveRead(Integer id
 ) throws NotFoundException;
    public abstract Response moveTargetList(Integer limit
 ,Integer offset
 ) throws NotFoundException;
    public abstract Response moveTargetRead(Integer id
 ) throws NotFoundException;
    public abstract Response natureList(Integer limit
 ,Integer offset
 ) throws NotFoundException;
    public abstract Response natureRead(Integer id
 ) throws NotFoundException;
    public abstract Response palParkAreaList(Integer limit
 ,Integer offset
 ) throws NotFoundException;
    public abstract Response palParkAreaRead(Integer id
 ) throws NotFoundException;
    public abstract Response pokeathlonStatList(Integer limit
 ,Integer offset
 ) throws NotFoundException;
    public abstract Response pokeathlonStatRead(Integer id
 ) throws NotFoundException;
    public abstract Response pokedexList(Integer limit
 ,Integer offset
 ) throws NotFoundException;
    public abstract Response pokedexRead(Integer id
 ) throws NotFoundException;
    public abstract Response pokemonColorList(Integer limit
 ,Integer offset
 ) throws NotFoundException;
    public abstract Response pokemonColorRead(Integer id
 ) throws NotFoundException;
    public abstract Response pokemonFormList(Integer limit
 ,Integer offset
 ) throws NotFoundException;
    public abstract Response pokemonFormRead(Integer id
 ) throws NotFoundException;
    public abstract Response pokemonHabitatList(Integer limit
 ,Integer offset
 ) throws NotFoundException;
    public abstract Response pokemonHabitatRead(Integer id
 ) throws NotFoundException;
    public abstract Response pokemonList(Integer limit
 ,Integer offset
 ) throws NotFoundException;
    public abstract Response pokemonRead(Integer id
 ) throws NotFoundException;
    public abstract Response pokemonShapeList(Integer limit
 ,Integer offset
 ) throws NotFoundException;
    public abstract Response pokemonShapeRead(Integer id
 ) throws NotFoundException;
    public abstract Response pokemonSpeciesList(Integer limit
 ,Integer offset
 ) throws NotFoundException;
    public abstract Response pokemonSpeciesRead(Integer id
 ) throws NotFoundException;
    public abstract Response regionList(Integer limit
 ,Integer offset
 ) throws NotFoundException;
    public abstract Response regionRead(Integer id
 ) throws NotFoundException;
    public abstract Response statList(Integer limit
 ,Integer offset
 ) throws NotFoundException;
    public abstract Response statRead(Integer id
 ) throws NotFoundException;
    public abstract Response superContestEffectList(Integer limit
 ,Integer offset
 ) throws NotFoundException;
    public abstract Response superContestEffectRead(Integer id
 ) throws NotFoundException;
    public abstract Response typeList(Integer limit
 ,Integer offset
 ) throws NotFoundException;
    public abstract Response typeRead(Integer id
 ) throws NotFoundException;
    public abstract Response versionGroupList(Integer limit
 ,Integer offset
 ) throws NotFoundException;
    public abstract Response versionGroupRead(Integer id
 ) throws NotFoundException;
    public abstract Response versionList(Integer limit
 ,Integer offset
 ) throws NotFoundException;
    public abstract Response versionRead(Integer id
 ) throws NotFoundException;
}
