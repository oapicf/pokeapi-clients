package org.openapitools.server.model


/**
 * @param id The identifier for this resource. for example: ''null''
 * @param name The name for this resource. for example: ''null''
 * @param names The name of this resource listed in different languages. for example: ''null''
 * @param descriptions The description of this resource listed in different languages. for example: ''null''
 * @param versionGroups A list of version groups where moves can be learned through this method. for example: ''null''
*/
final case class MoveLearnMethodDetail (
  id: Int,
  name: String,
  names: Seq[MoveLearnMethodName],
  descriptions: Seq[MoveLearnMethodDescription],
  versionGroups: Seq[VersionGroupSummary]
)

