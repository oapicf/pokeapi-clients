-module(openapi_nature_detail).

-include("openapi.hrl").

-export([openapi_nature_detail/0]).

-export([openapi_nature_detail/1]).

-export_type([openapi_nature_detail/0]).

-type openapi_nature_detail() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'decreased_stat', openapi_stat_summary:openapi_stat_summary() }
  | {'increased_stat', openapi_stat_summary:openapi_stat_summary() }
  | {'likes_flavor', openapi_berry_flavor_summary:openapi_berry_flavor_summary() }
  | {'hates_flavor', openapi_berry_flavor_summary:openapi_berry_flavor_summary() }
  | {'berries', list(openapi_berry_summary:openapi_berry_summary()) }
  | {'pokeathlon_stat_changes', list(openapi_nature_detail_pokeathlon_stat_changes_inner:openapi_nature_detail_pokeathlon_stat_changes_inner()) }
  | {'move_battle_style_preferences', list(openapi_nature_battle_style_preference:openapi_nature_battle_style_preference()) }
  | {'names', list(openapi_nature_name:openapi_nature_name()) }
  ].


openapi_nature_detail() ->
    openapi_nature_detail([]).

openapi_nature_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'decreased_stat', openapi_stat_summary:openapi_stat_summary() }
            , {'increased_stat', openapi_stat_summary:openapi_stat_summary() }
            , {'likes_flavor', openapi_berry_flavor_summary:openapi_berry_flavor_summary() }
            , {'hates_flavor', openapi_berry_flavor_summary:openapi_berry_flavor_summary() }
            , {'berries', list(openapi_berry_summary:openapi_berry_summary()) }
            , {'pokeathlon_stat_changes', list(openapi_nature_detail_pokeathlon_stat_changes_inner:openapi_nature_detail_pokeathlon_stat_changes_inner()) }
            , {'move_battle_style_preferences', list(openapi_nature_battle_style_preference:openapi_nature_battle_style_preference()) }
            , {'names', list(openapi_nature_name:openapi_nature_name()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

