package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param name  for example: ''null''
 * @param names  for example: ''null''
 * @param pokemonEncounters  for example: ''null''
*/
final case class PalParkAreaDetail (
  id: Int,
  name: String,
  names: Seq[PalParkAreaName],
  pokemonEncounters: Seq[PalParkAreaDetailPokemonEncountersInner]
)

