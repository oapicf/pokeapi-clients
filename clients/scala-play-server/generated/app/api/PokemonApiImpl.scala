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
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
class PokemonApiImpl extends PokemonApi {
  /**
    * @inheritdoc
    */
  override def abilityList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedAbilitySummaryList = {
    // TODO: Implement better logic

    PaginatedAbilitySummaryList(0, None, None, List.empty[AbilitySummary])
  }

  /**
    * @inheritdoc
    */
  override def abilityRetrieve(id: String): AbilityDetail = {
    // TODO: Implement better logic

    AbilityDetail(0, "", None, GenerationSummary("", ""), List.empty[AbilityName], List.empty[AbilityEffectText], List.empty[AbilityChange], List.empty[AbilityFlavorText], List.empty[AbilityPokemonDetail])
  }

  /**
    * @inheritdoc
    */
  override def characteristicList(limit: Option[Int], offset: Option[Int]): PaginatedCharacteristicSummaryList = {
    // TODO: Implement better logic

    PaginatedCharacteristicSummaryList(0, None, None, List.empty[CharacteristicSummary])
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

    PaginatedEggGroupSummaryList(0, None, None, List.empty[EggGroupSummary])
  }

  /**
    * @inheritdoc
    */
  override def eggGroupRetrieve(id: String): EggGroupDetail = {
    // TODO: Implement better logic

    EggGroupDetail(0, "", List.empty[EggGroupName], List.empty[PokemonSpeciesSummary])
  }

  /**
    * @inheritdoc
    */
  override def genderList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedGenderSummaryList = {
    // TODO: Implement better logic

    PaginatedGenderSummaryList(0, None, None, List.empty[GenderSummary])
  }

  /**
    * @inheritdoc
    */
  override def genderRetrieve(id: String): GenderDetail = {
    // TODO: Implement better logic

    GenderDetail(0, "", List.empty[GenderPokemonSpecies], List.empty[PokemonSpeciesSummary])
  }

  /**
    * @inheritdoc
    */
  override def growthRateList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedGrowthRateSummaryList = {
    // TODO: Implement better logic

    PaginatedGrowthRateSummaryList(0, None, None, List.empty[GrowthRateSummary])
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

    PaginatedMoveDamageClassSummaryList(0, None, None, List.empty[MoveDamageClassSummary])
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

    PaginatedNatureSummaryList(0, None, None, List.empty[NatureSummary])
  }

  /**
    * @inheritdoc
    */
  override def natureRetrieve(id: String): NatureDetail = {
    // TODO: Implement better logic

    NatureDetail(0, "", StatSummary("", ""), StatSummary("", ""), BerryFlavorSummary("", ""), BerryFlavorSummary("", ""), List.empty[NaturePokeathlonStat], List.empty[NatureBattleStylePreference], List.empty[NatureName])
  }

  /**
    * @inheritdoc
    */
  override def pokeathlonStatList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedPokeathlonStatSummaryList = {
    // TODO: Implement better logic

    PaginatedPokeathlonStatSummaryList(0, None, None, List.empty[PokeathlonStatSummary])
  }

  /**
    * @inheritdoc
    */
  override def pokeathlonStatRetrieve(id: String): PokeathlonStatDetail = {
    // TODO: Implement better logic

    PokeathlonStatDetail(0, "", PokeathlonStatAffectingNatures(List.empty[PokeathlonStatAffectingNature], List.empty[PokeathlonStatAffectingNature]), List.empty[PokeathlonStatName])
  }

  /**
    * @inheritdoc
    */
  override def pokemonColorList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedPokemonColorSummaryList = {
    // TODO: Implement better logic

    PaginatedPokemonColorSummaryList(0, None, None, List.empty[PokemonColorSummary])
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

    PaginatedPokemonFormSummaryList(0, None, None, List.empty[PokemonFormSummary])
  }

  /**
    * @inheritdoc
    */
  override def pokemonFormRetrieve(id: String): PokemonFormDetail = {
    // TODO: Implement better logic

    PokemonFormDetail(0, "", None, None, None, None, None, "", PokemonSummary("", ""), PokemonFormSprites("", "", "", "", "", "", "", "", None, None), VersionGroupSummary("", ""), List.empty[PokemonFormName], List.empty[PokemonFormName], List.empty[PokemonFormType], List.empty[PokemonFormTriggerCondition], List.empty[PokemonFormFlavorText])
  }

  /**
    * @inheritdoc
    */
  override def pokemonHabitatList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedPokemonHabitatSummaryList = {
    // TODO: Implement better logic

    PaginatedPokemonHabitatSummaryList(0, None, None, List.empty[PokemonHabitatSummary])
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

    PaginatedPokemonSummaryList(0, None, None, List.empty[PokemonSummary])
  }

  /**
    * @inheritdoc
    */
  override def pokemonRetrieve(id: String): PokemonDetail = {
    // TODO: Implement better logic

    PokemonDetail(0, "", None, None, None, None, None, List.empty[PokemonAbility], List.empty[PokemonPastAbility], List.empty[PokemonFormSummary], List.empty[PokemonGameIndex], List.empty[PokemonHeldItemSummary], "", List.empty[PokemonMove], PokemonSpeciesSummary("", ""), PokemonSprites("", "", "", "", "", "", "", "", None, None), PokemonCries("", ""), List.empty[PokemonStat], List.empty[PokemonPastStat], List.empty[PokemonType], List.empty[PokemonPastType])
  }

  /**
    * @inheritdoc
    */
  override def pokemonShapeList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedPokemonShapeSummaryList = {
    // TODO: Implement better logic

    PaginatedPokemonShapeSummaryList(0, None, None, List.empty[PokemonShapeSummary])
  }

  /**
    * @inheritdoc
    */
  override def pokemonShapeRetrieve(id: String): PokemonShapeDetail = {
    // TODO: Implement better logic

    PokemonShapeDetail(0, "", List.empty[PokemonShapeAwesomeName], List.empty[PokemonShapeName], List.empty[PokemonSpeciesSummary])
  }

  /**
    * @inheritdoc
    */
  override def pokemonSpeciesList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedPokemonSpeciesSummaryList = {
    // TODO: Implement better logic

    PaginatedPokemonSpeciesSummaryList(0, None, None, List.empty[PokemonSpeciesSummary])
  }

  /**
    * @inheritdoc
    */
  override def pokemonSpeciesRetrieve(id: String): PokemonSpeciesDetail = {
    // TODO: Implement better logic

    PokemonSpeciesDetail(0, "", None, None, None, None, None, None, None, None, None, None, GrowthRateSummary("", ""), List.empty[PokemonDexEntry], List.empty[EggGroupSummary], PokemonColorSummary("", ""), PokemonShapeSummary("", ""), PokemonSpeciesSummary("", ""), EvolutionChainSummary(""), PokemonHabitatSummary("", ""), GenerationSummary("", ""), List.empty[PokemonSpeciesName], List.empty[PokemonSpeciesPalParkEncounter], List.empty[PokemonSpeciesDescription], List.empty[PokemonSpeciesFlavorText], List.empty[PokemonSpeciesGenus], List.empty[PokemonSpeciesVariety])
  }

  /**
    * @inheritdoc
    */
  override def statList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedStatSummaryList = {
    // TODO: Implement better logic

    PaginatedStatSummaryList(0, None, None, List.empty[StatSummary])
  }

  /**
    * @inheritdoc
    */
  override def statRetrieve(id: String): StatDetail = {
    // TODO: Implement better logic

    StatDetail(0, "", 0, None, StatAffectingMoves(List.empty[MoveStatChange], List.empty[MoveStatChange]), StatAffectingNatures(List.empty[NatureSummary], List.empty[NatureSummary]), List.empty[ItemSummary], List.empty[CharacteristicSummary], MoveDamageClassSummary("", ""), List.empty[StatName])
  }

  /**
    * @inheritdoc
    */
  override def typeList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedTypeSummaryList = {
    // TODO: Implement better logic

    PaginatedTypeSummaryList(0, None, None, List.empty[TypeSummary])
  }

  /**
    * @inheritdoc
    */
  override def typeRetrieve(id: String): TypeDetail = {
    // TODO: Implement better logic

    TypeDetail(0, "", TypeRelationships(List.empty[TypeSummary], List.empty[TypeSummary], List.empty[TypeSummary], List.empty[TypeSummary], List.empty[TypeSummary], List.empty[TypeSummary]), List.empty[TypePastRelationships], List.empty[TypeGameIndex], GenerationSummary("", ""), MoveDamageClassSummary("", ""), List.empty[TypeName], List.empty[TypePokemon], List.empty[MoveSummary], Map.empty[String, Map])
  }
}
