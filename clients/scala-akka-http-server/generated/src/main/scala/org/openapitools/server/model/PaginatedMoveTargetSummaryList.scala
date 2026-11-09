package org.openapitools.server.model

import java.net.URI

/**
 * @param count The total number of resources available from this API. for example: ''100''
 * @param next The URL for the next page in the list, or null if there is no next page. for example: ''https://pokeapi.co/api/v2/move-target/?offset=40&limit=20''
 * @param previous The URL for the previous page in the list, or null if there is no previous page. for example: ''https://pokeapi.co/api/v2/move-target/?offset=0&limit=20''
 * @param results A list of API resources on this page. for example: ''null''
*/
final case class PaginatedMoveTargetSummaryList (
  count: Int,
  next: Option[URI] = None,
  previous: Option[URI] = None,
  results: Seq[MoveTargetSummary]
)

