package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonPastStat.
  * @param generation The last generation in which the referenced pokémon had the listed stats.
  * @param stats The stat the Pokémon had up to and including the listed generation.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PokemonPastStat(
  generation: GenerationSummary,
  stats: List[PokemonStat]
)

object PokemonPastStat {
  implicit lazy val pokemonPastStatJsonFormat: Format[PokemonPastStat] = Json.format[PokemonPastStat]
}

