package org.openapitools.server.model


/**
 * @param id The identifier for this resource. for example: ''null''
 * @param name The name for this resource. for example: ''null''
 * @param isMainSeries Whether or not this Pokédex originated in the main series of the video games. for example: ''null''
 * @param descriptions The description of this resource listed in different languages. for example: ''null''
 * @param names The name of this resource listed in different languages. for example: ''null''
 * @param pokemonEntries A list of Pokémon catalogued in this Pokédex and their indexes. for example: ''null''
 * @param region The region this Pokédex catalogues Pokémon for. for example: ''null''
 * @param versionGroups A list of version groups this Pokédex is relevant to. for example: ''null''
*/
final case class PokedexDetail (
  id: Int,
  name: String,
  isMainSeries: Option[Boolean] = None,
  descriptions: Seq[PokedexDescription],
  names: Seq[PokedexName],
  pokemonEntries: Seq[PokemonDexNumber],
  region: RegionSummary,
  versionGroups: Seq[VersionGroupSummary]
)

