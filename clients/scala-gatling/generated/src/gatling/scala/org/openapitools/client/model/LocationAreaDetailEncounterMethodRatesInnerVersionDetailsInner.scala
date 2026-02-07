
package org.openapitools.client.model


case class LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner (
    _rate: Integer,
    _version: AbilityDetailPokemonInnerPokemon
)
object LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner {
    def toStringBody(var_rate: Object, var_version: Object) =
        s"""
        | {
        | "rate":$var_rate,"version":$var_version
        | }
        """.stripMargin
}
