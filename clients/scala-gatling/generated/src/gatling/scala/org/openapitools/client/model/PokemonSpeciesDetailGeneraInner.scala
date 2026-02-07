
package org.openapitools.client.model


case class PokemonSpeciesDetailGeneraInner (
    _genus: String,
    _language: AbilityDetailPokemonInnerPokemon
)
object PokemonSpeciesDetailGeneraInner {
    def toStringBody(var_genus: Object, var_language: Object) =
        s"""
        | {
        | "genus":$var_genus,"language":$var_language
        | }
        """.stripMargin
}
