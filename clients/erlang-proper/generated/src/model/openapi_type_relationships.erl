-module(openapi_type_relationships).

-include("openapi.hrl").

-export([openapi_type_relationships/0]).

-export([openapi_type_relationships/1]).

-export_type([openapi_type_relationships/0]).

-type openapi_type_relationships() ::
  [ {'no_damage_to', list(openapi_type_summary:openapi_type_summary()) }
  | {'half_damage_to', list(openapi_type_summary:openapi_type_summary()) }
  | {'double_damage_to', list(openapi_type_summary:openapi_type_summary()) }
  | {'no_damage_from', list(openapi_type_summary:openapi_type_summary()) }
  | {'half_damage_from', list(openapi_type_summary:openapi_type_summary()) }
  | {'double_damage_from', list(openapi_type_summary:openapi_type_summary()) }
  ].


openapi_type_relationships() ->
    openapi_type_relationships([]).

openapi_type_relationships(Fields) ->
  Default = [ {'no_damage_to', list(openapi_type_summary:openapi_type_summary()) }
            , {'half_damage_to', list(openapi_type_summary:openapi_type_summary()) }
            , {'double_damage_to', list(openapi_type_summary:openapi_type_summary()) }
            , {'no_damage_from', list(openapi_type_summary:openapi_type_summary()) }
            , {'half_damage_from', list(openapi_type_summary:openapi_type_summary()) }
            , {'double_damage_from', list(openapi_type_summary:openapi_type_summary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

