
package org.openapitools.client.model


case class PokemonSpeciesGenus (
    /* The localized genus for the referenced Pokémon species */
    _genus: String,
    /* The language this genus is in. */
    _language: LanguageSummary
)
object PokemonSpeciesGenus {
    def toStringBody(var_genus: Object, var_language: Object) =
        s"""
        | {
        | "genus":$var_genus,"language":$var_language
        | }
        """.stripMargin
}
