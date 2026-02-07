-module(openapi_generation_name).

-include("openapi.hrl").

-export([openapi_generation_name/0]).

-export([openapi_generation_name/1]).

-export_type([openapi_generation_name/0]).

-type openapi_generation_name() ::
  [ {'name', binary() }
  | {'language', openapi_language_summary:openapi_language_summary() }
  ].


openapi_generation_name() ->
    openapi_generation_name([]).

openapi_generation_name(Fields) ->
  Default = [ {'name', binary() }
            , {'language', openapi_language_summary:openapi_language_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

