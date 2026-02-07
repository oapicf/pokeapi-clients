-module(openapi_ability_detail).

-include("openapi.hrl").

-export([openapi_ability_detail/0]).

-export([openapi_ability_detail/1]).

-export_type([openapi_ability_detail/0]).

-type openapi_ability_detail() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'is_main_series', boolean() }
  | {'generation', openapi_generation_summary:openapi_generation_summary() }
  | {'names', list(openapi_ability_name:openapi_ability_name()) }
  | {'effect_entries', list(openapi_ability_effect_text:openapi_ability_effect_text()) }
  | {'effect_changes', list(openapi_ability_change:openapi_ability_change()) }
  | {'flavor_text_entries', list(openapi_ability_flavor_text:openapi_ability_flavor_text()) }
  | {'pokemon', list(openapi_ability_detail_pokemon_inner:openapi_ability_detail_pokemon_inner()) }
  ].


openapi_ability_detail() ->
    openapi_ability_detail([]).

openapi_ability_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'is_main_series', boolean() }
            , {'generation', openapi_generation_summary:openapi_generation_summary() }
            , {'names', list(openapi_ability_name:openapi_ability_name()) }
            , {'effect_entries', list(openapi_ability_effect_text:openapi_ability_effect_text()) }
            , {'effect_changes', list(openapi_ability_change:openapi_ability_change()) }
            , {'flavor_text_entries', list(openapi_ability_flavor_text:openapi_ability_flavor_text()) }
            , {'pokemon', list(openapi_ability_detail_pokemon_inner:openapi_ability_detail_pokemon_inner()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

