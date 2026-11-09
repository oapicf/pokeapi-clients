
package org.openapitools.client.model


case class PokemonEncounterResponse (
    /* The location area the referenced Pokémon can be encountered in. */
    _locationArea: LocationAreaSummary,
    /* A list of versions and encounters with the referenced Pokémon that might happen. */
    _versionDetails: List[PokemonEncounterVersionDetailResponse]
)
object PokemonEncounterResponse {
    def toStringBody(var_locationArea: Object, var_versionDetails: Object) =
        s"""
        | {
        | "locationArea":$var_locationArea,"versionDetails":$var_versionDetails
        | }
        """.stripMargin
}
