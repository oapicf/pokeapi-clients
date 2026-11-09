
package org.openapitools.client.model


case class GrowthRateDetail (
    /* The identifier for this resource. */
    _id: Integer,
    /* The name for this resource. */
    _name: String,
    /* The formula used to calculate the rate at which the Pokémon species gains level. */
    _formula: String,
    /* The descriptions of this characteristic listed in different languages. */
    _descriptions: List[GrowthRateDescription],
    /* A list of levels and the amount of experienced needed to atain them based on this growth rate. */
    _levels: List[Experience],
    /* A list of Pokémon species that gain levels at this growth rate. */
    _pokemonSpecies: List[PokemonSpeciesSummary]
)
object GrowthRateDetail {
    def toStringBody(var_id: Object, var_name: Object, var_formula: Object, var_descriptions: Object, var_levels: Object, var_pokemonSpecies: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"formula":$var_formula,"descriptions":$var_descriptions,"levels":$var_levels,"pokemonSpecies":$var_pokemonSpecies
        | }
        """.stripMargin
}
