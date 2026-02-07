-module(openapi_type_detail_past_damage_relations_inner_damage_relations).

-export([encode/1]).

-export_type([openapi_type_detail_past_damage_relations_inner_damage_relations/0]).

-type openapi_type_detail_past_damage_relations_inner_damage_relations() ::
    #{ 'no_damage_to' := list(),
       'half_damage_to' := list(),
       'double_damage_to' := list(),
       'no_damage_from' := list(),
       'half_damage_from' := list(),
       'double_damage_from' := list()
     }.

encode(#{ 'no_damage_to' := NoDamageTo,
          'half_damage_to' := HalfDamageTo,
          'double_damage_to' := DoubleDamageTo,
          'no_damage_from' := NoDamageFrom,
          'half_damage_from' := HalfDamageFrom,
          'double_damage_from' := DoubleDamageFrom
        }) ->
    #{ 'no_damage_to' => NoDamageTo,
       'half_damage_to' => HalfDamageTo,
       'double_damage_to' => DoubleDamageTo,
       'no_damage_from' => NoDamageFrom,
       'half_damage_from' => HalfDamageFrom,
       'double_damage_from' => DoubleDamageFrom
     }.
