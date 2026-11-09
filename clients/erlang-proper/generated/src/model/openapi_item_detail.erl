-module(openapi_item_detail).

-include("openapi.hrl").

-export([openapi_item_detail/0]).

-export([openapi_item_detail/1]).

-export_type([openapi_item_detail/0]).

-type openapi_item_detail() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'fling_power', integer() }
  | {'fling_effect', openapi_item_fling_effect_summary:openapi_item_fling_effect_summary() }
  | {'attributes', list(openapi_item_attribute_summary:openapi_item_attribute_summary()) }
  | {'category', openapi_item_category_summary:openapi_item_category_summary() }
  | {'effect_entries', list(openapi_item_effect_text:openapi_item_effect_text()) }
  | {'flavor_text_entries', list(openapi_item_flavor_text:openapi_item_flavor_text()) }
  | {'game_indices', list(openapi_item_game_index:openapi_item_game_index()) }
  | {'prices', list(openapi_item_price:openapi_item_price()) }
  | {'names', list(openapi_item_name:openapi_item_name()) }
  | {'held_by_pokemon', list(openapi_pokemon_held_item:openapi_pokemon_held_item()) }
  | {'sprites', openapi_item_sprites:openapi_item_sprites() }
  | {'baby_trigger_for', openapi_evolution_chain_summary:openapi_evolution_chain_summary() }
  | {'machines', list(openapi_item_machine:openapi_item_machine()) }
  ].


openapi_item_detail() ->
    openapi_item_detail([]).

openapi_item_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'fling_power', integer(-2147483648, 2147483647) }
            , {'fling_effect', openapi_item_fling_effect_summary:openapi_item_fling_effect_summary() }
            , {'attributes', list(openapi_item_attribute_summary:openapi_item_attribute_summary()) }
            , {'category', openapi_item_category_summary:openapi_item_category_summary() }
            , {'effect_entries', list(openapi_item_effect_text:openapi_item_effect_text()) }
            , {'flavor_text_entries', list(openapi_item_flavor_text:openapi_item_flavor_text()) }
            , {'game_indices', list(openapi_item_game_index:openapi_item_game_index()) }
            , {'prices', list(openapi_item_price:openapi_item_price()) }
            , {'names', list(openapi_item_name:openapi_item_name()) }
            , {'held_by_pokemon', list(openapi_pokemon_held_item:openapi_pokemon_held_item()) }
            , {'sprites', openapi_item_sprites:openapi_item_sprites() }
            , {'baby_trigger_for', openapi_evolution_chain_summary:openapi_evolution_chain_summary() }
            , {'machines', list(openapi_item_machine:openapi_item_machine()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

