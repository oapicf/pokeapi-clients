
package org.openapitools.client.model


case class PokemonShapeDetail (
    _id: Integer,
    _name: String,
    _awesomeNames: List[PokemonShapeDetailAwesomeNamesInner],
    _names: List[PokemonShapeDetailNamesInner],
    _pokemonSpecies: List[PokemonSpeciesSummary]
)
object PokemonShapeDetail {
    def toStringBody(var_id: Object, var_name: Object, var_awesomeNames: Object, var_names: Object, var_pokemonSpecies: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"awesomeNames":$var_awesomeNames,"names":$var_names,"pokemonSpecies":$var_pokemonSpecies
        | }
        """.stripMargin
}
