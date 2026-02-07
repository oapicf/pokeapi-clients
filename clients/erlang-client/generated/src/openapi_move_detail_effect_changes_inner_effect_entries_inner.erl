-module(openapi_move_detail_effect_changes_inner_effect_entries_inner).

-export([encode/1]).

-export_type([openapi_move_detail_effect_changes_inner_effect_entries_inner/0]).

-type openapi_move_detail_effect_changes_inner_effect_entries_inner() ::
    #{ 'effect' := binary(),
       'language' := openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()
     }.

encode(#{ 'effect' := Effect,
          'language' := Language
        }) ->
    #{ 'effect' => Effect,
       'language' => Language
     }.
