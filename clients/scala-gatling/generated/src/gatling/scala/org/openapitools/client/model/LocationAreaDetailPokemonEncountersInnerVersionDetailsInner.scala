
package org.openapitools.client.model


case class LocationAreaDetailPokemonEncountersInnerVersionDetailsInner (
    _version: AbilityDetailPokemonInnerPokemon,
    _maxChance: Integer,
    _encounterDetails: LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails
)
object LocationAreaDetailPokemonEncountersInnerVersionDetailsInner {
    def toStringBody(var_version: Object, var_maxChance: Object, var_encounterDetails: Object) =
        s"""
        | {
        | "version":$var_version,"maxChance":$var_maxChance,"encounterDetails":$var_encounterDetails
        | }
        """.stripMargin
}
