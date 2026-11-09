
package org.openapitools.client.model


case class TypePastRelationships (
    /* The last generation in which the referenced type had the listed damage relations */
    _generation: GenerationSummary,
    /* The damage relations the referenced type had up to and including the listed generation */
    _damageRelations: TypeRelationships
)
object TypePastRelationships {
    def toStringBody(var_generation: Object, var_damageRelations: Object) =
        s"""
        | {
        | "generation":$var_generation,"damageRelations":$var_damageRelations
        | }
        """.stripMargin
}
