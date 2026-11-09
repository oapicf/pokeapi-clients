
package org.openapitools.client.model


case class PokemonDexNumber (
    /* The index of this Pokémon species entry within the Pokédex. */
    _entryNumber: Integer,
    /* The Pokémon species being encountered. */
    _pokemonSpecies: PokemonSpeciesSummary
)
object PokemonDexNumber {
    def toStringBody(var_entryNumber: Object, var_pokemonSpecies: Object) =
        s"""
        | {
        | "entryNumber":$var_entryNumber,"pokemonSpecies":$var_pokemonSpecies
        | }
        """.stripMargin
}
