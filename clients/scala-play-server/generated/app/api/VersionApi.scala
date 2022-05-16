package api

import play.api.libs.json._

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-16T10:34:47.121763Z[Etc/UTC]")
trait VersionApi {
  /**
    */
  def versionList(limit: Option[Int], offset: Option[Int]): String

  /**
    */
  def versionRead(id: Int): String
}
