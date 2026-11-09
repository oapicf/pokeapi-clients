
package org.openapitools.client.model


case class EvolutionTriggerDetail (
    /* The identifier for this resource. */
    _id: Integer,
    /* The name for this resource. */
    _name: String,
    /* The name of this resource listed in different languages. */
    _names: List[EvolutionTriggerName],
    /* A list of pokemon species that result from this evolution trigger. */
    _pokemonSpecies: List[PokemonSpeciesSummary]
)
object EvolutionTriggerDetail {
    def toStringBody(var_id: Object, var_name: Object, var_names: Object, var_pokemonSpecies: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"names":$var_names,"pokemonSpecies":$var_pokemonSpecies
        | }
        """.stripMargin
}
