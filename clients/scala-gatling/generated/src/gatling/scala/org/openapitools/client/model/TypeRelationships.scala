
package org.openapitools.client.model


case class TypeRelationships (
    /* A list of types this type has no effect on. */
    _noDamageTo: List[TypeSummary],
    /* A list of types this type is not very effect against. */
    _halfDamageTo: List[TypeSummary],
    /* A list of types this type is very effect against. */
    _doubleDamageTo: List[TypeSummary],
    /* A list of types that have no effect on this type. */
    _noDamageFrom: List[TypeSummary],
    /* A list of types that are not very effective against this type. */
    _halfDamageFrom: List[TypeSummary],
    /* A list of types that are very effective against this type. */
    _doubleDamageFrom: List[TypeSummary]
)
object TypeRelationships {
    def toStringBody(var_noDamageTo: Object, var_halfDamageTo: Object, var_doubleDamageTo: Object, var_noDamageFrom: Object, var_halfDamageFrom: Object, var_doubleDamageFrom: Object) =
        s"""
        | {
        | "noDamageTo":$var_noDamageTo,"halfDamageTo":$var_halfDamageTo,"doubleDamageTo":$var_doubleDamageTo,"noDamageFrom":$var_noDamageFrom,"halfDamageFrom":$var_halfDamageFrom,"doubleDamageFrom":$var_doubleDamageFrom
        | }
        """.stripMargin
}
