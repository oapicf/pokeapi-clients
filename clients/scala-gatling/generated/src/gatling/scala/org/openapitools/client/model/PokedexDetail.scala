
package org.openapitools.client.model


case class PokedexDetail (
    /* The identifier for this resource. */
    _id: Integer,
    /* The name for this resource. */
    _name: String,
    /* Whether or not this Pokédex originated in the main series of the video games. */
    _isMainSeries: Option[Boolean],
    /* The description of this resource listed in different languages. */
    _descriptions: List[PokedexDescription],
    /* The name of this resource listed in different languages. */
    _names: List[PokedexName],
    /* A list of Pokémon catalogued in this Pokédex and their indexes. */
    _pokemonEntries: List[PokemonDexNumber],
    /* The region this Pokédex catalogues Pokémon for. */
    _region: RegionSummary,
    /* A list of version groups this Pokédex is relevant to. */
    _versionGroups: List[VersionGroupSummary]
)
object PokedexDetail {
    def toStringBody(var_id: Object, var_name: Object, var_isMainSeries: Object, var_descriptions: Object, var_names: Object, var_pokemonEntries: Object, var_region: Object, var_versionGroups: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"isMainSeries":$var_isMainSeries,"descriptions":$var_descriptions,"names":$var_names,"pokemonEntries":$var_pokemonEntries,"region":$var_region,"versionGroups":$var_versionGroups
        | }
        """.stripMargin
}
