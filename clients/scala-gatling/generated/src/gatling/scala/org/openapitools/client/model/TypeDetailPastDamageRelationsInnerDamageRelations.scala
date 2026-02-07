
package org.openapitools.client.model


case class TypeDetailPastDamageRelationsInnerDamageRelations (
    _noDamageTo: List[AbilityDetailPokemonInnerPokemon],
    _halfDamageTo: List[AbilityDetailPokemonInnerPokemon],
    _doubleDamageTo: List[AbilityDetailPokemonInnerPokemon],
    _noDamageFrom: List[AbilityDetailPokemonInnerPokemon],
    _halfDamageFrom: List[AbilityDetailPokemonInnerPokemon],
    _doubleDamageFrom: List[AbilityDetailPokemonInnerPokemon]
)
object TypeDetailPastDamageRelationsInnerDamageRelations {
    def toStringBody(var_noDamageTo: Object, var_halfDamageTo: Object, var_doubleDamageTo: Object, var_noDamageFrom: Object, var_halfDamageFrom: Object, var_doubleDamageFrom: Object) =
        s"""
        | {
        | "noDamageTo":$var_noDamageTo,"halfDamageTo":$var_halfDamageTo,"doubleDamageTo":$var_doubleDamageTo,"noDamageFrom":$var_noDamageFrom,"halfDamageFrom":$var_halfDamageFrom,"doubleDamageFrom":$var_doubleDamageFrom
        | }
        """.stripMargin
}
