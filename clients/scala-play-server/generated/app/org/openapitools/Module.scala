package org.openapitools

import api._
import play.api.inject.{Binding, Module => PlayModule}
import play.api.{Configuration, Environment}

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-01-14T06:35:11.305578675Z[Etc/UTC]")
class Module extends PlayModule {
  override def bindings(environment: Environment, configuration: Configuration): Seq[Binding[_]] = Seq(
    bind[AbilityApi].to[AbilityApiImpl],
    bind[BerryApi].to[BerryApiImpl],
    bind[BerryFirmnessApi].to[BerryFirmnessApiImpl],
    bind[BerryFlavorApi].to[BerryFlavorApiImpl],
    bind[CharacteristicApi].to[CharacteristicApiImpl],
    bind[ContestEffectApi].to[ContestEffectApiImpl],
    bind[ContestTypeApi].to[ContestTypeApiImpl],
    bind[EggGroupApi].to[EggGroupApiImpl],
    bind[EncounterConditionApi].to[EncounterConditionApiImpl],
    bind[EncounterConditionValueApi].to[EncounterConditionValueApiImpl],
    bind[EncounterMethodApi].to[EncounterMethodApiImpl],
    bind[EvolutionChainApi].to[EvolutionChainApiImpl],
    bind[EvolutionTriggerApi].to[EvolutionTriggerApiImpl],
    bind[GenderApi].to[GenderApiImpl],
    bind[GenerationApi].to[GenerationApiImpl],
    bind[GrowthRateApi].to[GrowthRateApiImpl],
    bind[ItemApi].to[ItemApiImpl],
    bind[ItemAttributeApi].to[ItemAttributeApiImpl],
    bind[ItemCategoryApi].to[ItemCategoryApiImpl],
    bind[ItemFlingEffectApi].to[ItemFlingEffectApiImpl],
    bind[ItemPocketApi].to[ItemPocketApiImpl],
    bind[LanguageApi].to[LanguageApiImpl],
    bind[LocationApi].to[LocationApiImpl],
    bind[LocationAreaApi].to[LocationAreaApiImpl],
    bind[MachineApi].to[MachineApiImpl],
    bind[MoveApi].to[MoveApiImpl],
    bind[MoveAilmentApi].to[MoveAilmentApiImpl],
    bind[MoveBattleStyleApi].to[MoveBattleStyleApiImpl],
    bind[MoveCategoryApi].to[MoveCategoryApiImpl],
    bind[MoveDamageClassApi].to[MoveDamageClassApiImpl],
    bind[MoveLearnMethodApi].to[MoveLearnMethodApiImpl],
    bind[MoveTargetApi].to[MoveTargetApiImpl],
    bind[NatureApi].to[NatureApiImpl],
    bind[PalParkAreaApi].to[PalParkAreaApiImpl],
    bind[PokeathlonStatApi].to[PokeathlonStatApiImpl],
    bind[PokedexApi].to[PokedexApiImpl],
    bind[PokemonApi].to[PokemonApiImpl],
    bind[PokemonColorApi].to[PokemonColorApiImpl],
    bind[PokemonFormApi].to[PokemonFormApiImpl],
    bind[PokemonHabitatApi].to[PokemonHabitatApiImpl],
    bind[PokemonShapeApi].to[PokemonShapeApiImpl],
    bind[PokemonSpeciesApi].to[PokemonSpeciesApiImpl],
    bind[RegionApi].to[RegionApiImpl],
    bind[StatApi].to[StatApiImpl],
    bind[SuperContestEffectApi].to[SuperContestEffectApiImpl],
    bind[TypeApi].to[TypeApiImpl],
    bind[VersionApi].to[VersionApiImpl],
    bind[VersionGroupApi].to[VersionGroupApiImpl]
  )
}
