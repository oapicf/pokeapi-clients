
package org.openapitools.client.model


case class LocationAreaDetailPokemonEncountersInner (
    _pokemon: AbilityDetailPokemonInnerPokemon,
    _versionDetails: List[LocationAreaDetailPokemonEncountersInnerVersionDetailsInner]
)
object LocationAreaDetailPokemonEncountersInner {
    def toStringBody(var_pokemon: Object, var_versionDetails: Object) =
        s"""
        | {
        | "pokemon":$var_pokemon,"versionDetails":$var_versionDetails
        | }
        """.stripMargin
}
