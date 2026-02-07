package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param name  for example: ''null''
 * @param isMainSeries  for example: ''null''
 * @param descriptions  for example: ''null''
 * @param names  for example: ''null''
 * @param pokemonEntries  for example: ''null''
 * @param region  for example: ''null''
 * @param versionGroups  for example: ''null''
*/
final case class PokedexDetail (
  id: Int,
  name: String,
  isMainSeries: Option[Boolean] = None,
  descriptions: Seq[PokedexDescription],
  names: Seq[PokedexName],
  pokemonEntries: Seq[PokedexDetailPokemonEntriesInner],
  region: RegionSummary,
  versionGroups: Seq[AbilityDetailPokemonInnerPokemon]
)

