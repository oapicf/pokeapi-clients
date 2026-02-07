
package org.openapitools.client.model


case class PokemonDetailPastAbilitiesInner (
    _abilities: List[PokemonDetailAbilitiesInner],
    _generation: AbilityDetailPokemonInnerPokemon
)
object PokemonDetailPastAbilitiesInner {
    def toStringBody(var_abilities: Object, var_generation: Object) =
        s"""
        | {
        | "abilities":$var_abilities,"generation":$var_generation
        | }
        """.stripMargin
}
