
package org.openapitools.client.model


case class PokemonDetailAbilitiesInner (
    _ability: AbilityDetailPokemonInnerPokemon,
    _isHidden: Boolean,
    _slot: Integer
)
object PokemonDetailAbilitiesInner {
    def toStringBody(var_ability: Object, var_isHidden: Object, var_slot: Object) =
        s"""
        | {
        | "ability":$var_ability,"isHidden":$var_isHidden,"slot":$var_slot
        | }
        """.stripMargin
}
