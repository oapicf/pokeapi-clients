package api

import play.api.libs.json._

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-25T00:39:24.943010519Z[Etc/UTC]", comments = "Generator version: 7.18.0")
trait MoveDamageClassApi {
  /**
    */
  def moveDamageClassList(limit: Option[Int], offset: Option[Int]): String

  /**
    */
  def moveDamageClassRead(id: Int): String
}
