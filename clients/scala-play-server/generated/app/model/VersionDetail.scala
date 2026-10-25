package model

import play.api.libs.json._

/**
  * Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I'm not sure how to add anything other than a hyperlink
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-25T05:53:17.467323765Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class VersionDetail(
  id: Int,
  name: String,
  names: List[VersionName],
  versionGroup: VersionGroupSummary
)

object VersionDetail {
  implicit lazy val versionDetailJsonFormat: Format[VersionDetail] = Json.format[VersionDetail]
}

