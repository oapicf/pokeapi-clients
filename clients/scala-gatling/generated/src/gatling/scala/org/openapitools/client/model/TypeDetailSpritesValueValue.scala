
package org.openapitools.client.model

import java.net.URI

case class TypeDetailSpritesValueValue (
    _nameIcon: Option[URI]
)
object TypeDetailSpritesValueValue {
    def toStringBody(var_nameIcon: Object) =
        s"""
        | {
        | "nameIcon":$var_nameIcon
        | }
        """.stripMargin
}
