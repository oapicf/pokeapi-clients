
package org.openapitools.client.model

import java.net.URI

case class MoveDetailMachinesInnerMachine (
    _url: URI
)
object MoveDetailMachinesInnerMachine {
    def toStringBody(var_url: Object) =
        s"""
        | {
        | "url":$var_url
        | }
        """.stripMargin
}
