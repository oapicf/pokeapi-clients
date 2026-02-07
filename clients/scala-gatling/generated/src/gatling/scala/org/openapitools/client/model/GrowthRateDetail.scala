
package org.openapitools.client.model


case class GrowthRateDetail (
    _id: Integer,
    _name: String,
    _formula: String,
    _descriptions: List[GrowthRateDescription],
    _levels: List[Experience],
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
