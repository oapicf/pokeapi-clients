package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonSpritesOther.
  * @param dreamWorld Pokémon Dream World artwork URLs.
  * @param home Pokémon HOME sprite URLs.
  * @param showdown Pokémon Showdown sprite URLs.
  * @param officialArtwork Official Pokémon artwork URLs, including shiny artwork and version-specific variants.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PokemonSpritesOther(
  dreamWorld: Option[PokemonSpritesOtherDreamWorld],
  home: Option[PokemonSpritesOtherHome],
  showdown: Option[PokemonSpritesOtherShowdown],
  officialArtwork: Option[PokemonSpritesOtherOfficialArtwork]
)

object PokemonSpritesOther {
  implicit lazy val pokemonSpritesOtherJsonFormat: Format[PokemonSpritesOther] = Json.format[PokemonSpritesOther]
}

