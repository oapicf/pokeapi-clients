-module(openapi_move_detail_effect_changes_inner).

-export([encode/1]).

-export_type([openapi_move_detail_effect_changes_inner/0]).

-type openapi_move_detail_effect_changes_inner() ::
    #{ 'effect_entries' := list(),
       'version_group' := openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()
     }.

encode(#{ 'effect_entries' := EffectEntries,
          'version_group' := VersionGroup
        }) ->
    #{ 'effect_entries' => EffectEntries,
       'version_group' => VersionGroup
     }.
