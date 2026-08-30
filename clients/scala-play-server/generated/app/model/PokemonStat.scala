package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonStat.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class PokemonStat(
  baseStat: Int,
  effort: Int,
  stat: StatSummary
)

object PokemonStat {
  implicit lazy val pokemonStatJsonFormat: Format[PokemonStat] = Json.format[PokemonStat]
}

