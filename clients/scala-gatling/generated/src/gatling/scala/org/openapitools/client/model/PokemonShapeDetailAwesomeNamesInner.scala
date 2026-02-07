
package org.openapitools.client.model


case class PokemonShapeDetailAwesomeNamesInner (
    _awesomeName: String,
    _language: AbilityDetailPokemonInnerPokemon
)
object PokemonShapeDetailAwesomeNamesInner {
    def toStringBody(var_awesomeName: Object, var_language: Object) =
        s"""
        | {
        | "awesomeName":$var_awesomeName,"language":$var_language
        | }
        """.stripMargin
}
