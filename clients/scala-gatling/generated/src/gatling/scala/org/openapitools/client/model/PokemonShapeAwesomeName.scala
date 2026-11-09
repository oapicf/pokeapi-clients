
package org.openapitools.client.model


case class PokemonShapeAwesomeName (
    /* The localized \"scientific\" name for an API resource in a specific language. */
    _awesomeName: String,
    /* The language this \"scientific\" name is in. */
    _language: LanguageSummary
)
object PokemonShapeAwesomeName {
    def toStringBody(var_awesomeName: Object, var_language: Object) =
        s"""
        | {
        | "awesomeName":$var_awesomeName,"language":$var_language
        | }
        """.stripMargin
}
