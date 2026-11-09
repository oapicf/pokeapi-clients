package org.openapitools.server.model


/**
 * Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I'm not sure how to add anything other than a hyperlink
 *
 * @param id The identifier for this resource. for example: ''null''
 * @param name The name for this resource. for example: ''null''
 * @param names The name of this resource listed in different languages. for example: ''null''
 * @param versionGroup The version group this version belongs to. for example: ''null''
*/
final case class VersionDetail (
  id: Int,
  name: String,
  names: Seq[VersionName],
  versionGroup: VersionGroupSummary
)

