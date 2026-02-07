
package org.openapitools.client.model


case class PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner (
    _encounterDetails: List[PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner],
    _maxChance: Number,
    _version: PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion
)
object PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner {
    def toStringBody(var_encounterDetails: Object, var_maxChance: Object, var_version: Object) =
        s"""
        | {
        | "encounterDetails":$var_encounterDetails,"maxChance":$var_maxChance,"version":$var_version
        | }
        """.stripMargin
}
