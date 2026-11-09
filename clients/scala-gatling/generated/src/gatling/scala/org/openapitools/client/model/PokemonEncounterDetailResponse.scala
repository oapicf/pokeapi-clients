
package org.openapitools.client.model


case class PokemonEncounterDetailResponse (
    /* Percent chance that this encounter will occur. */
    _chance: Integer,
    /* A list of condition values that must be in effect for this encounter to occur. */
    _conditionValues: List[EncounterConditionValueSummary],
    /* The highest level the Pokémon could be encountered at. */
    _maxLevel: Integer,
    /* The method by which this encounter happens. */
    _method: EncounterMethodSummary,
    /* The lowest level the Pokémon could be encountered at. */
    _minLevel: Integer
)
object PokemonEncounterDetailResponse {
    def toStringBody(var_chance: Object, var_conditionValues: Object, var_maxLevel: Object, var_method: Object, var_minLevel: Object) =
        s"""
        | {
        | "chance":$var_chance,"conditionValues":$var_conditionValues,"maxLevel":$var_maxLevel,"method":$var_method,"minLevel":$var_minLevel
        | }
        """.stripMargin
}
