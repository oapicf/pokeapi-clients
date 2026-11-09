package org.openapitools.server.model


/**
 * @param dreamWorld Pokémon Dream World artwork URLs. for example: ''null''
 * @param home Pokémon HOME sprite URLs. for example: ''null''
 * @param showdown Pokémon Showdown sprite URLs. for example: ''null''
 * @param officialArtwork Official Pokémon artwork URLs, including shiny artwork and version-specific variants. for example: ''null''
*/
final case class PokemonSpritesOther (
  dreamWorld: Option[PokemonSpritesOtherDreamWorld] = None,
  home: Option[PokemonSpritesOtherHome] = None,
  showdown: Option[PokemonSpritesOtherShowdown] = None,
  officialArtwork: Option[PokemonSpritesOtherOfficialArtwork] = None
)

