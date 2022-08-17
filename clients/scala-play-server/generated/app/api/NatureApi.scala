package api

import play.api.libs.json._

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-08-17T11:04:30.996532Z[Etc/UTC]")
trait NatureApi {
  /**
    */
  def natureList(limit: Option[Int], offset: Option[Int]): String

  /**
    */
  def natureRead(id: Int): String
}
