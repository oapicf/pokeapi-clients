package org.openapitools.server.model


/**
 * @param baseScore The base score given to the player when the referenced Pokémon is caught during a pal park run. for example: ''null''
 * @param rate The base rate for encountering the referenced Pokémon in this pal park area. for example: ''null''
 * @param area The pal park area where this encounter happens. for example: ''null''
*/
final case class PokemonSpeciesPalParkEncounter (
  baseScore: Option[Int] = None,
  rate: Int,
  area: PalParkAreaSummary
)

