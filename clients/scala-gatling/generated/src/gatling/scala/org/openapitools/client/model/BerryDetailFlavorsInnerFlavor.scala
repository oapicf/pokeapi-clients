
package org.openapitools.client.model

import java.net.URI

case class BerryDetailFlavorsInnerFlavor (
    /* The name of the flavor */
    _name: Option[String],
    /* The URL to get more information about the flavor */
    _url: Option[URI]
)
object BerryDetailFlavorsInnerFlavor {
    def toStringBody(var_name: Object, var_url: Object) =
        s"""
        | {
        | "name":$var_name,"url":$var_url
        | }
        """.stripMargin
}
