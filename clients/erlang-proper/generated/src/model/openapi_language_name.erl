-module(openapi_language_name).

-include("openapi.hrl").

-export([openapi_language_name/0]).

-export([openapi_language_name/1]).

-export_type([openapi_language_name/0]).

-type openapi_language_name() ::
  [ {'name', binary() }
  | {'language', openapi_language_summary:openapi_language_summary() }
  ].


openapi_language_name() ->
    openapi_language_name([]).

openapi_language_name(Fields) ->
  Default = [ {'name', binary() }
            , {'language', openapi_language_summary:openapi_language_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

