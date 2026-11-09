package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonSpritesOtherOfficialArtwork.
  * @param frontDefault The URL of the default front official artwork, or null if unavailable.
  * @param frontShiny The URL of the shiny front official artwork, or null if unavailable.
  * @param versions Additional official artwork grouped by version. Available keys vary by resource.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PokemonSpritesOtherOfficialArtwork(
  frontDefault: String,
  frontShiny: String,
  versions: Option[Map[String, Map[String, OasAnyTypeNotMapped]]],
)

object PokemonSpritesOtherOfficialArtwork {
  implicit lazy val pokemonSpritesOtherOfficialArtworkJsonFormat: Format[PokemonSpritesOtherOfficialArtwork] = Json.format[PokemonSpritesOtherOfficialArtwork]
}

