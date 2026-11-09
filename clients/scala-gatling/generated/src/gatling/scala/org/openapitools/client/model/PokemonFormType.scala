
package org.openapitools.client.model


case class PokemonFormType (
    /* The order the Pokémon's types are listed in. */
    _slot: Integer,
    /* The type the referenced Form has. */
    _type: TypeSummary
)
object PokemonFormType {
    def toStringBody(var_slot: Object, var_type: Object) =
        s"""
        | {
        | "slot":$var_slot,"type":$var_type
        | }
        """.stripMargin
}
