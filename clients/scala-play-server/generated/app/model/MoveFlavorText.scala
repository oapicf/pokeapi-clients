package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MoveFlavorText.
  * @param flavorText The localized flavor text for an api resource in a specific language.
  * @param language The language this name is in.
  * @param versionGroup The version group that uses this flavor text.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class MoveFlavorText(
  flavorText: String,
  language: LanguageSummary,
  versionGroup: VersionGroupSummary
)

object MoveFlavorText {
  implicit lazy val moveFlavorTextJsonFormat: Format[MoveFlavorText] = Json.format[MoveFlavorText]
}

