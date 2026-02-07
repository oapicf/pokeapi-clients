
package org.openapitools.client.model


case class GenderDetailPokemonSpeciesDetailsInner (
    _rate: Integer,
    _pokemonSpecies: AbilityDetailPokemonInnerPokemon
)
object GenderDetailPokemonSpeciesDetailsInner {
    def toStringBody(var_rate: Object, var_pokemonSpecies: Object) =
        s"""
        | {
        | "rate":$var_rate,"pokemonSpecies":$var_pokemonSpecies
        | }
        """.stripMargin
}
