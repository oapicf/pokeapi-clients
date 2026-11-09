package model

import play.api.libs.json._
import java.net.URI

/**
  * Represents the Swagger definition for PokemonEvolution_known_move.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PokemonEvolutionKnownMove(
  name: String,
  url: URI
)

object PokemonEvolutionKnownMove {
  implicit lazy val pokemonEvolutionKnownMoveJsonFormat: Format[PokemonEvolutionKnownMove] = Json.format[PokemonEvolutionKnownMove]
}

