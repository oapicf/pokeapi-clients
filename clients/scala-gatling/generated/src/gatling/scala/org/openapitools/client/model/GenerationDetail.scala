
package org.openapitools.client.model


case class GenerationDetail (
    _id: Integer,
    _name: String,
    _abilities: List[AbilitySummary],
    _mainRegion: RegionSummary,
    _moves: List[MoveSummary],
    _names: List[GenerationName],
    _pokemonSpecies: List[PokemonSpeciesSummary],
    _types: List[TypeSummary],
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
