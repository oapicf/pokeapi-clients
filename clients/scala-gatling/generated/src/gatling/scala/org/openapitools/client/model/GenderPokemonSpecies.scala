
package org.openapitools.client.model


case class GenderPokemonSpecies (
    /* The chance of this Pokémon being female, in eighths; or -1 for genderless. */
    _rate: Integer,
    /* A Pokémon species that can be the referenced gender. */
    _pokemonSpecies: PokemonSpeciesSummary
)
object GenderPokemonSpecies {
    def toStringBody(var_rate: Object, var_pokemonSpecies: Object) =
        s"""
        | {
        | "rate":$var_rate,"pokemonSpecies":$var_pokemonSpecies
        | }
        """.stripMargin
}
