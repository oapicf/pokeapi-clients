-module(openapi_item_detail).

-include("openapi.hrl").

-export([openapi_item_detail/0]).

-export([openapi_item_detail/1]).

-export_type([openapi_item_detail/0]).

-type openapi_item_detail() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'cost', integer() }
  | {'fling_power', integer() }
  | {'fling_effect', openapi_item_fling_effect_summary:openapi_item_fling_effect_summary() }
  | {'attributes', list(openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()) }
  | {'category', openapi_item_category_summary:openapi_item_category_summary() }
  | {'effect_entries', list(openapi_item_effect_text:openapi_item_effect_text()) }
  | {'flavor_text_entries', list(openapi_item_flavor_text:openapi_item_flavor_text()) }
  | {'game_indices', list(openapi_item_game_index:openapi_item_game_index()) }
  | {'names', list(openapi_item_name:openapi_item_name()) }
  | {'held_by_pokemon', list(openapi_item_detail_held_by_pokemon_inner:openapi_item_detail_held_by_pokemon_inner()) }
  | {'sprites', openapi_item_detail_sprites:openapi_item_detail_sprites() }
  | {'baby_trigger_for', openapi_item_detail_baby_trigger_for:openapi_item_detail_baby_trigger_for() }
  | {'machines', list(openapi_item_detail_machines_inner:openapi_item_detail_machines_inner()) }
  ].


openapi_item_detail() ->
    openapi_item_detail([]).

openapi_item_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'cost', integer() }
            , {'fling_power', integer() }
            , {'fling_effect', openapi_item_fling_effect_summary:openapi_item_fling_effect_summary() }
            , {'attributes', list(openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()) }
            , {'category', openapi_item_category_summary:openapi_item_category_summary() }
            , {'effect_entries', list(openapi_item_effect_text:openapi_item_effect_text()) }
            , {'flavor_text_entries', list(openapi_item_flavor_text:openapi_item_flavor_text()) }
            , {'game_indices', list(openapi_item_game_index:openapi_item_game_index()) }
            , {'names', list(openapi_item_name:openapi_item_name()) }
            , {'held_by_pokemon', list(openapi_item_detail_held_by_pokemon_inner:openapi_item_detail_held_by_pokemon_inner()) }
            , {'sprites', openapi_item_detail_sprites:openapi_item_detail_sprites() }
            , {'baby_trigger_for', openapi_item_detail_baby_trigger_for:openapi_item_detail_baby_trigger_for() }
            , {'machines', list(openapi_item_detail_machines_inner:openapi_item_detail_machines_inner()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

