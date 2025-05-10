package api

import play.api.libs.json._

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:55:15.341659946Z[Etc/UTC]", comments = "Generator version: 7.12.0")
trait LocationApi {
  /**
    */
  def locationList(limit: Option[Int], offset: Option[Int]): String

  /**
    */
  def locationRead(id: Int): String
}
