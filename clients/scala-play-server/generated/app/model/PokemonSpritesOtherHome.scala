package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonSpritesOtherHome.
  * @param frontDefault The URL of the default Pokémon HOME front image, or null if unavailable.
  * @param frontFemale The URL of the female Pokémon HOME front image, or null if unavailable.
  * @param frontShiny The URL of the shiny Pokémon HOME front image, or null if unavailable.
  * @param frontShinyFemale The URL of the shiny female Pokémon HOME front image, or null if unavailable.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PokemonSpritesOtherHome(
  frontDefault: String,
  frontFemale: String,
  frontShiny: String,
  frontShinyFemale: String
)

object PokemonSpritesOtherHome {
  implicit lazy val pokemonSpritesOtherHomeJsonFormat: Format[PokemonSpritesOtherHome] = Json.format[PokemonSpritesOtherHome]
}

