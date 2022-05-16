package org.openapitools

// TODO: properly handle custom imports
import java.io._
import java.util.UUID
import java.time._
import com.twitter.finagle.http.exp.Multipart.{FileUpload, InMemoryFileUpload, OnDiskFileUpload}

import org.openapitools.models._

trait DataAccessor {
    // TODO: apiInfo -> apis -> operations = TODO error
    private object TODO extends CommonError("Not implemented") {
        def message = "Not implemented"
    }

        /**
        * 
        * @return A String
        */
        def Ability_abilityList(limit: Option[Int], offset: Option[Int]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def Ability_abilityRead(id: Int): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def Berry_berryList(limit: Option[Int], offset: Option[Int]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def Berry_berryRead(id: Int): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def BerryFirmness_berryFirmnessList(limit: Option[Int], offset: Option[Int]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def BerryFirmness_berryFirmnessRead(id: Int): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def BerryFlavor_berryFlavorList(limit: Option[Int], offset: Option[Int]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def BerryFlavor_berryFlavorRead(id: Int): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def Characteristic_characteristicList(limit: Option[Int], offset: Option[Int]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def Characteristic_characteristicRead(id: Int): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def ContestEffect_contestEffectList(limit: Option[Int], offset: Option[Int]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def ContestEffect_contestEffectRead(id: Int): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def ContestType_contestTypeList(limit: Option[Int], offset: Option[Int]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def ContestType_contestTypeRead(id: Int): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def EggGroup_eggGroupList(limit: Option[Int], offset: Option[Int]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def EggGroup_eggGroupRead(id: Int): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def EncounterCondition_encounterConditionList(limit: Option[Int], offset: Option[Int]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def EncounterCondition_encounterConditionRead(id: Int): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def EncounterConditionValue_encounterConditionValueList(limit: Option[Int], offset: Option[Int]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def EncounterConditionValue_encounterConditionValueRead(id: Int): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def EncounterMethod_encounterMethodList(limit: Option[Int], offset: Option[Int]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def EncounterMethod_encounterMethodRead(id: Int): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def EvolutionChain_evolutionChainList(limit: Option[Int], offset: Option[Int]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def EvolutionChain_evolutionChainRead(id: Int): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def EvolutionTrigger_evolutionTriggerList(limit: Option[Int], offset: Option[Int]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def EvolutionTrigger_evolutionTriggerRead(id: Int): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def Gender_genderList(limit: Option[Int], offset: Option[Int]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def Gender_genderRead(id: Int): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def Generation_generationList(limit: Option[Int], offset: Option[Int]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def Generation_generationRead(id: Int): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def GrowthRate_growthRateList(limit: Option[Int], offset: Option[Int]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def GrowthRate_growthRateRead(id: Int): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def Item_itemList(limit: Option[Int], offset: Option[Int]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def Item_itemRead(id: Int): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def ItemAttribute_itemAttributeList(limit: Option[Int], offset: Option[Int]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def ItemAttribute_itemAttributeRead(id: Int): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def ItemCategory_itemCategoryList(limit: Option[Int], offset: Option[Int]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def ItemCategory_itemCategoryRead(id: Int): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def ItemFlingEffect_itemFlingEffectList(limit: Option[Int], offset: Option[Int]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def ItemFlingEffect_itemFlingEffectRead(id: Int): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def ItemPocket_itemPocketList(limit: Option[Int], offset: Option[Int]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def ItemPocket_itemPocketRead(id: Int): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def Language_languageList(limit: Option[Int], offset: Option[Int]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def Language_languageRead(id: Int): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def Location_locationList(limit: Option[Int], offset: Option[Int]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def Location_locationRead(id: Int): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def LocationArea_locationAreaList(limit: Option[Int], offset: Option[Int]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def LocationArea_locationAreaRead(id: Int): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def Machine_machineList(limit: Option[Int], offset: Option[Int]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def Machine_machineRead(id: Int): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def Move_moveList(limit: Option[Int], offset: Option[Int]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def Move_moveRead(id: Int): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def MoveAilment_moveAilmentList(limit: Option[Int], offset: Option[Int]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def MoveAilment_moveAilmentRead(id: Int): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def MoveBattleStyle_moveBattleStyleList(limit: Option[Int], offset: Option[Int]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def MoveBattleStyle_moveBattleStyleRead(id: Int): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def MoveCategory_moveCategoryList(limit: Option[Int], offset: Option[Int]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def MoveCategory_moveCategoryRead(id: Int): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def MoveDamageClass_moveDamageClassList(limit: Option[Int], offset: Option[Int]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def MoveDamageClass_moveDamageClassRead(id: Int): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def MoveLearnMethod_moveLearnMethodList(limit: Option[Int], offset: Option[Int]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def MoveLearnMethod_moveLearnMethodRead(id: Int): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def MoveTarget_moveTargetList(limit: Option[Int], offset: Option[Int]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def MoveTarget_moveTargetRead(id: Int): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def Nature_natureList(limit: Option[Int], offset: Option[Int]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def Nature_natureRead(id: Int): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def PalParkArea_palParkAreaList(limit: Option[Int], offset: Option[Int]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def PalParkArea_palParkAreaRead(id: Int): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def PokeathlonStat_pokeathlonStatList(limit: Option[Int], offset: Option[Int]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def PokeathlonStat_pokeathlonStatRead(id: Int): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def Pokedex_pokedexList(limit: Option[Int], offset: Option[Int]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def Pokedex_pokedexRead(id: Int): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def Pokemon_pokemonList(limit: Option[Int], offset: Option[Int]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def Pokemon_pokemonRead(id: Int): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def PokemonColor_pokemonColorList(limit: Option[Int], offset: Option[Int]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def PokemonColor_pokemonColorRead(id: Int): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def PokemonForm_pokemonFormList(limit: Option[Int], offset: Option[Int]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def PokemonForm_pokemonFormRead(id: Int): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def PokemonHabitat_pokemonHabitatList(limit: Option[Int], offset: Option[Int]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def PokemonHabitat_pokemonHabitatRead(id: Int): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def PokemonShape_pokemonShapeList(limit: Option[Int], offset: Option[Int]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def PokemonShape_pokemonShapeRead(id: Int): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def PokemonSpecies_pokemonSpeciesList(limit: Option[Int], offset: Option[Int]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def PokemonSpecies_pokemonSpeciesRead(id: Int): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def Region_regionList(limit: Option[Int], offset: Option[Int]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def Region_regionRead(id: Int): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def Stat_statList(limit: Option[Int], offset: Option[Int]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def Stat_statRead(id: Int): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def SuperContestEffect_superContestEffectList(limit: Option[Int], offset: Option[Int]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def SuperContestEffect_superContestEffectRead(id: Int): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def Type_typeList(limit: Option[Int], offset: Option[Int]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def Type_typeRead(id: Int): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def Version_versionList(limit: Option[Int], offset: Option[Int]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def Version_versionRead(id: Int): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def VersionGroup_versionGroupList(limit: Option[Int], offset: Option[Int]): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def VersionGroup_versionGroupRead(id: Int): Either[CommonError,String] = Left(TODO)

}