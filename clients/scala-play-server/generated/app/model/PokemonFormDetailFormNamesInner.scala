package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonFormDetail_form_names_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-25T05:53:17.467323765Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PokemonFormDetailFormNamesInner(
  language: AbilityDetailPokemonInnerPokemon,
  name: String
)

object PokemonFormDetailFormNamesInner {
  implicit lazy val pokemonFormDetailFormNamesInnerJsonFormat: Format[PokemonFormDetailFormNamesInner] = Json.format[PokemonFormDetailFormNamesInner]
}

