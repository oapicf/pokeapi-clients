
package org.openapitools.client.model


case class GenderDetail (
    /* The identifier for this resource. */
    _id: Integer,
    /* The name for this resource. */
    _name: String,
    /* A list of Pokémon species that can be this gender and how likely it is that they will be. */
    _pokemonSpeciesDetails: List[GenderPokemonSpecies],
    /* A list of Pokémon species that required this gender in order for a Pokémon to evolve into them. */
    _requiredForEvolution: List[PokemonSpeciesSummary]
)
object GenderDetail {
    def toStringBody(var_id: Object, var_name: Object, var_pokemonSpeciesDetails: Object, var_requiredForEvolution: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"pokemonSpeciesDetails":$var_pokemonSpeciesDetails,"requiredForEvolution":$var_requiredForEvolution
        | }
        """.stripMargin
}
