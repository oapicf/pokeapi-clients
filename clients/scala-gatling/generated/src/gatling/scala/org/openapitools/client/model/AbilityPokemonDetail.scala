
package org.openapitools.client.model


case class AbilityPokemonDetail (
    /* Whether or not this a hidden ability for the referenced Pokémon. */
    _isHidden: Option[Boolean],
    /* Pokémon have 3 ability 'slots' which hold references to possible abilities they could have. This is the slot of this ability for the referenced pokemon. */
    _slot: Integer,
    /* The Pokémon this ability could belong to. */
    _pokemon: PokemonSummary
)
object AbilityPokemonDetail {
    def toStringBody(var_isHidden: Object, var_slot: Object, var_pokemon: Object) =
        s"""
        | {
        | "isHidden":$var_isHidden,"slot":$var_slot,"pokemon":$var_pokemon
        | }
        """.stripMargin
}
