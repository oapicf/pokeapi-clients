package org.openapitools.server.model


/**
 * @param minPerfectIvs The minimum number of perfect IVs, or null if unspecified. for example: ''null''
 * @param alwaysShiny Whether the encountered Pokémon is always shiny. for example: ''null''
 * @param neverShiny Whether the encountered Pokémon can never be shiny. for example: ''null''
 * @param isAlpha Whether the encountered Pokémon is an alpha Pokémon. for example: ''null''
*/
final case class EncounterPokemonDetail (
  minPerfectIvs: Option[Int] = None,
  alwaysShiny: Option[Boolean] = None,
  neverShiny: Option[Boolean] = None,
  isAlpha: Option[Boolean] = None
)

