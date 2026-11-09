package org.openapitools.server.model


/**
 * @param machine The machine that teaches a move from an item. for example: ''null''
 * @param versionGroup The version group of this specific machine. for example: ''null''
*/
final case class ItemMachine (
  machine: MachineSummary,
  versionGroup: VersionGroupSummary
)

