package org.openapitools.server.model


/**
 * @param frontDefault The URL of the default Pokémon HOME front image, or null if unavailable. for example: ''null''
 * @param frontFemale The URL of the female Pokémon HOME front image, or null if unavailable. for example: ''null''
 * @param frontShiny The URL of the shiny Pokémon HOME front image, or null if unavailable. for example: ''null''
 * @param frontShinyFemale The URL of the shiny female Pokémon HOME front image, or null if unavailable. for example: ''null''
*/
final case class PokemonSpritesOtherHome (
  frontDefault: String,
  frontFemale: String,
  frontShiny: String,
  frontShinyFemale: String
)

