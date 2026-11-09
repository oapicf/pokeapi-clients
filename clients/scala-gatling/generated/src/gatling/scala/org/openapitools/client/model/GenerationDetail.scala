
package org.openapitools.client.model


case class GenerationDetail (
    /* The identifier for this resource. */
    _id: Integer,
    /* The name for this resource. */
    _name: String,
    /* A list of abilities that were introduced in this generation. */
    _abilities: List[AbilitySummary],
    /* The main region travelled in this generation. */
    _mainRegion: RegionSummary,
    /* A list of moves that were introduced in this generation. */
    _moves: List[MoveSummary],
    /* The name of this resource listed in different languages. */
    _names: List[GenerationName],
    /* A list of Pokémon species that were introduced in this generation. */
    _pokemonSpecies: List[PokemonSpeciesSummary],
    /* A list of types that were introduced in this generation. */
    _types: List[TypeSummary],
    /* A list of version groups that were introduced in this generation. */
    _versionGroups: List[VersionGroupSummary]
)
object GenerationDetail {
    def toStringBody(var_id: Object, var_name: Object, var_abilities: Object, var_mainRegion: Object, var_moves: Object, var_names: Object, var_pokemonSpecies: Object, var_types: Object, var_versionGroups: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"abilities":$var_abilities,"mainRegion":$var_mainRegion,"moves":$var_moves,"names":$var_names,"pokemonSpecies":$var_pokemonSpecies,"types":$var_types,"versionGroups":$var_versionGroups
        | }
        """.stripMargin
}
