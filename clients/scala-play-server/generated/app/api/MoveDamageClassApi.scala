package api

import play.api.libs.json._

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-11-19T09:53:38.763724Z[Etc/UTC]")
trait MoveDamageClassApi {
  /**
    */
  def moveDamageClassList(limit: Option[Int], offset: Option[Int]): String

  /**
    */
  def moveDamageClassRead(id: Int): String
}
