
package org.openapitools.client.model


case class LocationAreaDetail (
    _id: Integer,
    _name: String,
    _gameIndex: Integer,
    _encounterMethodRates: List[LocationAreaDetailEncounterMethodRatesInner],
    _location: LocationSummary,
    _names: List[LocationAreaName],
    _pokemonEncounters: List[LocationAreaDetailPokemonEncountersInner]
)
object LocationAreaDetail {
    def toStringBody(var_id: Object, var_name: Object, var_gameIndex: Object, var_encounterMethodRates: Object, var_location: Object, var_names: Object, var_pokemonEncounters: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"gameIndex":$var_gameIndex,"encounterMethodRates":$var_encounterMethodRates,"location":$var_location,"names":$var_names,"pokemonEncounters":$var_pokemonEncounters
        | }
        """.stripMargin
}
