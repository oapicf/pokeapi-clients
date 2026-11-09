
package org.openapitools.client.model

import java.net.URI

case class MoveTargetSummary (
    /* The name of the referenced resource. */
    _name: String,
    /* The URL of the referenced resource. */
    _url: URI
)
object MoveTargetSummary {
    def toStringBody(var_name: Object, var_url: Object) =
        s"""
        | {
        | "name":$var_name,"url":$var_url
        | }
        """.stripMargin
}
