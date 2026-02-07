
package org.openapitools.client.model


case class PokemonDetailTypesInner (
    _slot: Integer,
    _type: AbilityDetailPokemonInnerPokemon
)
object PokemonDetailTypesInner {
    def toStringBody(var_slot: Object, var_type: Object) =
        s"""
        | {
        | "slot":$var_slot,"type":$var_type
        | }
        """.stripMargin
}
