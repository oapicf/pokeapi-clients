package api

import model.AbilityDetail
import model.CharacteristicDetail
import model.EggGroupDetail
import model.GenderDetail
import model.GrowthRateDetail
import model.MoveDamageClassDetail
import model.NatureDetail
import model.PaginatedAbilitySummaryList
import model.PaginatedCharacteristicSummaryList
import model.PaginatedEggGroupSummaryList
import model.PaginatedGenderSummaryList
import model.PaginatedGrowthRateSummaryList
import model.PaginatedMoveDamageClassSummaryList
import model.PaginatedNatureSummaryList
import model.PaginatedPokeathlonStatSummaryList
import model.PaginatedPokemonColorSummaryList
import model.PaginatedPokemonFormSummaryList
import model.PaginatedPokemonHabitatSummaryList
import model.PaginatedPokemonShapeSummaryList
import model.PaginatedPokemonSpeciesSummaryList
import model.PaginatedPokemonSummaryList
import model.PaginatedStatSummaryList
import model.PaginatedTypeSummaryList
import model.PokeathlonStatDetail
import model.PokemonColorDetail
import model.PokemonDetail
import model.PokemonFormDetail
import model.PokemonHabitatDetail
import model.PokemonShapeDetail
import model.PokemonSpeciesDetail
import model.StatDetail
import model.TypeDetail

/**
  * Provides a default implementation for [[PokemonApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
class PokemonApiImpl extends PokemonApi {
  /**
    * @inheritdoc
    */
  override def abilityList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedAbilitySummaryList = {
    // TODO: Implement better logic

    PaginatedAbilitySummaryList(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def abilityRetrieve(id: String): AbilityDetail = {
    // TODO: Implement better logic

    AbilityDetail(0, "", None, GenerationSummary("", ""), List.empty[AbilityName], List.empty[AbilityEffectText], List.empty[AbilityChange], List.empty[AbilityFlavorText], List.empty[AbilityDetailPokemonInner])
  }

  /**
    * @inheritdoc
    */
  override def characteristicList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedCharacteristicSummaryList = {
    // TODO: Implement better logic

    PaginatedCharacteristicSummaryList(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def characteristicRetrieve(id: String): CharacteristicDetail = {
    // TODO: Implement better logic

    CharacteristicDetail(0, 0, List.empty[Int], StatSummary("", ""), List.empty[CharacteristicDescription])
  }

  /**
    * @inheritdoc
    */
  override def eggGroupList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedEggGroupSummaryList = {
    // TODO: Implement better logic

    PaginatedEggGroupSummaryList(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def eggGroupRetrieve(id: String): EggGroupDetail = {
    // TODO: Implement better logic

    EggGroupDetail(0, "", List.empty[EggGroupName], List.empty[EggGroupDetailPokemonSpeciesInner])
  }

  /**
    * @inheritdoc
    */
  override def genderList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedGenderSummaryList = {
    // TODO: Implement better logic

    PaginatedGenderSummaryList(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def genderRetrieve(id: String): GenderDetail = {
    // TODO: Implement better logic

    GenderDetail(0, "", List.empty[GenderDetailPokemonSpeciesDetailsInner], List.empty[AbilityDetailPokemonInnerPokemon])
  }

  /**
    * @inheritdoc
    */
  override def growthRateList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedGrowthRateSummaryList = {
    // TODO: Implement better logic

    PaginatedGrowthRateSummaryList(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def growthRateRetrieve(id: String): GrowthRateDetail = {
    // TODO: Implement better logic

    GrowthRateDetail(0, "", "", List.empty[GrowthRateDescription], List.empty[Experience], List.empty[PokemonSpeciesSummary])
  }

  /**
    * @inheritdoc
    */
  override def moveDamageClassList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedMoveDamageClassSummaryList = {
    // TODO: Implement better logic

    PaginatedMoveDamageClassSummaryList(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def moveDamageClassRetrieve(id: String): MoveDamageClassDetail = {
    // TODO: Implement better logic

    MoveDamageClassDetail(0, "", List.empty[MoveDamageClassDescription], List.empty[MoveSummary], List.empty[MoveDamageClassName])
  }

  /**
    * @inheritdoc
    */
  override def natureList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedNatureSummaryList = {
    // TODO: Implement better logic

    PaginatedNatureSummaryList(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def natureRetrieve(id: String): NatureDetail = {
    // TODO: Implement better logic

    NatureDetail(0, "", StatSummary("", ""), StatSummary("", ""), BerryFlavorSummary("", ""), BerryFlavorSummary("", ""), List.empty[BerrySummary], List.empty[NatureDetailPokeathlonStatChangesInner], List.empty[NatureBattleStylePreference], List.empty[NatureName])
  }

  /**
    * @inheritdoc
    */
  override def pokeathlonStatList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedPokeathlonStatSummaryList = {
    // TODO: Implement better logic

    PaginatedPokeathlonStatSummaryList(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def pokeathlonStatRetrieve(id: String): PokeathlonStatDetail = {
    // TODO: Implement better logic

    PokeathlonStatDetail(0, "", PokeathlonStatDetailAffectingNatures(List.empty[PokeathlonStatDetailAffectingNaturesDecreaseInner], List.empty[PokeathlonStatDetailAffectingNaturesIncreaseInner]), List.empty[PokeathlonStatName])
  }

  /**
    * @inheritdoc
    */
  override def pokemonColorList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedPokemonColorSummaryList = {
    // TODO: Implement better logic

    PaginatedPokemonColorSummaryList(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def pokemonColorRetrieve(id: String): PokemonColorDetail = {
    // TODO: Implement better logic

    PokemonColorDetail(0, "", List.empty[PokemonColorName], List.empty[PokemonSpeciesSummary])
  }

  /**
    * @inheritdoc
    */
  override def pokemonFormList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedPokemonFormSummaryList = {
    // TODO: Implement better logic

    PaginatedPokemonFormSummaryList(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def pokemonFormRetrieve(id: String): PokemonFormDetail = {
    // TODO: Implement better logic

    PokemonFormDetail(0, "", None, None, None, None, None, "", PokemonSummary("", ""), PokemonFormDetailSprites(None, Map.empty), VersionGroupSummary("", ""), List.empty[PokemonFormDetailFormNamesInner], List.empty[PokemonFormDetailFormNamesInner], List.empty[PokemonDetailTypesInner])
  }

  /**
    * @inheritdoc
    */
  override def pokemonHabitatList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedPokemonHabitatSummaryList = {
    // TODO: Implement better logic

    PaginatedPokemonHabitatSummaryList(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def pokemonHabitatRetrieve(id: String): PokemonHabitatDetail = {
    // TODO: Implement better logic

    PokemonHabitatDetail(0, "", List.empty[PokemonHabitatName], List.empty[PokemonSpeciesSummary])
  }

  /**
    * @inheritdoc
    */
  override def pokemonList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedPokemonSummaryList = {
    // TODO: Implement better logic

    PaginatedPokemonSummaryList(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def pokemonRetrieve(id: String): PokemonDetail = {
    // TODO: Implement better logic

    PokemonDetail(0, "", None, None, None, None, None, List.empty[PokemonDetailAbilitiesInner], List.empty[PokemonDetailPastAbilitiesInner], List.empty[PokemonFormSummary], List.empty[PokemonGameIndex], PokemonDetailHeldItems(AbilityDetailPokemonInnerPokemon("", ""), List.empty[ItemDetailHeldByPokemonInnerVersionDetailsInner]), "", List.empty[PokemonDetailMovesInner], PokemonSpeciesSummary("", ""), PokemonDetailSprites(None, Map.empty), PokemonDetailCries("", ""), List.empty[PokemonStat], List.empty[PokemonDetailTypesInner], List.empty[PokemonDetailPastTypesInner])
  }

  /**
    * @inheritdoc
    */
  override def pokemonShapeList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedPokemonShapeSummaryList = {
    // TODO: Implement better logic

    PaginatedPokemonShapeSummaryList(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def pokemonShapeRetrieve(id: String): PokemonShapeDetail = {
    // TODO: Implement better logic

    PokemonShapeDetail(0, "", List.empty[PokemonShapeDetailAwesomeNamesInner], List.empty[PokemonShapeDetailNamesInner], List.empty[PokemonSpeciesSummary])
  }

  /**
    * @inheritdoc
    */
  override def pokemonSpeciesList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedPokemonSpeciesSummaryList = {
    // TODO: Implement better logic

    PaginatedPokemonSpeciesSummaryList(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def pokemonSpeciesRetrieve(id: String): PokemonSpeciesDetail = {
    // TODO: Implement better logic

    PokemonSpeciesDetail(0, "", None, None, None, None, None, None, None, None, None, None, GrowthRateSummary("", ""), List.empty[PokemonDexEntry], List.empty[AbilityDetailPokemonInnerPokemon], PokemonColorSummary("", ""), PokemonShapeSummary("", ""), PokemonSpeciesSummary("", ""), EvolutionChainSummary(""), PokemonHabitatSummary("", ""), GenerationSummary("", ""), List.empty[PokemonFormDetailFormNamesInner], List.empty[PokemonSpeciesDetailPalParkEncountersInner], List.empty[PokemonSpeciesDescription], List.empty[PokemonSpeciesFlavorText], List.empty[PokemonSpeciesDetailGeneraInner], List.empty[PokemonSpeciesDetailVarietiesInner])
  }

  /**
    * @inheritdoc
    */
  override def statList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedStatSummaryList = {
    // TODO: Implement better logic

    PaginatedStatSummaryList(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def statRetrieve(id: String): StatDetail = {
    // TODO: Implement better logic

    StatDetail(0, "", 0, None, StatDetailAffectingMoves(List.empty[StatDetailAffectingMovesIncreaseInner], List.empty[StatDetailAffectingMovesIncreaseInner]), StatDetailAffectingNatures(List.empty[AbilityDetailPokemonInnerPokemon], List.empty[AbilityDetailPokemonInnerPokemon]), List.empty[CharacteristicSummary], MoveDamageClassSummary("", ""), List.empty[StatName])
  }

  /**
    * @inheritdoc
    */
  override def typeList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedTypeSummaryList = {
    // TODO: Implement better logic

    PaginatedTypeSummaryList(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def typeRetrieve(id: String): TypeDetail = {
    // TODO: Implement better logic

    TypeDetail(0, "", TypeDetailDamageRelations(List.empty[AbilityDetailPokemonInnerPokemon], List.empty[AbilityDetailPokemonInnerPokemon], List.empty[AbilityDetailPokemonInnerPokemon], List.empty[AbilityDetailPokemonInnerPokemon], List.empty[AbilityDetailPokemonInnerPokemon], List.empty[AbilityDetailPokemonInnerPokemon]), List.empty[TypeDetailPastDamageRelationsInner], List.empty[TypeGameIndex], GenerationSummary("", ""), MoveDamageClassSummary("", ""), List.empty[AbilityName], List.empty[TypeDetailPokemonInner], List.empty[MoveSummary], Map.empty[String, Map])
  }
}
