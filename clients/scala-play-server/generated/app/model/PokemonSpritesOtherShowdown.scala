package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonSpritesOtherShowdown.
  * @param frontDefault The URL of the default Pokémon Showdown front image, or null if unavailable.
  * @param frontFemale The URL of the female Pokémon Showdown front image, or null if unavailable.
  * @param frontShiny The URL of the shiny Pokémon Showdown front image, or null if unavailable.
  * @param frontShinyFemale The URL of the shiny female Pokémon Showdown front image, or null if unavailable.
  * @param backDefault The URL of the default Pokémon Showdown back image, or null if unavailable.
  * @param backFemale The URL of the female Pokémon Showdown back image, or null if unavailable.
  * @param backShiny The URL of the shiny Pokémon Showdown back image, or null if unavailable.
  * @param backShinyFemale The URL of the shiny female Pokémon Showdown back image, or null if unavailable.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PokemonSpritesOtherShowdown(
  frontDefault: String,
  frontFemale: String,
  frontShiny: String,
  frontShinyFemale: String,
  backDefault: String,
  backFemale: String,
  backShiny: String,
  backShinyFemale: String
)

object PokemonSpritesOtherShowdown {
  implicit lazy val pokemonSpritesOtherShowdownJsonFormat: Format[PokemonSpritesOtherShowdown] = Json.format[PokemonSpritesOtherShowdown]
}

