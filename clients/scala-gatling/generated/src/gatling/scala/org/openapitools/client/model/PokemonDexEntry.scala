
package org.openapitools.client.model


case class PokemonDexEntry (
    _entryNumber: Integer,
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
