
package org.openapitools.client.model


case class PokemonHeldItem (
    /* The Pokémon that holds this item. */
    _pokemon: PokemonSummary,
    /* The details for the version that this item is held in by the Pokémon. */
    _versionDetails: List[PokemonHeldItemVersion]
)
object PokemonHeldItem {
    def toStringBody(var_pokemon: Object, var_versionDetails: Object) =
        s"""
        | {
        | "pokemon":$var_pokemon,"versionDetails":$var_versionDetails
        | }
        """.stripMargin
}
