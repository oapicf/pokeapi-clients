package org.openapitools.server.model


/**
 * @param level The level gained. for example: ''null''
 * @param experience The amount of experience required to reach the referenced level. for example: ''null''
*/
final case class Experience (
  level: Int,
  experience: Int
)

