package api

import play.api.libs.json._

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-24T08:45:05.479546Z[Etc/UTC]")
trait VersionApi {
  /**
    */
  def versionList(limit: Option[Int], offset: Option[Int]): String

  /**
    */
  def versionRead(id: Int): String
}
