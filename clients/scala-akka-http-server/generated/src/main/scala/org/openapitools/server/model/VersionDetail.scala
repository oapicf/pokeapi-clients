package org.openapitools.server.model


/**
 * Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I'm not sure how to add anything other than a hyperlink
 *
 * @param id  for example: ''null''
 * @param name  for example: ''null''
 * @param names  for example: ''null''
 * @param versionGroup  for example: ''null''
*/
final case class VersionDetail (
  id: Int,
  name: String,
  names: Seq[VersionName],
  versionGroup: VersionGroupSummary
)

