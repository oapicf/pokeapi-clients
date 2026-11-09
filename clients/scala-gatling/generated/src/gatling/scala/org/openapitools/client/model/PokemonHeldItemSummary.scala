
package org.openapitools.client.model


case class PokemonHeldItemSummary (
    /* The item the referenced Pokémon holds. */
    _item: ItemSummary,
    /* The details of the different versions in which the item is held. */
    _versionDetails: List[PokemonHeldItemVersion]
)
object PokemonHeldItemSummary {
    def toStringBody(var_item: Object, var_versionDetails: Object) =
        s"""
        | {
        | "item":$var_item,"versionDetails":$var_versionDetails
        | }
        """.stripMargin
}
