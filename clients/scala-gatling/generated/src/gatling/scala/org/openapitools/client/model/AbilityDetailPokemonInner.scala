
package org.openapitools.client.model


case class AbilityDetailPokemonInner (
    _isHidden: Boolean,
    _slot: Integer,
    _pokemon: AbilityDetailPokemonInnerPokemon
)
object AbilityDetailPokemonInner {
    def toStringBody(var_isHidden: Object, var_slot: Object, var_pokemon: Object) =
        s"""
        | {
        | "isHidden":$var_isHidden,"slot":$var_slot,"pokemon":$var_pokemon
        | }
        """.stripMargin
}
