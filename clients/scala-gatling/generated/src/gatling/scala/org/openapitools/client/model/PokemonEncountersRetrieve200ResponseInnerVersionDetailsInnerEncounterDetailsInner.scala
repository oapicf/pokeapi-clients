
package org.openapitools.client.model


case class PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner (
    _chance: Number,
    _conditionValues: List[PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner],
    _maxLevel: Number,
    _method: PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod,
    _minLevel: Number
)
object PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner {
    def toStringBody(var_chance: Object, var_conditionValues: Object, var_maxLevel: Object, var_method: Object, var_minLevel: Object) =
        s"""
        | {
        | "chance":$var_chance,"conditionValues":$var_conditionValues,"maxLevel":$var_maxLevel,"method":$var_method,"minLevel":$var_minLevel
        | }
        """.stripMargin
}
