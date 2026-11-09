package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TypeName.
  * @param name The localized name for an API resource in a specific language.
  * @param language The language this name is in.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class TypeName(
  name: String,
  language: LanguageSummary
)

object TypeName {
  implicit lazy val typeNameJsonFormat: Format[TypeName] = Json.format[TypeName]
}

