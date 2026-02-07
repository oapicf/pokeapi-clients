package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MoveFlavorText.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class MoveFlavorText(
  flavorText: String,
  language: LanguageSummary,
  versionGroup: VersionGroupSummary
)

object MoveFlavorText {
  implicit lazy val moveFlavorTextJsonFormat: Format[MoveFlavorText] = Json.format[MoveFlavorText]
}

