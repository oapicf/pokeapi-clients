
package org.openapitools.client.model


case class PokemonCries (
    /* The latest depiction of this Pokémon's cry. */
    _latest: String,
    /* The legacy depiction of this Pokémon's cry. */
    _legacy: String
)
object PokemonCries {
    def toStringBody(var_latest: Object, var_legacy: Object) =
        s"""
        | {
        | "latest":$var_latest,"legacy":$var_legacy
        | }
        """.stripMargin
}
