package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonFormType.
  * @param slot The order the Pokémon's types are listed in.
  * @param `type` The type the referenced Form has.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PokemonFormType(
  slot: Int,
  `type`: TypeSummary
)

object PokemonFormType {
  implicit lazy val pokemonFormTypeJsonFormat: Format[PokemonFormType] = Json.format[PokemonFormType]
}

