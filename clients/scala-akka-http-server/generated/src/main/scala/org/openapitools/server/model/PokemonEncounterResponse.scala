package org.openapitools.server.model


/**
 * @param locationArea The location area the referenced Pokémon can be encountered in. for example: ''null''
 * @param versionDetails A list of versions and encounters with the referenced Pokémon that might happen. for example: ''null''
*/
final case class PokemonEncounterResponse (
  locationArea: LocationAreaSummary,
  versionDetails: Seq[PokemonEncounterVersionDetailResponse]
)

