
package org.openapitools.client.model


case class LanguageDetail (
    /* The identifier for this resource. */
    _id: Integer,
    /* The name for this resource. */
    _name: String,
    /* Whether or not the games are published in this language. */
    _official: Option[Boolean],
    /* The two-letter ISO 639-1 language code. Multiple PokéAPI language records may share this code. */
    _iso639: String,
    /* The two-letter ISO 3166-1 alpha-2 code of the country or region associated with this language record. Multiple PokéAPI language records may share this code. */
    _iso3166: String,
    /* The name of this resource listed in different languages. */
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
