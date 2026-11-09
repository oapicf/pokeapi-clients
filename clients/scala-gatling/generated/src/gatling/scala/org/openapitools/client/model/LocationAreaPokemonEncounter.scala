
package org.openapitools.client.model


case class LocationAreaPokemonEncounter (
    /* The Pokémon being encountered. */
    _pokemon: PokemonSummary,
    /* A list of versions and encounters with Pokémon that might happen in the referenced location area. */
    _versionDetails: List[LocationAreaPokemonEncounterVersion]
)
object LocationAreaPokemonEncounter {
    def toStringBody(var_pokemon: Object, var_versionDetails: Object) =
        s"""
        | {
        | "pokemon":$var_pokemon,"versionDetails":$var_versionDetails
        | }
        """.stripMargin
}
