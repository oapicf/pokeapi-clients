
package org.openapitools.client.model


case class TypeGameSprite (
    /* The URL of the icon displaying the type name in this game, or null if unavailable. */
    _nameIcon: Option[String],
    /* The URL of the type symbol icon in this game, or null if unavailable. */
    _symbolIcon: Option[String]
)
object TypeGameSprite {
    def toStringBody(var_nameIcon: Object, var_symbolIcon: Object) =
        s"""
        | {
        | "nameIcon":$var_nameIcon,"symbolIcon":$var_symbolIcon
        | }
        """.stripMargin
}
