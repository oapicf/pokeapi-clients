
package org.openapitools.client.model


case class PokemonSpeciesDetailPalParkEncountersInner (
    _area: AbilityDetailPokemonInnerPokemon,
    _baseScore: Integer,
    _rate: Integer
)
object PokemonSpeciesDetailPalParkEncountersInner {
    def toStringBody(var_area: Object, var_baseScore: Object, var_rate: Object) =
        s"""
        | {
        | "area":$var_area,"baseScore":$var_baseScore,"rate":$var_rate
        | }
        """.stripMargin
}
