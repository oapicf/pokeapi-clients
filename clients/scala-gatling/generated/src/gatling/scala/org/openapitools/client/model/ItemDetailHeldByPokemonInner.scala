
package org.openapitools.client.model


case class ItemDetailHeldByPokemonInner (
    _pokemon: AbilityDetailPokemonInnerPokemon,
    _versionDetails: List[ItemDetailHeldByPokemonInnerVersionDetailsInner]
)
object ItemDetailHeldByPokemonInner {
    def toStringBody(var_pokemon: Object, var_versionDetails: Object) =
        s"""
        | {
        | "pokemon":$var_pokemon,"versionDetails":$var_versionDetails
        | }
        """.stripMargin
}
