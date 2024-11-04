package api

import play.api.libs.json._

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T13:23:19.534127305Z[Etc/UTC]", comments = "Generator version: 7.9.0")
trait GrowthRateApi {
  /**
    */
  def growthRateList(limit: Option[Int], offset: Option[Int]): String

  /**
    */
  def growthRateRead(id: Int): String
}
