package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param item  for example: ''null''
 * @param versionGroup  for example: ''null''
 * @param move  for example: ''null''
*/
final case class MachineDetail (
  id: Int,
  item: ItemSummary,
  versionGroup: VersionGroupSummary,
  move: MoveSummary
)

