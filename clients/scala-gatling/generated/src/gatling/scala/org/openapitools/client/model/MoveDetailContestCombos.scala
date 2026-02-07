
package org.openapitools.client.model


case class MoveDetailContestCombos (
    _normal: MoveDetailContestCombosNormal,
    _super: MoveDetailContestCombosNormal
)
object MoveDetailContestCombos {
    def toStringBody(var_normal: Object, var_super: Object) =
        s"""
        | {
        | "normal":$var_normal,"super":$var_super
        | }
        """.stripMargin
}
