package org.openapitools.server.model


/**
 * @param id The identifier for this resource. for example: ''null''
 * @param item The TM or HM item that corresponds to this machine. for example: ''null''
 * @param versionGroup The version group that this machine applies to. for example: ''null''
 * @param move The move that is taught by this machine. for example: ''null''
*/
final case class MachineDetail (
  id: Int,
  item: ItemSummary,
  versionGroup: VersionGroupSummary,
  move: MoveSummary
)

