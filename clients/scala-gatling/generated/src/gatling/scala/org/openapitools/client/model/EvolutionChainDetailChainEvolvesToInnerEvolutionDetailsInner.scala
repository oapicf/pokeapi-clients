
package org.openapitools.client.model


case class EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner (
    _gender: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender,
    _heldItem: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender,
    _item: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender,
    _knownMove: Any,
    _knownMoveType: Any,
    _location: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender,
    _minAffection: Integer,
    _minBeauty: Integer,
    _minHappiness: Integer,
    _minLevel: Integer,
    _needsOverworldRain: Boolean,
    _partySpecies: String,
    _partyType: String,
    _relativePhysicalStats: String,
    _timeOfDay: String,
    _tradeSpecies: String,
    _trigger: AbilityDetailPokemonInnerPokemon,
    _turnUpsideDown: Boolean
)
object EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner {
    def toStringBody(var_gender: Object, var_heldItem: Object, var_item: Object, var_knownMove: Object, var_knownMoveType: Object, var_location: Object, var_minAffection: Object, var_minBeauty: Object, var_minHappiness: Object, var_minLevel: Object, var_needsOverworldRain: Object, var_partySpecies: Object, var_partyType: Object, var_relativePhysicalStats: Object, var_timeOfDay: Object, var_tradeSpecies: Object, var_trigger: Object, var_turnUpsideDown: Object) =
        s"""
        | {
        | "gender":$var_gender,"heldItem":$var_heldItem,"item":$var_item,"knownMove":$var_knownMove,"knownMoveType":$var_knownMoveType,"location":$var_location,"minAffection":$var_minAffection,"minBeauty":$var_minBeauty,"minHappiness":$var_minHappiness,"minLevel":$var_minLevel,"needsOverworldRain":$var_needsOverworldRain,"partySpecies":$var_partySpecies,"partyType":$var_partyType,"relativePhysicalStats":$var_relativePhysicalStats,"timeOfDay":$var_timeOfDay,"tradeSpecies":$var_tradeSpecies,"trigger":$var_trigger,"turnUpsideDown":$var_turnUpsideDown
        | }
        """.stripMargin
}
