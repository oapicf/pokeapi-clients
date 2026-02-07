
package org.openapitools.client.model

import java.net.URI

case class PokemonDetailCries (
    _latest: URI,
    _legacy: URI
)
object PokemonDetailCries {
    def toStringBody(var_latest: Object, var_legacy: Object) =
        s"""
        | {
        | "latest":$var_latest,"legacy":$var_legacy
        | }
        """.stripMargin
}
