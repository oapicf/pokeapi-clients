
package org.openapitools.client.model


case class LanguageDetail (
    _id: Integer,
    _name: String,
    _official: Option[Boolean],
    _iso639: String,
    _iso3166: String,
    _names: List[LanguageName]
)
object LanguageDetail {
    def toStringBody(var_id: Object, var_name: Object, var_official: Object, var_iso639: Object, var_iso3166: Object, var_names: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"official":$var_official,"iso639":$var_iso639,"iso3166":$var_iso3166,"names":$var_names
        | }
        """.stripMargin
}
