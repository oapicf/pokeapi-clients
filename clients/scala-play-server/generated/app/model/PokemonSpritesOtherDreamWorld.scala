package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonSpritesOtherDreamWorld.
  * @param frontDefault The URL of the default Pokémon Dream World front image, or null if unavailable.
  * @param frontFemale The URL of the female Pokémon Dream World front image, or null if unavailable.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PokemonSpritesOtherDreamWorld(
  frontDefault: String,
  frontFemale: String
)

object PokemonSpritesOtherDreamWorld {
  implicit lazy val pokemonSpritesOtherDreamWorldJsonFormat: Format[PokemonSpritesOtherDreamWorld] = Json.format[PokemonSpritesOtherDreamWorld]
}

