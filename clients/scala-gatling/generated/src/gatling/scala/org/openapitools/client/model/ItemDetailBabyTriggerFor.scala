
package org.openapitools.client.model

import java.net.URI

case class ItemDetailBabyTriggerFor (
    _url: URI
)
object ItemDetailBabyTriggerFor {
    def toStringBody(var_url: Object) =
        s"""
        | {
        | "url":$var_url
        | }
        """.stripMargin
}
