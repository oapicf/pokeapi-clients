
package org.openapitools.client.model

import java.net.URI

case class BerryFlavorDetailBerriesInnerBerry (
    /* The name of the berry */
    _name: Option[String],
    /* The URL to get more information about the berry */
    _url: Option[URI]
)
object BerryFlavorDetailBerriesInnerBerry {
    def toStringBody(var_name: Object, var_url: Object) =
        s"""
        | {
        | "name":$var_name,"url":$var_url
        | }
        """.stripMargin
}
