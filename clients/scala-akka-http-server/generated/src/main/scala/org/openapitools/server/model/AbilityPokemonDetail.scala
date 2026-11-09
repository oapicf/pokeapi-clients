package org.openapitools.server.model


/**
 * @param isHidden Whether or not this a hidden ability for the referenced Pokémon. for example: ''null''
 * @param slot Pokémon have 3 ability 'slots' which hold references to possible abilities they could have. This is the slot of this ability for the referenced pokemon. for example: ''null''
 * @param pokemon The Pokémon this ability could belong to. for example: ''null''
*/
final case class AbilityPokemonDetail (
  isHidden: Option[Boolean] = None,
  slot: Int,
  pokemon: PokemonSummary
)

