
package org.openapitools.client.model


case class ItemSprites (
    /* The default depiction of this item. */
    _default: String
)
object ItemSprites {
    def toStringBody(var_default: Object) =
        s"""
        | {
        | "default":$var_default
        | }
        """.stripMargin
}
