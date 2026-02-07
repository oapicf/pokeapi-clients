
package org.openapitools.client.model


case class PokemonDetailPastTypesInner (
    _generation: AbilityDetailPokemonInnerPokemon,
    _types: List[PokemonDetailTypesInner]
)
object PokemonDetailPastTypesInner {
    def toStringBody(var_generation: Object, var_types: Object) =
        s"""
        | {
        | "generation":$var_generation,"types":$var_types
        | }
        """.stripMargin
}
