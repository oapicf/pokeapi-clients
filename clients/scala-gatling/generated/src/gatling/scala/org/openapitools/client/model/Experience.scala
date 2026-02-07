
package org.openapitools.client.model


case class Experience (
    _level: Integer,
    _experience: Integer
)
object Experience {
    def toStringBody(var_level: Object, var_experience: Object) =
        s"""
        | {
        | "level":$var_level,"experience":$var_experience
        | }
        """.stripMargin
}
