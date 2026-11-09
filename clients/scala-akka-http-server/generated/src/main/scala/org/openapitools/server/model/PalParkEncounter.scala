package org.openapitools.server.model


/**
 * @param baseScore The base score given to the player when this Pokémon is caught during a pal park run. for example: ''null''
 * @param rate The base rate for encountering this Pokémon in this pal park area. for example: ''null''
 * @param pokemonSpecies The Pokémon species being encountered. for example: ''null''
*/
final case class PalParkEncounter (
  baseScore: Option[Int] = None,
  rate: Int,
  pokemonSpecies: PokemonSpeciesSummary
)

