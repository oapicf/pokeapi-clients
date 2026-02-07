
package org.openapitools.client.model

import java.net.URI
import java.util.HashMap

case class PokemonDetailSprites (
    _frontDefault: Option[URI]
)
object PokemonDetailSprites {
    def toStringBody(var_frontDefault: Object) =
        s"""
        | {
        | "frontDefault":$var_frontDefault
        | }
        """.stripMargin
}
