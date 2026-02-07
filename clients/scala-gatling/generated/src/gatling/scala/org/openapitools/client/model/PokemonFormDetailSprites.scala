
package org.openapitools.client.model

import java.net.URI
import java.util.HashMap

case class PokemonFormDetailSprites (
    _default: Option[URI]
)
object PokemonFormDetailSprites {
    def toStringBody(var_default: Object) =
        s"""
        | {
        | "default":$var_default
        | }
        """.stripMargin
}
