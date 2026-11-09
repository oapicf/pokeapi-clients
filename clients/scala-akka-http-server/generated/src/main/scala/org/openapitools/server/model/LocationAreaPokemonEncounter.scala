package org.openapitools.server.model


/**
 * @param pokemon The Pokémon being encountered. for example: ''null''
 * @param versionDetails A list of versions and encounters with Pokémon that might happen in the referenced location area. for example: ''null''
*/
final case class LocationAreaPokemonEncounter (
  pokemon: PokemonSummary,
  versionDetails: Seq[LocationAreaPokemonEncounterVersion]
)

