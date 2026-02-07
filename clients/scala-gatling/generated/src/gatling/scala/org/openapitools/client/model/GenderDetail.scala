
package org.openapitools.client.model


case class GenderDetail (
    _id: Integer,
    _name: String,
    _pokemonSpeciesDetails: List[GenderDetailPokemonSpeciesDetailsInner],
    _requiredForEvolution: List[AbilityDetailPokemonInnerPokemon]
)
object GenderDetail {
    def toStringBody(var_id: Object, var_name: Object, var_pokemonSpeciesDetails: Object, var_requiredForEvolution: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"pokemonSpeciesDetails":$var_pokemonSpeciesDetails,"requiredForEvolution":$var_requiredForEvolution
        | }
        """.stripMargin
}
