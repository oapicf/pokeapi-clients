
package org.openapitools.client.model


case class EvolutionTriggerDetail (
    _id: Integer,
    _name: String,
    _names: List[EvolutionTriggerName],
    _pokemonSpecies: List[AbilityDetailPokemonInnerPokemon]
)
object EvolutionTriggerDetail {
    def toStringBody(var_id: Object, var_name: Object, var_names: Object, var_pokemonSpecies: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"names":$var_names,"pokemonSpecies":$var_pokemonSpecies
        | }
        """.stripMargin
}
