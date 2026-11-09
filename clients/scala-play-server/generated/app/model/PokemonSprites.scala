package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonSprites.
  * @param frontDefault The default depiction of this Pokémon from the front in battle.
  * @param frontShiny The shiny depiction of this Pokémon from the front in battle.
  * @param frontFemale The female depiction of this Pokémon from the front in battle.
  * @param frontShinyFemale The shiny female depiction of this Pokémon from the front in battle.
  * @param backDefault The default depiction of this Pokémon from the back in battle.
  * @param backShiny The shiny depiction of this Pokémon from the back in battle.
  * @param backFemale The female depiction of this Pokémon from the back in battle.
  * @param backShinyFemale The shiny female depiction of this Pokémon from the back in battle.
  * @param other Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource.
  * @param versions Sprites grouped by generation and game. Available keys vary by resource.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PokemonSprites(
  frontDefault: String,
  frontShiny: String,
  frontFemale: String,
  frontShinyFemale: String,
  backDefault: String,
  backShiny: String,
  backFemale: String,
  backShinyFemale: String,
  other: Option[PokemonSpritesOther],
  versions: Option[Map[String, Map[String, OasAnyTypeNotMapped]]],
)

object PokemonSprites {
  implicit lazy val pokemonSpritesJsonFormat: Format[PokemonSprites] = Json.format[PokemonSprites]
}

