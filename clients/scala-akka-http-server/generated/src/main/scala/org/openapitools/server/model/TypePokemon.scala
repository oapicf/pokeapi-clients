package org.openapitools.server.model


/**
 * @param slot The order the Pokémon's types are listed in. for example: ''null''
 * @param pokemon The Pokémon that has the referenced type. for example: ''null''
*/
final case class TypePokemon (
  slot: Int,
  pokemon: PokemonSummary
)

