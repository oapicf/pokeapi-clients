
package org.openapitools.client.model


case class Experience (
    /* The level gained. */
    _level: Integer,
    /* The amount of experience required to reach the referenced level. */
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
