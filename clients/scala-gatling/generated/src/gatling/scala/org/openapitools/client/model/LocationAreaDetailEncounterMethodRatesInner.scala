
package org.openapitools.client.model


case class LocationAreaDetailEncounterMethodRatesInner (
    _encounterMethod: AbilityDetailPokemonInnerPokemon,
    _versionDetails: List[LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner]
)
object LocationAreaDetailEncounterMethodRatesInner {
    def toStringBody(var_encounterMethod: Object, var_versionDetails: Object) =
        s"""
        | {
        | "encounterMethod":$var_encounterMethod,"versionDetails":$var_versionDetails
        | }
        """.stripMargin
}
