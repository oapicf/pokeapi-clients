
package org.openapitools.client.model

import java.net.URI

case class PaginatedItemCategorySummaryList (
    _count: Option[Integer],
    _next: Option[URI],
    _previous: Option[URI],
    _results: Option[List[ItemCategorySummary]]
)
object PaginatedItemCategorySummaryList {
    def toStringBody(var_count: Object, var_next: Object, var_previous: Object, var_results: Object) =
        s"""
        | {
        | "count":$var_count,"next":$var_next,"previous":$var_previous,"results":$var_results
        | }
        """.stripMargin
}
