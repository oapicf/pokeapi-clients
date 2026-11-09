package org.openapitools.server.model


/**
 * @param nameIcon The URL of the icon displaying the type name in this game, or null if unavailable. for example: ''null''
 * @param symbolIcon The URL of the type symbol icon in this game, or null if unavailable. for example: ''null''
*/
final case class TypeGameSprite (
  nameIcon: Option[String] = None,
  symbolIcon: Option[String] = None
)

