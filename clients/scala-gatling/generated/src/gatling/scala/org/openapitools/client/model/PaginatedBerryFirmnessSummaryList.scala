
package org.openapitools.client.model

import java.net.URI

case class PaginatedBerryFirmnessSummaryList (
    _count: Option[Integer],
    _next: Option[URI],
    _previous: Option[URI],
    _results: Option[List[BerryFirmnessSummary]]
)
object PaginatedBerryFirmnessSummaryList {
    def toStringBody(var_count: Object, var_next: Object, var_previous: Object, var_results: Object) =
        s"""
        | {
        | "count":$var_count,"next":$var_next,"previous":$var_previous,"results":$var_results
        | }
        """.stripMargin
}
