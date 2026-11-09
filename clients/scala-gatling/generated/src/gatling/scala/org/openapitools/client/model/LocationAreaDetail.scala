
package org.openapitools.client.model


case class LocationAreaDetail (
    /* The identifier for this resource. */
    _id: Integer,
    /* The name for this resource. */
    _name: String,
    /* The internal id of an API resource within game data. */
    _gameIndex: Integer,
    /* A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game. */
    _encounterMethodRates: List[LocationAreaEncounterRate],
    /* The region this location area can be found in. */
    _location: LocationSummary,
    /* The name of this resource listed in different languages. */
    _names: List[LocationAreaName],
    /* A list of Pokémon that can be encountered in this area along with version specific details about the encounter. */
    _pokemonEncounters: List[LocationAreaPokemonEncounter]
)
object LocationAreaDetail {
    def toStringBody(var_id: Object, var_name: Object, var_gameIndex: Object, var_encounterMethodRates: Object, var_location: Object, var_names: Object, var_pokemonEncounters: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"gameIndex":$var_gameIndex,"encounterMethodRates":$var_encounterMethodRates,"location":$var_location,"names":$var_names,"pokemonEncounters":$var_pokemonEncounters
        | }
        """.stripMargin
}
