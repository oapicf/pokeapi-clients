-module(openapi_type_name).

-include("openapi.hrl").

-export([openapi_type_name/0]).

-export([openapi_type_name/1]).

-export_type([openapi_type_name/0]).

-type openapi_type_name() ::
  [ {'name', binary() }
  | {'language', openapi_language_summary:openapi_language_summary() }
  ].


openapi_type_name() ->
    openapi_type_name([]).

openapi_type_name(Fields) ->
  Default = [ {'name', binary() }
            , {'language', openapi_language_summary:openapi_language_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

