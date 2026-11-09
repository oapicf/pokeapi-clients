
package org.openapitools.client.model


case class PokemonDexEntry (
    /* The index number within the Pokédex. */
    _entryNumber: Integer,
    /* The Pokédex the referenced Pokémon species can be found in. */
    _pokedex: PokedexSummary
)
object PokemonDexEntry {
    def toStringBody(var_entryNumber: Object, var_pokedex: Object) =
        s"""
        | {
        | "entryNumber":$var_entryNumber,"pokedex":$var_pokedex
        | }
        """.stripMargin
}
