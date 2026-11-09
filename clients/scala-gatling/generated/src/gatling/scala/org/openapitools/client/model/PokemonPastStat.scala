
package org.openapitools.client.model


case class PokemonPastStat (
    /* The last generation in which the referenced pokémon had the listed stats. */
    _generation: GenerationSummary,
    /* The stat the Pokémon had up to and including the listed generation. */
    _stats: List[PokemonStat]
)
object PokemonPastStat {
    def toStringBody(var_generation: Object, var_stats: Object) =
        s"""
        | {
        | "generation":$var_generation,"stats":$var_stats
        | }
        """.stripMargin
}
