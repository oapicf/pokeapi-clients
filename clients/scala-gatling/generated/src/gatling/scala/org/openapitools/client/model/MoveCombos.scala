
package org.openapitools.client.model


case class MoveCombos (
    /* A detail of moves this move can be used before or after, granting additional appeal points in contests. */
    _normal: MoveComboUsage,
    /* A detail of moves this move can be used before or after, granting additional appeal points in super contests. */
    _super: MoveComboUsage
)
object MoveCombos {
    def toStringBody(var_normal: Object, var_super: Object) =
        s"""
        | {
        | "normal":$var_normal,"super":$var_super
        | }
        """.stripMargin
}
