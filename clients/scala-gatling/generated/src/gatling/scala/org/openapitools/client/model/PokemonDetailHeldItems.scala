
package org.openapitools.client.model


case class PokemonDetailHeldItems (
    _item: AbilityDetailPokemonInnerPokemon,
    _versionDetails: List[ItemDetailHeldByPokemonInnerVersionDetailsInner]
)
object PokemonDetailHeldItems {
    def toStringBody(var_item: Object, var_versionDetails: Object) =
        s"""
        | {
        | "item":$var_item,"versionDetails":$var_versionDetails
        | }
        """.stripMargin
}
