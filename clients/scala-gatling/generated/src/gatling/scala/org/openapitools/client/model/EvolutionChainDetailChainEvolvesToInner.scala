
package org.openapitools.client.model


case class EvolutionChainDetailChainEvolvesToInner (
    _evolutionDetails: List[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner],
    _isBaby: Boolean,
    _species: AbilityDetailPokemonInnerPokemon
)
object EvolutionChainDetailChainEvolvesToInner {
    def toStringBody(var_evolutionDetails: Object, var_isBaby: Object, var_species: Object) =
        s"""
        | {
        | "evolutionDetails":$var_evolutionDetails,"isBaby":$var_isBaby,"species":$var_species
        | }
        """.stripMargin
}
