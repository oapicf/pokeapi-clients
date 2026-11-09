package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonPastType.
  * @param generation The last generation in which the referenced pokémon had the listed types.
  * @param types The types the referenced pokémon had up to and including the listed generation.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PokemonPastType(
  generation: GenerationSummary,
  types: List[PokemonType]
)

object PokemonPastType {
  implicit lazy val pokemonPastTypeJsonFormat: Format[PokemonPastType] = Json.format[PokemonPastType]
}

