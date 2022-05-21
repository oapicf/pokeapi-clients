package api

import play.api.libs.json._

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-21T04:06:20.868089Z[Etc/UTC]")
trait NatureApi {
  /**
    */
  def natureList(limit: Option[Int], offset: Option[Int]): String

  /**
    */
  def natureRead(id: Int): String
}
