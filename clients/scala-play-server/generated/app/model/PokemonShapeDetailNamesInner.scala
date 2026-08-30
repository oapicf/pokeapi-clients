package model

import play.api.libs.json._
import java.net.URI

/**
  * Represents the Swagger definition for PokemonShapeDetail_names_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class PokemonShapeDetailNamesInner(
  url: URI,
  name: String
)

object PokemonShapeDetailNamesInner {
  implicit lazy val pokemonShapeDetailNamesInnerJsonFormat: Format[PokemonShapeDetailNamesInner] = Json.format[PokemonShapeDetailNamesInner]
}

