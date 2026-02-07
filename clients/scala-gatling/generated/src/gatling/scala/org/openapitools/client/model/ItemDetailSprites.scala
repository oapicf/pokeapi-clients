
package org.openapitools.client.model

import java.net.URI

case class ItemDetailSprites (
    _default: URI
)
object ItemDetailSprites {
    def toStringBody(var_default: Object) =
        s"""
        | {
        | "default":$var_default
        | }
        """.stripMargin
}
