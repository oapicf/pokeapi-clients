
package org.openapitools.client.model


case class EggGroupDetail (
    /* The identifier for this resource. */
    _id: Integer,
    /* The name for this resource. */
    _name: String,
    /* The name of this resource listed in different languages. */
    _names: List[EggGroupName],
    /* A list of all Pokémon species that are members of this egg group. */
    _pokemonSpecies: List[PokemonSpeciesSummary]
)
object EggGroupDetail {
    def toStringBody(var_id: Object, var_name: Object, var_names: Object, var_pokemonSpecies: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"names":$var_names,"pokemonSpecies":$var_pokemonSpecies
        | }
        """.stripMargin
}
