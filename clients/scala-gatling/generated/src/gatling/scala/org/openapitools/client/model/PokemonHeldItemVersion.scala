
package org.openapitools.client.model


case class PokemonHeldItemVersion (
    /* How often the item is held. */
    _rarity: Integer,
    /* The version in which the item is held. */
    _version: VersionSummary
)
object PokemonHeldItemVersion {
    def toStringBody(var_rarity: Object, var_version: Object) =
        s"""
        | {
        | "rarity":$var_rarity,"version":$var_version
        | }
        """.stripMargin
}
