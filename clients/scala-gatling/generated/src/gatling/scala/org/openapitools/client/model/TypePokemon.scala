
package org.openapitools.client.model


case class TypePokemon (
    /* The order the Pokémon's types are listed in. */
    _slot: Integer,
    /* The Pokémon that has the referenced type. */
    _pokemon: PokemonSummary
)
object TypePokemon {
    def toStringBody(var_slot: Object, var_pokemon: Object) =
        s"""
        | {
        | "slot":$var_slot,"pokemon":$var_pokemon
        | }
        """.stripMargin
}
