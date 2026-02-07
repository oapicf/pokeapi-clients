
package org.openapitools.client.model


case class PokemonColorDetail (
    _id: Integer,
    _name: String,
    _names: List[PokemonColorName],
    _pokemonSpecies: List[PokemonSpeciesSummary]
)
object PokemonColorDetail {
    def toStringBody(var_id: Object, var_name: Object, var_names: Object, var_pokemonSpecies: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"names":$var_names,"pokemonSpecies":$var_pokemonSpecies
        | }
        """.stripMargin
}
