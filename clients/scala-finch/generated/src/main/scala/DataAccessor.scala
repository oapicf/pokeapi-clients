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
        * @return A PaginatedBerryFirmnessSummaryList
        */
        def Berries_berryFirmnessList(limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String): Either[CommonError,PaginatedBerryFirmnessSummaryList] = Left(TODO)

        /**
        * 
        * @return A BerryFirmnessDetail
        */
        def Berries_berryFirmnessRetrieve(id: String, authParamcookieAuth: String): Either[CommonError,BerryFirmnessDetail] = Left(TODO)

        /**
        * 
        * @return A PaginatedBerryFlavorSummaryList
        */
        def Berries_berryFlavorList(limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String): Either[CommonError,PaginatedBerryFlavorSummaryList] = Left(TODO)

        /**
        * 
        * @return A BerryFlavorDetail
        */
        def Berries_berryFlavorRetrieve(id: String, authParamcookieAuth: String): Either[CommonError,BerryFlavorDetail] = Left(TODO)

        /**
        * 
        * @return A PaginatedBerrySummaryList
        */
        def Berries_berryList(limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String): Either[CommonError,PaginatedBerrySummaryList] = Left(TODO)

        /**
        * 
        * @return A BerryDetail
        */
        def Berries_berryRetrieve(id: String, authParamcookieAuth: String): Either[CommonError,BerryDetail] = Left(TODO)

        /**
        * 
        * @return A PaginatedContestEffectSummaryList
        */
        def Contests_contestEffectList(limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String): Either[CommonError,PaginatedContestEffectSummaryList] = Left(TODO)

        /**
        * 
        * @return A ContestEffectDetail
        */
        def Contests_contestEffectRetrieve(id: String, authParamcookieAuth: String): Either[CommonError,ContestEffectDetail] = Left(TODO)

        /**
        * 
        * @return A PaginatedContestTypeSummaryList
        */
        def Contests_contestTypeList(limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String): Either[CommonError,PaginatedContestTypeSummaryList] = Left(TODO)

        /**
        * 
        * @return A ContestTypeDetail
        */
        def Contests_contestTypeRetrieve(id: String, authParamcookieAuth: String): Either[CommonError,ContestTypeDetail] = Left(TODO)

        /**
        * 
        * @return A PaginatedSuperContestEffectSummaryList
        */
        def Contests_superContestEffectList(limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String): Either[CommonError,PaginatedSuperContestEffectSummaryList] = Left(TODO)

        /**
        * 
        * @return A SuperContestEffectDetail
        */
        def Contests_superContestEffectRetrieve(id: String, authParamcookieAuth: String): Either[CommonError,SuperContestEffectDetail] = Left(TODO)

        /**
        * 
        * @return A PaginatedEncounterConditionSummaryList
        */
        def Encounters_encounterConditionList(limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String): Either[CommonError,PaginatedEncounterConditionSummaryList] = Left(TODO)

        /**
        * 
        * @return A EncounterConditionDetail
        */
        def Encounters_encounterConditionRetrieve(id: String, authParamcookieAuth: String): Either[CommonError,EncounterConditionDetail] = Left(TODO)

        /**
        * 
        * @return A PaginatedEncounterConditionValueSummaryList
        */
        def Encounters_encounterConditionValueList(limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String): Either[CommonError,PaginatedEncounterConditionValueSummaryList] = Left(TODO)

        /**
        * 
        * @return A EncounterConditionValueDetail
        */
        def Encounters_encounterConditionValueRetrieve(id: String, authParamcookieAuth: String): Either[CommonError,EncounterConditionValueDetail] = Left(TODO)

        /**
        * 
        * @return A PaginatedEncounterMethodSummaryList
        */
        def Encounters_encounterMethodList(limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String): Either[CommonError,PaginatedEncounterMethodSummaryList] = Left(TODO)

        /**
        * 
        * @return A EncounterMethodDetail
        */
        def Encounters_encounterMethodRetrieve(id: String, authParamcookieAuth: String): Either[CommonError,EncounterMethodDetail] = Left(TODO)

        /**
        * 
        * @return A PaginatedEvolutionChainSummaryList
        */
        def Evolution_evolutionChainList(limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String): Either[CommonError,PaginatedEvolutionChainSummaryList] = Left(TODO)

        /**
        * 
        * @return A EvolutionChainDetail
        */
        def Evolution_evolutionChainRetrieve(id: String, authParamcookieAuth: String): Either[CommonError,EvolutionChainDetail] = Left(TODO)

        /**
        * 
        * @return A PaginatedEvolutionTriggerSummaryList
        */
        def Evolution_evolutionTriggerList(limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String): Either[CommonError,PaginatedEvolutionTriggerSummaryList] = Left(TODO)

        /**
        * 
        * @return A EvolutionTriggerDetail
        */
        def Evolution_evolutionTriggerRetrieve(id: String, authParamcookieAuth: String): Either[CommonError,EvolutionTriggerDetail] = Left(TODO)

        /**
        * 
        * @return A PaginatedGenerationSummaryList
        */
        def Games_generationList(limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String): Either[CommonError,PaginatedGenerationSummaryList] = Left(TODO)

        /**
        * 
        * @return A GenerationDetail
        */
        def Games_generationRetrieve(id: String, authParamcookieAuth: String): Either[CommonError,GenerationDetail] = Left(TODO)

        /**
        * 
        * @return A PaginatedPokedexSummaryList
        */
        def Games_pokedexList(limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String): Either[CommonError,PaginatedPokedexSummaryList] = Left(TODO)

        /**
        * 
        * @return A PokedexDetail
        */
        def Games_pokedexRetrieve(id: String, authParamcookieAuth: String): Either[CommonError,PokedexDetail] = Left(TODO)

        /**
        * 
        * @return A PaginatedVersionGroupSummaryList
        */
        def Games_versionGroupList(limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String): Either[CommonError,PaginatedVersionGroupSummaryList] = Left(TODO)

        /**
        * 
        * @return A VersionGroupDetail
        */
        def Games_versionGroupRetrieve(id: String, authParamcookieAuth: String): Either[CommonError,VersionGroupDetail] = Left(TODO)

        /**
        * 
        * @return A PaginatedVersionSummaryList
        */
        def Games_versionList(limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String): Either[CommonError,PaginatedVersionSummaryList] = Left(TODO)

        /**
        * 
        * @return A VersionDetail
        */
        def Games_versionRetrieve(id: String, authParamcookieAuth: String): Either[CommonError,VersionDetail] = Left(TODO)

        /**
        * 
        * @return A PaginatedItemAttributeSummaryList
        */
        def Items_itemAttributeList(limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String): Either[CommonError,PaginatedItemAttributeSummaryList] = Left(TODO)

        /**
        * 
        * @return A ItemAttributeDetail
        */
        def Items_itemAttributeRetrieve(id: String, authParamcookieAuth: String): Either[CommonError,ItemAttributeDetail] = Left(TODO)

        /**
        * 
        * @return A PaginatedItemCategorySummaryList
        */
        def Items_itemCategoryList(limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String): Either[CommonError,PaginatedItemCategorySummaryList] = Left(TODO)

        /**
        * 
        * @return A ItemCategoryDetail
        */
        def Items_itemCategoryRetrieve(id: String, authParamcookieAuth: String): Either[CommonError,ItemCategoryDetail] = Left(TODO)

        /**
        * 
        * @return A PaginatedItemFlingEffectSummaryList
        */
        def Items_itemFlingEffectList(limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String): Either[CommonError,PaginatedItemFlingEffectSummaryList] = Left(TODO)

        /**
        * 
        * @return A ItemFlingEffectDetail
        */
        def Items_itemFlingEffectRetrieve(id: String, authParamcookieAuth: String): Either[CommonError,ItemFlingEffectDetail] = Left(TODO)

        /**
        * 
        * @return A PaginatedItemSummaryList
        */
        def Items_itemList(limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String): Either[CommonError,PaginatedItemSummaryList] = Left(TODO)

        /**
        * 
        * @return A PaginatedItemPocketSummaryList
        */
        def Items_itemPocketList(limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String): Either[CommonError,PaginatedItemPocketSummaryList] = Left(TODO)

        /**
        * 
        * @return A ItemPocketDetail
        */
        def Items_itemPocketRetrieve(id: String, authParamcookieAuth: String): Either[CommonError,ItemPocketDetail] = Left(TODO)

        /**
        * 
        * @return A ItemDetail
        */
        def Items_itemRetrieve(id: String, authParamcookieAuth: String): Either[CommonError,ItemDetail] = Left(TODO)

        /**
        * 
        * @return A PaginatedLocationAreaSummaryList
        */
        def Location_locationAreaList(limit: Option[Int], offset: Option[Int], authParamcookieAuth: String): Either[CommonError,PaginatedLocationAreaSummaryList] = Left(TODO)

        /**
        * 
        * @return A LocationAreaDetail
        */
        def Location_locationAreaRetrieve(id: Int, authParamcookieAuth: String): Either[CommonError,LocationAreaDetail] = Left(TODO)

        /**
        * 
        * @return A PaginatedLocationSummaryList
        */
        def Location_locationList(limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String): Either[CommonError,PaginatedLocationSummaryList] = Left(TODO)

        /**
        * 
        * @return A LocationDetail
        */
        def Location_locationRetrieve(id: String, authParamcookieAuth: String): Either[CommonError,LocationDetail] = Left(TODO)

        /**
        * 
        * @return A PaginatedPalParkAreaSummaryList
        */
        def Location_palParkAreaList(limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String): Either[CommonError,PaginatedPalParkAreaSummaryList] = Left(TODO)

        /**
        * 
        * @return A PalParkAreaDetail
        */
        def Location_palParkAreaRetrieve(id: String, authParamcookieAuth: String): Either[CommonError,PalParkAreaDetail] = Left(TODO)

        /**
        * 
        * @return A PaginatedRegionSummaryList
        */
        def Location_regionList(limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String): Either[CommonError,PaginatedRegionSummaryList] = Left(TODO)

        /**
        * 
        * @return A RegionDetail
        */
        def Location_regionRetrieve(id: String, authParamcookieAuth: String): Either[CommonError,RegionDetail] = Left(TODO)

        /**
        * 
        * @return A PaginatedMachineSummaryList
        */
        def Machines_machineList(limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String): Either[CommonError,PaginatedMachineSummaryList] = Left(TODO)

        /**
        * 
        * @return A MachineDetail
        */
        def Machines_machineRetrieve(id: String, authParamcookieAuth: String): Either[CommonError,MachineDetail] = Left(TODO)

        /**
        * 
        * @return A PaginatedMoveMetaAilmentSummaryList
        */
        def Moves_moveAilmentList(limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String): Either[CommonError,PaginatedMoveMetaAilmentSummaryList] = Left(TODO)

        /**
        * 
        * @return A MoveMetaAilmentDetail
        */
        def Moves_moveAilmentRetrieve(id: String, authParamcookieAuth: String): Either[CommonError,MoveMetaAilmentDetail] = Left(TODO)

        /**
        * 
        * @return A PaginatedMoveBattleStyleSummaryList
        */
        def Moves_moveBattleStyleList(limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String): Either[CommonError,PaginatedMoveBattleStyleSummaryList] = Left(TODO)

        /**
        * 
        * @return A MoveBattleStyleDetail
        */
        def Moves_moveBattleStyleRetrieve(id: String, authParamcookieAuth: String): Either[CommonError,MoveBattleStyleDetail] = Left(TODO)

        /**
        * 
        * @return A PaginatedMoveMetaCategorySummaryList
        */
        def Moves_moveCategoryList(limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String): Either[CommonError,PaginatedMoveMetaCategorySummaryList] = Left(TODO)

        /**
        * 
        * @return A MoveMetaCategoryDetail
        */
        def Moves_moveCategoryRetrieve(id: String, authParamcookieAuth: String): Either[CommonError,MoveMetaCategoryDetail] = Left(TODO)

        /**
        * 
        * @return A PaginatedMoveLearnMethodSummaryList
        */
        def Moves_moveLearnMethodList(limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String): Either[CommonError,PaginatedMoveLearnMethodSummaryList] = Left(TODO)

        /**
        * 
        * @return A MoveLearnMethodDetail
        */
        def Moves_moveLearnMethodRetrieve(id: String, authParamcookieAuth: String): Either[CommonError,MoveLearnMethodDetail] = Left(TODO)

        /**
        * 
        * @return A PaginatedMoveSummaryList
        */
        def Moves_moveList(limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String): Either[CommonError,PaginatedMoveSummaryList] = Left(TODO)

        /**
        * 
        * @return A MoveDetail
        */
        def Moves_moveRetrieve(id: String, authParamcookieAuth: String): Either[CommonError,MoveDetail] = Left(TODO)

        /**
        * 
        * @return A PaginatedMoveTargetSummaryList
        */
        def Moves_moveTargetList(limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String): Either[CommonError,PaginatedMoveTargetSummaryList] = Left(TODO)

        /**
        * 
        * @return A MoveTargetDetail
        */
        def Moves_moveTargetRetrieve(id: String, authParamcookieAuth: String): Either[CommonError,MoveTargetDetail] = Left(TODO)

        /**
        * 
        * @return A PaginatedAbilitySummaryList
        */
        def Pokemon_abilityList(limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String): Either[CommonError,PaginatedAbilitySummaryList] = Left(TODO)

        /**
        * 
        * @return A AbilityDetail
        */
        def Pokemon_abilityRetrieve(id: String, authParamcookieAuth: String): Either[CommonError,AbilityDetail] = Left(TODO)

        /**
        * 
        * @return A PaginatedCharacteristicSummaryList
        */
        def Pokemon_characteristicList(limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String): Either[CommonError,PaginatedCharacteristicSummaryList] = Left(TODO)

        /**
        * 
        * @return A CharacteristicDetail
        */
        def Pokemon_characteristicRetrieve(id: String, authParamcookieAuth: String): Either[CommonError,CharacteristicDetail] = Left(TODO)

        /**
        * 
        * @return A PaginatedEggGroupSummaryList
        */
        def Pokemon_eggGroupList(limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String): Either[CommonError,PaginatedEggGroupSummaryList] = Left(TODO)

        /**
        * 
        * @return A EggGroupDetail
        */
        def Pokemon_eggGroupRetrieve(id: String, authParamcookieAuth: String): Either[CommonError,EggGroupDetail] = Left(TODO)

        /**
        * 
        * @return A PaginatedGenderSummaryList
        */
        def Pokemon_genderList(limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String): Either[CommonError,PaginatedGenderSummaryList] = Left(TODO)

        /**
        * 
        * @return A GenderDetail
        */
        def Pokemon_genderRetrieve(id: String, authParamcookieAuth: String): Either[CommonError,GenderDetail] = Left(TODO)

        /**
        * 
        * @return A PaginatedGrowthRateSummaryList
        */
        def Pokemon_growthRateList(limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String): Either[CommonError,PaginatedGrowthRateSummaryList] = Left(TODO)

        /**
        * 
        * @return A GrowthRateDetail
        */
        def Pokemon_growthRateRetrieve(id: String, authParamcookieAuth: String): Either[CommonError,GrowthRateDetail] = Left(TODO)

        /**
        * 
        * @return A PaginatedMoveDamageClassSummaryList
        */
        def Pokemon_moveDamageClassList(limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String): Either[CommonError,PaginatedMoveDamageClassSummaryList] = Left(TODO)

        /**
        * 
        * @return A MoveDamageClassDetail
        */
        def Pokemon_moveDamageClassRetrieve(id: String, authParamcookieAuth: String): Either[CommonError,MoveDamageClassDetail] = Left(TODO)

        /**
        * 
        * @return A PaginatedNatureSummaryList
        */
        def Pokemon_natureList(limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String): Either[CommonError,PaginatedNatureSummaryList] = Left(TODO)

        /**
        * 
        * @return A NatureDetail
        */
        def Pokemon_natureRetrieve(id: String, authParamcookieAuth: String): Either[CommonError,NatureDetail] = Left(TODO)

        /**
        * 
        * @return A PaginatedPokeathlonStatSummaryList
        */
        def Pokemon_pokeathlonStatList(limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String): Either[CommonError,PaginatedPokeathlonStatSummaryList] = Left(TODO)

        /**
        * 
        * @return A PokeathlonStatDetail
        */
        def Pokemon_pokeathlonStatRetrieve(id: String, authParamcookieAuth: String): Either[CommonError,PokeathlonStatDetail] = Left(TODO)

        /**
        * 
        * @return A PaginatedPokemonColorSummaryList
        */
        def Pokemon_pokemonColorList(limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String): Either[CommonError,PaginatedPokemonColorSummaryList] = Left(TODO)

        /**
        * 
        * @return A PokemonColorDetail
        */
        def Pokemon_pokemonColorRetrieve(id: String, authParamcookieAuth: String): Either[CommonError,PokemonColorDetail] = Left(TODO)

        /**
        * 
        * @return A PaginatedPokemonFormSummaryList
        */
        def Pokemon_pokemonFormList(limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String): Either[CommonError,PaginatedPokemonFormSummaryList] = Left(TODO)

        /**
        * 
        * @return A PokemonFormDetail
        */
        def Pokemon_pokemonFormRetrieve(id: String, authParamcookieAuth: String): Either[CommonError,PokemonFormDetail] = Left(TODO)

        /**
        * 
        * @return A PaginatedPokemonHabitatSummaryList
        */
        def Pokemon_pokemonHabitatList(limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String): Either[CommonError,PaginatedPokemonHabitatSummaryList] = Left(TODO)

        /**
        * 
        * @return A PokemonHabitatDetail
        */
        def Pokemon_pokemonHabitatRetrieve(id: String, authParamcookieAuth: String): Either[CommonError,PokemonHabitatDetail] = Left(TODO)

        /**
        * 
        * @return A PaginatedPokemonSummaryList
        */
        def Pokemon_pokemonList(limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String): Either[CommonError,PaginatedPokemonSummaryList] = Left(TODO)

        /**
        * 
        * @return A PokemonDetail
        */
        def Pokemon_pokemonRetrieve(id: String, authParamcookieAuth: String): Either[CommonError,PokemonDetail] = Left(TODO)

        /**
        * 
        * @return A PaginatedPokemonShapeSummaryList
        */
        def Pokemon_pokemonShapeList(limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String): Either[CommonError,PaginatedPokemonShapeSummaryList] = Left(TODO)

        /**
        * 
        * @return A PokemonShapeDetail
        */
        def Pokemon_pokemonShapeRetrieve(id: String, authParamcookieAuth: String): Either[CommonError,PokemonShapeDetail] = Left(TODO)

        /**
        * 
        * @return A PaginatedPokemonSpeciesSummaryList
        */
        def Pokemon_pokemonSpeciesList(limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String): Either[CommonError,PaginatedPokemonSpeciesSummaryList] = Left(TODO)

        /**
        * 
        * @return A PokemonSpeciesDetail
        */
        def Pokemon_pokemonSpeciesRetrieve(id: String, authParamcookieAuth: String): Either[CommonError,PokemonSpeciesDetail] = Left(TODO)

        /**
        * 
        * @return A PaginatedStatSummaryList
        */
        def Pokemon_statList(limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String): Either[CommonError,PaginatedStatSummaryList] = Left(TODO)

        /**
        * 
        * @return A StatDetail
        */
        def Pokemon_statRetrieve(id: String, authParamcookieAuth: String): Either[CommonError,StatDetail] = Left(TODO)

        /**
        * 
        * @return A PaginatedTypeSummaryList
        */
        def Pokemon_typeList(limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String): Either[CommonError,PaginatedTypeSummaryList] = Left(TODO)

        /**
        * 
        * @return A TypeDetail
        */
        def Pokemon_typeRetrieve(id: String, authParamcookieAuth: String): Either[CommonError,TypeDetail] = Left(TODO)

        /**
        * 
        * @return A PaginatedLanguageSummaryList
        */
        def Utility_languageList(limit: Option[Int], offset: Option[Int], q: Option[String], authParamcookieAuth: String): Either[CommonError,PaginatedLanguageSummaryList] = Left(TODO)

        /**
        * 
        * @return A LanguageDetail
        */
        def Utility_languageRetrieve(id: String, authParamcookieAuth: String): Either[CommonError,LanguageDetail] = Left(TODO)

}