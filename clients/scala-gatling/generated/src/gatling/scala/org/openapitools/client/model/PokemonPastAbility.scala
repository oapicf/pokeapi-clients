
package org.openapitools.client.model


case class PokemonPastAbility (
    /* The abilities the referenced pokémon had up to and including the listed generation. If null, the slot was previously empty. */
    _abilities: List[PokemonAbilityPast],
    /* The last generation in which the referenced pokémon had the listed abilities. */
    _generation: GenerationSummary
)
object PokemonPastAbility {
    def toStringBody(var_abilities: Object, var_generation: Object) =
        s"""
        | {
        | "abilities":$var_abilities,"generation":$var_generation
        | }
        """.stripMargin
}
