
package org.openapitools.client.model


case class PokedexDetailPokemonEntriesInner (
    _entryNumber: Integer,
    _pokemonSpecies: AbilityDetailPokemonInnerPokemon
)
object PokedexDetailPokemonEntriesInner {
    def toStringBody(var_entryNumber: Object, var_pokemonSpecies: Object) =
        s"""
        | {
        | "entryNumber":$var_entryNumber,"pokemonSpecies":$var_pokemonSpecies
        | }
        """.stripMargin
}
