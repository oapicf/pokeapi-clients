package api

import play.api.libs.json._

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-01-14T06:35:11.305578675Z[Etc/UTC]")
trait MoveDamageClassApi {
  /**
    */
  def moveDamageClassList(limit: Option[Int], offset: Option[Int]): String

  /**
    */
  def moveDamageClassRead(id: Int): String
}
