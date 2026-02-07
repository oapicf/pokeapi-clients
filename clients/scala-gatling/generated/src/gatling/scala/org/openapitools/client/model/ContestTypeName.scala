
package org.openapitools.client.model


case class ContestTypeName (
    _name: String,
    _color: String,
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
