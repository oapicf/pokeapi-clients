-module(openapi_type_detail).

-export([encode/1]).

-export_type([openapi_type_detail/0]).

-type openapi_type_detail() ::
    #{ 'id' := integer(),
       'name' := binary(),
       'damage_relations' := openapi_type_detail_damage_relations:openapi_type_detail_damage_relations(),
       'past_damage_relations' := list(),
       'game_indices' := list(),
       'generation' := openapi_generation_summary:openapi_generation_summary(),
       'move_damage_class' := openapi_move_damage_class_summary:openapi_move_damage_class_summary(),
       'names' := list(),
       'pokemon' := list(),
       'moves' := list(),
       'sprites' := maps:map()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'damage_relations' := DamageRelations,
          'past_damage_relations' := PastDamageRelations,
          'game_indices' := GameIndices,
          'generation' := Generation,
          'move_damage_class' := MoveDamageClass,
          'names' := Names,
          'pokemon' := Pokemon,
          'moves' := Moves,
          'sprites' := Sprites
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'damage_relations' => DamageRelations,
       'past_damage_relations' => PastDamageRelations,
       'game_indices' => GameIndices,
       'generation' => Generation,
       'move_damage_class' => MoveDamageClass,
       'names' => Names,
       'pokemon' => Pokemon,
       'moves' => Moves,
       'sprites' => Sprites
     }.
