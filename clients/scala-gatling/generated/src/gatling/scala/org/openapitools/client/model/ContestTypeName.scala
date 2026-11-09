
package org.openapitools.client.model


case class ContestTypeName (
    /* The name for this contest. */
    _name: String,
    /* The color associated with this contest's name. */
    _color: String,
    /* The language that this name is in. */
    _language: LanguageSummary
)
object ContestTypeName {
    def toStringBody(var_name: Object, var_color: Object, var_language: Object) =
        s"""
        | {
        | "name":$var_name,"color":$var_color,"language":$var_language
        | }
        """.stripMargin
}
