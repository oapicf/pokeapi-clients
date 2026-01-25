package org.openapitools.server

import akka.http.scaladsl.Http
import akka.http.scaladsl.server.Route
import org.openapitools.server.api.AbilityApi
import org.openapitools.server.api.BerryApi
import org.openapitools.server.api.BerryFirmnessApi
import org.openapitools.server.api.BerryFlavorApi
import org.openapitools.server.api.CharacteristicApi
import org.openapitools.server.api.ContestEffectApi
import org.openapitools.server.api.ContestTypeApi
import org.openapitools.server.api.EggGroupApi
import org.openapitools.server.api.EncounterConditionApi
import org.openapitools.server.api.EncounterConditionValueApi
import org.openapitools.server.api.EncounterMethodApi
import org.openapitools.server.api.EvolutionChainApi
import org.openapitools.server.api.EvolutionTriggerApi
import org.openapitools.server.api.GenderApi
import org.openapitools.server.api.GenerationApi
import org.openapitools.server.api.GrowthRateApi
import org.openapitools.server.api.ItemApi
import org.openapitools.server.api.ItemAttributeApi
import org.openapitools.server.api.ItemCategoryApi
import org.openapitools.server.api.ItemFlingEffectApi
import org.openapitools.server.api.ItemPocketApi
import org.openapitools.server.api.LanguageApi
import org.openapitools.server.api.LocationApi
import org.openapitools.server.api.LocationAreaApi
import org.openapitools.server.api.MachineApi
import org.openapitools.server.api.MoveApi
import org.openapitools.server.api.MoveAilmentApi
import org.openapitools.server.api.MoveBattleStyleApi
import org.openapitools.server.api.MoveCategoryApi
import org.openapitools.server.api.MoveDamageClassApi
import org.openapitools.server.api.MoveLearnMethodApi
import org.openapitools.server.api.MoveTargetApi
import org.openapitools.server.api.NatureApi
import org.openapitools.server.api.PalParkAreaApi
import org.openapitools.server.api.PokeathlonStatApi
import org.openapitools.server.api.PokedexApi
import org.openapitools.server.api.PokemonApi
import org.openapitools.server.api.PokemonColorApi
import org.openapitools.server.api.PokemonFormApi
import org.openapitools.server.api.PokemonHabitatApi
import org.openapitools.server.api.PokemonShapeApi
import org.openapitools.server.api.PokemonSpeciesApi
import org.openapitools.server.api.RegionApi
import org.openapitools.server.api.StatApi
import org.openapitools.server.api.SuperContestEffectApi
import org.openapitools.server.api.TypeApi
import org.openapitools.server.api.VersionApi
import org.openapitools.server.api.VersionGroupApi

import akka.http.scaladsl.server.Directives._
import akka.actor.ActorSystem
import akka.stream.Materializer

class Controller(ability: AbilityApi, berry: BerryApi, berryFirmness: BerryFirmnessApi, berryFlavor: BerryFlavorApi, characteristic: CharacteristicApi, contestEffect: ContestEffectApi, contestType: ContestTypeApi, eggGroup: EggGroupApi, encounterCondition: EncounterConditionApi, encounterConditionValue: EncounterConditionValueApi, encounterMethod: EncounterMethodApi, evolutionChain: EvolutionChainApi, evolutionTrigger: EvolutionTriggerApi, gender: GenderApi, generation: GenerationApi, growthRate: GrowthRateApi, item: ItemApi, itemAttribute: ItemAttributeApi, itemCategory: ItemCategoryApi, itemFlingEffect: ItemFlingEffectApi, itemPocket: ItemPocketApi, language: LanguageApi, location: LocationApi, locationArea: LocationAreaApi, machine: MachineApi, move: MoveApi, moveAilment: MoveAilmentApi, moveBattleStyle: MoveBattleStyleApi, moveCategory: MoveCategoryApi, moveDamageClass: MoveDamageClassApi, moveLearnMethod: MoveLearnMethodApi, moveTarget: MoveTargetApi, nature: NatureApi, palParkArea: PalParkAreaApi, pokeathlonStat: PokeathlonStatApi, pokedex: PokedexApi, pokemon: PokemonApi, pokemonColor: PokemonColorApi, pokemonForm: PokemonFormApi, pokemonHabitat: PokemonHabitatApi, pokemonShape: PokemonShapeApi, pokemonSpecies: PokemonSpeciesApi, region: RegionApi, stat: StatApi, superContestEffect: SuperContestEffectApi, type: TypeApi, version: VersionApi, versionGroup: VersionGroupApi)(implicit system: ActorSystem, materializer: Materializer) {

    lazy val routes: Route = ability.route ~ berry.route ~ berryFirmness.route ~ berryFlavor.route ~ characteristic.route ~ contestEffect.route ~ contestType.route ~ eggGroup.route ~ encounterCondition.route ~ encounterConditionValue.route ~ encounterMethod.route ~ evolutionChain.route ~ evolutionTrigger.route ~ gender.route ~ generation.route ~ growthRate.route ~ item.route ~ itemAttribute.route ~ itemCategory.route ~ itemFlingEffect.route ~ itemPocket.route ~ language.route ~ location.route ~ locationArea.route ~ machine.route ~ move.route ~ moveAilment.route ~ moveBattleStyle.route ~ moveCategory.route ~ moveDamageClass.route ~ moveLearnMethod.route ~ moveTarget.route ~ nature.route ~ palParkArea.route ~ pokeathlonStat.route ~ pokedex.route ~ pokemon.route ~ pokemonColor.route ~ pokemonForm.route ~ pokemonHabitat.route ~ pokemonShape.route ~ pokemonSpecies.route ~ region.route ~ stat.route ~ superContestEffect.route ~ type.route ~ version.route ~ versionGroup.route 

    Http().newServerAt("0.0.0.0", 9000).bind(routes)
}
