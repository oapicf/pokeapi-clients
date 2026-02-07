package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonStat.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PokemonStat(
  baseStat: Int,
  effort: Int,
  stat: StatSummary
)

object PokemonStat {
  implicit lazy val pokemonStatJsonFormat: Format[PokemonStat] = Json.format[PokemonStat]
}

