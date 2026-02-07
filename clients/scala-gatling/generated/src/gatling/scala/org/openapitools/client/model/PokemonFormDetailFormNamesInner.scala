
package org.openapitools.client.model


case class PokemonFormDetailFormNamesInner (
    _language: AbilityDetailPokemonInnerPokemon,
    _name: String
)
object PokemonFormDetailFormNamesInner {
    def toStringBody(var_language: Object, var_name: Object) =
        s"""
        | {
        | "language":$var_language,"name":$var_name
        | }
        """.stripMargin
}
