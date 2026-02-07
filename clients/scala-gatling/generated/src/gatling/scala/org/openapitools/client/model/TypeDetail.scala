
package org.openapitools.client.model


case class TypeDetail (
    _id: Integer,
    _name: String,
    _damageRelations: TypeDetailDamageRelations,
    _pastDamageRelations: List[TypeDetailPastDamageRelationsInner],
    _gameIndices: List[TypeGameIndex],
    _generation: GenerationSummary,
    _moveDamageClass: MoveDamageClassSummary,
    _names: List[AbilityName],
    _pokemon: List[TypeDetailPokemonInner],
    _moves: List[MoveSummary],
    _sprites: Map[String, Map[String, TypeDetailSpritesValueValue]]
)
object TypeDetail {
    def toStringBody(var_id: Object, var_name: Object, var_damageRelations: Object, var_pastDamageRelations: Object, var_gameIndices: Object, var_generation: Object, var_moveDamageClass: Object, var_names: Object, var_pokemon: Object, var_moves: Object, var_sprites: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"damageRelations":$var_damageRelations,"pastDamageRelations":$var_pastDamageRelations,"gameIndices":$var_gameIndices,"generation":$var_generation,"moveDamageClass":$var_moveDamageClass,"names":$var_names,"pokemon":$var_pokemon,"moves":$var_moves,"sprites":$var_sprites
        | }
        """.stripMargin
}
