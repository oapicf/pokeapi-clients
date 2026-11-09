
package org.openapitools.client.model


case class EvolutionChainLink (
    /* Whether or not this link is for a baby Pokémon. This would only ever be true on the base link. */
    _isBaby: Boolean,
    /* The Pokémon species at this point in the evolution chain. */
    _species: PokemonSpeciesSummary,
    /* All details regarding the specific details of the referenced Pokémon species evolution. */
    _evolutionDetails: List[PokemonEvolution],
    /* A List of chain objects. */
    _evolvesTo: List[EvolutionChainLink]
)
object EvolutionChainLink {
    def toStringBody(var_isBaby: Object, var_species: Object, var_evolutionDetails: Object, var_evolvesTo: Object) =
        s"""
        | {
        | "isBaby":$var_isBaby,"species":$var_species,"evolutionDetails":$var_evolutionDetails,"evolvesTo":$var_evolvesTo
        | }
        """.stripMargin
}
