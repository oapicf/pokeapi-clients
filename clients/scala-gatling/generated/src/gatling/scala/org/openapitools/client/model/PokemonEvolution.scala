
package org.openapitools.client.model


case class PokemonEvolution (
    /* The version group in which these evolution requirements apply. */
    _versionGroup: VersionGroupSummary,
    /* Whether the evolution is considered as the expected evolution in a main series game. Each unique Pokémon variety of a line capable of evolution should have exactly one 'default' evolution. For example, the Meowth species has three default evolutions as there are three distinct varieties it can evolve into: Persian, Alolan Persian, and Perrserker. */
    _isDefault: Option[Boolean],
    /* The item required to cause evolution this into Pokémon species. */
    _item: ItemSummary,
    /* The type of event that triggers evolution into this Pokémon species. */
    _trigger: EvolutionTriggerSummary,
    /* The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species. */
    _gender: Option[Integer],
    /* The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species. */
    _heldItem: ItemSummary,
    _knownMove: PokemonEvolutionKnownMove,
    _knownMoveType: PokemonEvolutionKnownMove,
    /* The location the evolution must be triggered at. */
    _location: LocationSummary,
    /* The minimum required level of the evolving Pokémon species to evolve into this Pokémon species. */
    _minLevel: Option[Integer],
    /* The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species. */
    _minHappiness: Option[Integer],
    /* The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species. */
    _minBeauty: Option[Integer],
    /* The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species. */
    _minAffection: Option[Integer],
    /* Whether or not you need to be near a Moss Rock or Icy Rock to evolve into this Pokémon species. */
    _nearSpecialRock: Option[Boolean],
    /* Whether or not multiplayer link play is needed to evolve into this Pokémon species (e.g. Union Circle). */
    _needsMultiplayer: Option[Boolean],
    /* Whether or not it must be raining in the overworld to cause evolution this Pokémon species. */
    _needsOverworldRain: Option[Boolean],
    /* The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species. */
    _partySpecies: PokemonSpeciesSummary,
    /* The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species. */
    _partyType: TypeSummary,
    /* The required relation between the Pokémon's Attack and Defense stats. 1 means Attack > Defense. 0 means Attack = Defense. -1 means Attack < Defense. */
    _relativePhysicalStats: Option[Integer],
    /* The required time of day. Day or night. */
    _timeOfDay: Option[String],
    /* Pokémon species for which this one must be traded. */
    _tradeSpecies: PokemonSpeciesSummary,
    /* Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up. */
    _turnUpsideDown: Option[Boolean],
    /* The required region in which this evolution can occur. */
    _region: RegionSummary,
    /* The Pokémon form required before evolving, or null if unrestricted. */
    _requiredPokemonForm: PokemonFormSummary,
    /* The Pokémon form produced by this evolution, or null if unspecified. */
    _evolvedPokemonForm: PokemonFormSummary,
    /* The move that must be used by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species. */
    _usedMove: MoveSummary,
    /* The minimum number of times a move must be used in order to evolve into this Pokémon species. */
    _minMoveCount: Option[Integer],
    /* The minimum number of steps that must be taken in order to evolve into this Pokémon species. */
    _minSteps: Option[Integer],
    /* The minimum amount of damage taken during the evolution trigger event in order to evolve into this Pokémon species. */
    _minDamageTaken: Option[Integer],
    /* The natures that allow this evolution, or null if unrestricted. */
    _allowedNatures: List[NatureSummary],
    /* An additional evolution condition expressed in reverse Polish notation, or null if none. */
    _conditionExpression: EvolutionConditionExpression
)
object PokemonEvolution {
    def toStringBody(var_versionGroup: Object, var_isDefault: Object, var_item: Object, var_trigger: Object, var_gender: Object, var_heldItem: Object, var_knownMove: Object, var_knownMoveType: Object, var_location: Object, var_minLevel: Object, var_minHappiness: Object, var_minBeauty: Object, var_minAffection: Object, var_nearSpecialRock: Object, var_needsMultiplayer: Object, var_needsOverworldRain: Object, var_partySpecies: Object, var_partyType: Object, var_relativePhysicalStats: Object, var_timeOfDay: Object, var_tradeSpecies: Object, var_turnUpsideDown: Object, var_region: Object, var_requiredPokemonForm: Object, var_evolvedPokemonForm: Object, var_usedMove: Object, var_minMoveCount: Object, var_minSteps: Object, var_minDamageTaken: Object, var_allowedNatures: Object, var_conditionExpression: Object) =
        s"""
        | {
        | "versionGroup":$var_versionGroup,"isDefault":$var_isDefault,"item":$var_item,"trigger":$var_trigger,"gender":$var_gender,"heldItem":$var_heldItem,"knownMove":$var_knownMove,"knownMoveType":$var_knownMoveType,"location":$var_location,"minLevel":$var_minLevel,"minHappiness":$var_minHappiness,"minBeauty":$var_minBeauty,"minAffection":$var_minAffection,"nearSpecialRock":$var_nearSpecialRock,"needsMultiplayer":$var_needsMultiplayer,"needsOverworldRain":$var_needsOverworldRain,"partySpecies":$var_partySpecies,"partyType":$var_partyType,"relativePhysicalStats":$var_relativePhysicalStats,"timeOfDay":$var_timeOfDay,"tradeSpecies":$var_tradeSpecies,"turnUpsideDown":$var_turnUpsideDown,"region":$var_region,"requiredPokemonForm":$var_requiredPokemonForm,"evolvedPokemonForm":$var_evolvedPokemonForm,"usedMove":$var_usedMove,"minMoveCount":$var_minMoveCount,"minSteps":$var_minSteps,"minDamageTaken":$var_minDamageTaken,"allowedNatures":$var_allowedNatures,"conditionExpression":$var_conditionExpression
        | }
        """.stripMargin
}
