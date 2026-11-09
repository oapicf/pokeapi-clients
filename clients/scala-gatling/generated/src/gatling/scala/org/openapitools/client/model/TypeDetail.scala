
package org.openapitools.client.model


case class TypeDetail (
    /* The identifier for this resource. */
    _id: Integer,
    /* The name for this resource. */
    _name: String,
    /* A detail of how effective this type is toward others and vice versa. */
    _damageRelations: TypeRelationships,
    /* A list of details of how effective this type was toward others and vice versa in previous generations */
    _pastDamageRelations: List[TypePastRelationships],
    /* A list of game indices relevent to this item by generation. */
    _gameIndices: List[TypeGameIndex],
    /* The generation this type was introduced in. */
    _generation: GenerationSummary,
    /* The class of damage inflicted by this type. */
    _moveDamageClass: MoveDamageClassSummary,
    /* The name of this resource listed in different languages. */
    _names: List[TypeName],
    /* A list of details of Pokémon that have this type. */
    _pokemon: List[TypePokemon],
    /* A list of moves that have this type. */
    _moves: List[MoveSummary],
    /* Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null. */
    _sprites: Map[String, Map[String, TypeGameSprite]]
)
object TypeDetail {
    def toStringBody(var_id: Object, var_name: Object, var_damageRelations: Object, var_pastDamageRelations: Object, var_gameIndices: Object, var_generation: Object, var_moveDamageClass: Object, var_names: Object, var_pokemon: Object, var_moves: Object, var_sprites: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"damageRelations":$var_damageRelations,"pastDamageRelations":$var_pastDamageRelations,"gameIndices":$var_gameIndices,"generation":$var_generation,"moveDamageClass":$var_moveDamageClass,"names":$var_names,"pokemon":$var_pokemon,"moves":$var_moves,"sprites":$var_sprites
        | }
        """.stripMargin
}
