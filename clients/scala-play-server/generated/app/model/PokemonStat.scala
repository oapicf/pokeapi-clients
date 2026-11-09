package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonStat.
  * @param baseStat The base value of the stat.
  * @param effort The effort points (EV) the Pokémon has in the stat.
  * @param stat The stat the Pokémon has.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PokemonStat(
  baseStat: Int,
  effort: Int,
  stat: StatSummary
)

object PokemonStat {
  implicit lazy val pokemonStatJsonFormat: Format[PokemonStat] = Json.format[PokemonStat]
}

