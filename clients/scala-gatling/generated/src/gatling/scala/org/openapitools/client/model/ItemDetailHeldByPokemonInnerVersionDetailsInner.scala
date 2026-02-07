
package org.openapitools.client.model


case class ItemDetailHeldByPokemonInnerVersionDetailsInner (
    _rarity: Integer,
    _version: AbilityDetailPokemonInnerPokemon
)
object ItemDetailHeldByPokemonInnerVersionDetailsInner {
    def toStringBody(var_rarity: Object, var_version: Object) =
        s"""
        | {
        | "rarity":$var_rarity,"version":$var_version
        | }
        """.stripMargin
}
