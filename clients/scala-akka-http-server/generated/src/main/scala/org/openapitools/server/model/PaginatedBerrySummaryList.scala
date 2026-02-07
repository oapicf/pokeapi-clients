package org.openapitools.server.model

import java.net.URI

/**
 * @param count  for example: ''123''
 * @param next  for example: ''http://api.example.org/accounts/?offset=400&limit=100''
 * @param previous  for example: ''http://api.example.org/accounts/?offset=200&limit=100''
 * @param results  for example: ''null''
*/
final case class PaginatedBerrySummaryList (
  count: Option[Int] = None,
  next: Option[URI] = None,
  previous: Option[URI] = None,
  results: Option[Seq[BerrySummary]] = None
)

