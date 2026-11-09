
package org.openapitools.client.model


case class StatAffectingNatures (
    /* A list of natures and how they change the referenced stat. */
    _increase: List[NatureSummary],
    /* A list of nature sand how they change the referenced stat. */
    _decrease: List[NatureSummary]
)
object StatAffectingNatures {
    def toStringBody(var_increase: Object, var_decrease: Object) =
        s"""
        | {
        | "increase":$var_increase,"decrease":$var_decrease
        | }
        """.stripMargin
}
