package org.openapitools.server.model


/**
 * @param increase A list of natures and how they change the referenced stat. for example: ''null''
 * @param decrease A list of nature sand how they change the referenced stat. for example: ''null''
*/
final case class StatAffectingNatures (
  increase: Seq[NatureSummary],
  decrease: Seq[NatureSummary]
)

