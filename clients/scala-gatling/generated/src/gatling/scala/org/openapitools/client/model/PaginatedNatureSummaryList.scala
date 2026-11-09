
package org.openapitools.client.model

import java.net.URI

case class PaginatedNatureSummaryList (
    /* The total number of resources available from this API. */
    _count: Integer,
    /* The URL for the next page in the list, or null if there is no next page. */
    _next: Option[URI],
    /* The URL for the previous page in the list, or null if there is no previous page. */
    _previous: Option[URI],
    /* A list of API resources on this page. */
    _results: List[NatureSummary]
)
object PaginatedNatureSummaryList {
    def toStringBody(var_count: Object, var_next: Object, var_previous: Object, var_results: Object) =
        s"""
        | {
        | "count":$var_count,"next":$var_next,"previous":$var_previous,"results":$var_results
        | }
        """.stripMargin
}
