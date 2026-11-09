
package org.openapitools.client.model


case class PokemonPastType (
    /* The last generation in which the referenced pokémon had the listed types. */
    _generation: GenerationSummary,
    /* The types the referenced pokémon had up to and including the listed generation. */
    _types: List[PokemonType]
)
object PokemonPastType {
    def toStringBody(var_generation: Object, var_types: Object) =
        s"""
        | {
        | "generation":$var_generation,"types":$var_types
        | }
        """.stripMargin
}
