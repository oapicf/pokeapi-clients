package org.openapitools.server.model


/**
 * @param frontDefault The URL of the default Pokémon Showdown front image, or null if unavailable. for example: ''null''
 * @param frontFemale The URL of the female Pokémon Showdown front image, or null if unavailable. for example: ''null''
 * @param frontShiny The URL of the shiny Pokémon Showdown front image, or null if unavailable. for example: ''null''
 * @param frontShinyFemale The URL of the shiny female Pokémon Showdown front image, or null if unavailable. for example: ''null''
 * @param backDefault The URL of the default Pokémon Showdown back image, or null if unavailable. for example: ''null''
 * @param backFemale The URL of the female Pokémon Showdown back image, or null if unavailable. for example: ''null''
 * @param backShiny The URL of the shiny Pokémon Showdown back image, or null if unavailable. for example: ''null''
 * @param backShinyFemale The URL of the shiny female Pokémon Showdown back image, or null if unavailable. for example: ''null''
*/
final case class PokemonSpritesOtherShowdown (
  frontDefault: String,
  frontFemale: String,
  frontShiny: String,
  frontShinyFemale: String,
  backDefault: String,
  backFemale: String,
  backShiny: String,
  backShinyFemale: String
)

