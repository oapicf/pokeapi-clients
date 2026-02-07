
package org.openapitools.client.model


case class TypeDetailPokemonInner (
    _slot: Option[Integer],
    _pokemon: Option[TypeDetailPokemonInnerPokemon]
)
object TypeDetailPokemonInner {
    def toStringBody(var_slot: Object, var_pokemon: Object) =
        s"""
        | {
        | "slot":$var_slot,"pokemon":$var_pokemon
        | }
        """.stripMargin
}
