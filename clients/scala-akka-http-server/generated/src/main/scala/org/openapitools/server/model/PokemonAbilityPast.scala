package org.openapitools.server.model


/**
 * @param isHidden Whether or not this is a hidden ability. for example: ''null''
 * @param slot The slot this ability occupies in this Pokémon species. for example: ''null''
 * @param ability The ability the Pokémon may have. for example: ''null''
*/
final case class PokemonAbilityPast (
  isHidden: Option[Boolean] = None,
  slot: Int,
  ability: AbilitySummary
)

