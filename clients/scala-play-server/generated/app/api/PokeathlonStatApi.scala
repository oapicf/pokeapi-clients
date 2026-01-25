package api

import play.api.libs.json._

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-25T00:39:24.943010519Z[Etc/UTC]", comments = "Generator version: 7.18.0")
trait PokeathlonStatApi {
  /**
    */
  def pokeathlonStatList(limit: Option[Int], offset: Option[Int]): String

  /**
    */
  def pokeathlonStatRead(id: Int): String
}
