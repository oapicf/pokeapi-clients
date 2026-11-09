-module(openapi_version_group_detail).

-include("openapi.hrl").

-export([openapi_version_group_detail/0]).

-export([openapi_version_group_detail/1]).

-export_type([openapi_version_group_detail/0]).

-type openapi_version_group_detail() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'order', integer() }
  | {'generation', openapi_generation_summary:openapi_generation_summary() }
  | {'move_learn_methods', list(openapi_move_learn_method_summary:openapi_move_learn_method_summary()) }
  | {'pokedexes', list(openapi_pokedex_summary:openapi_pokedex_summary()) }
  | {'regions', list(openapi_region_summary:openapi_region_summary()) }
  | {'versions', list(openapi_version_summary:openapi_version_summary()) }
  ].


openapi_version_group_detail() ->
    openapi_version_group_detail([]).

openapi_version_group_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'order', integer(-2147483648, 2147483647) }
            , {'generation', openapi_generation_summary:openapi_generation_summary() }
            , {'move_learn_methods', list(openapi_move_learn_method_summary:openapi_move_learn_method_summary()) }
            , {'pokedexes', list(openapi_pokedex_summary:openapi_pokedex_summary()) }
            , {'regions', list(openapi_region_summary:openapi_region_summary()) }
            , {'versions', list(openapi_version_summary:openapi_version_summary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

