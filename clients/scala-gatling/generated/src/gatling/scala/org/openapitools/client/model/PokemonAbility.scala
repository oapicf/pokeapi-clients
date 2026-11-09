
package org.openapitools.client.model


case class PokemonAbility (
    /* Whether or not this is a hidden ability. */
    _isHidden: Option[Boolean],
    /* The slot this ability occupies in this Pokémon species. */
    _slot: Integer,
    /* The ability the Pokémon may have. */
    _ability: AbilitySummary
)
object PokemonAbility {
    def toStringBody(var_isHidden: Object, var_slot: Object, var_ability: Object) =
        s"""
        | {
        | "isHidden":$var_isHidden,"slot":$var_slot,"ability":$var_ability
        | }
        """.stripMargin
}
