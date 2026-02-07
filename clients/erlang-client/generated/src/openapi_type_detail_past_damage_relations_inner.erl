-module(openapi_type_detail_past_damage_relations_inner).

-export([encode/1]).

-export_type([openapi_type_detail_past_damage_relations_inner/0]).

-type openapi_type_detail_past_damage_relations_inner() ::
    #{ 'generation' := openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon(),
       'damage_relations' := openapi_type_detail_past_damage_relations_inner_damage_relations:openapi_type_detail_past_damage_relations_inner_damage_relations()
     }.

encode(#{ 'generation' := Generation,
          'damage_relations' := DamageRelations
        }) ->
    #{ 'generation' => Generation,
       'damage_relations' => DamageRelations
     }.
