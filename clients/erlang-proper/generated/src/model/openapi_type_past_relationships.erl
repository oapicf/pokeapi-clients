-module(openapi_type_past_relationships).

-include("openapi.hrl").

-export([openapi_type_past_relationships/0]).

-export([openapi_type_past_relationships/1]).

-export_type([openapi_type_past_relationships/0]).

-type openapi_type_past_relationships() ::
  [ {'generation', openapi_generation_summary:openapi_generation_summary() }
  | {'damage_relations', openapi_type_relationships:openapi_type_relationships() }
  ].


openapi_type_past_relationships() ->
    openapi_type_past_relationships([]).

openapi_type_past_relationships(Fields) ->
  Default = [ {'generation', openapi_generation_summary:openapi_generation_summary() }
            , {'damage_relations', openapi_type_relationships:openapi_type_relationships() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

