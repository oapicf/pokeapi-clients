
package org.openapitools.client.model


case class PalParkAreaDetailPokemonEncountersInner (
    _baseScore: Integer,
    _pokemonSpecies: AbilityDetailPokemonInnerPokemon,
    _rate: Integer
)
object PalParkAreaDetailPokemonEncountersInner {
    def toStringBody(var_baseScore: Object, var_pokemonSpecies: Object, var_rate: Object) =
        s"""
        | {
        | "baseScore":$var_baseScore,"pokemonSpecies":$var_pokemonSpecies,"rate":$var_rate
        | }
        """.stripMargin
}
