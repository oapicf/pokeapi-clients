
package org.openapitools.client.model


case class EvolutionChainDetailChain (
    _evolutionDetails: List[AnyType],
    _evolvesTo: List[EvolutionChainDetailChainEvolvesToInner],
    _isBaby: Boolean,
    _species: AbilityDetailPokemonInnerPokemon
)
object EvolutionChainDetailChain {
    def toStringBody(var_evolutionDetails: Object, var_evolvesTo: Object, var_isBaby: Object, var_species: Object) =
        s"""
        | {
        | "evolutionDetails":$var_evolutionDetails,"evolvesTo":$var_evolvesTo,"isBaby":$var_isBaby,"species":$var_species
        | }
        """.stripMargin
}
