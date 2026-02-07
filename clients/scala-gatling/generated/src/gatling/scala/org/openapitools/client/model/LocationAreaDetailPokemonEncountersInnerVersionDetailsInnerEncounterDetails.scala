
package org.openapitools.client.model


case class LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails (
    _minLevel: Integer,
    _maxLevel: Integer,
    _conditionValues: Option[AbilityDetailPokemonInnerPokemon],
    _chance: Integer,
    _method: AbilityDetailPokemonInnerPokemon
)
object LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails {
    def toStringBody(var_minLevel: Object, var_maxLevel: Object, var_conditionValues: Object, var_chance: Object, var_method: Object) =
        s"""
        | {
        | "minLevel":$var_minLevel,"maxLevel":$var_maxLevel,"conditionValues":$var_conditionValues,"chance":$var_chance,"method":$var_method
        | }
        """.stripMargin
}
