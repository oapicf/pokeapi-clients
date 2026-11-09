package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Experience.
  * @param level The level gained.
  * @param experience The amount of experience required to reach the referenced level.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class Experience(
  level: Int,
  experience: Int
)

object Experience {
  implicit lazy val experienceJsonFormat: Format[Experience] = Json.format[Experience]
}

