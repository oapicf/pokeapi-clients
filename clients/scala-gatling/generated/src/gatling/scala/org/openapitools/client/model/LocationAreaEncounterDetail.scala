
package org.openapitools.client.model


case class LocationAreaEncounterDetail (
    /* The lowest level the Pokémon could be encountered at. */
    _minLevel: Integer,
    /* The highest level the Pokémon could be encountered at. */
    _maxLevel: Integer,
    /* Percent chance that this encounter will occur. */
    _chance: Option[Integer],
    /* The method by which this encounter happens. */
    _method: Option[EncounterMethodSummary],
    /* A list of condition values that must be in effect for this encounter to occur. */
    _conditionValues: List[EncounterConditionValueSummary],
    /* Additional properties of the encountered Pokémon, or null if unspecified. */
    _pokemonDetails: EncounterPokemonDetail
)
object LocationAreaEncounterDetail {
    def toStringBody(var_minLevel: Object, var_maxLevel: Object, var_chance: Object, var_method: Object, var_conditionValues: Object, var_pokemonDetails: Object) =
        s"""
        | {
        | "minLevel":$var_minLevel,"maxLevel":$var_maxLevel,"chance":$var_chance,"method":$var_method,"conditionValues":$var_conditionValues,"pokemonDetails":$var_pokemonDetails
        | }
        """.stripMargin
}
