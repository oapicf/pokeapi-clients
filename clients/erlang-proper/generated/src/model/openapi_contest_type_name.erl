-module(openapi_contest_type_name).

-include("openapi.hrl").

-export([openapi_contest_type_name/0]).

-export([openapi_contest_type_name/1]).

-export_type([openapi_contest_type_name/0]).

-type openapi_contest_type_name() ::
  [ {'name', binary() }
  | {'color', binary() }
  | {'language', openapi_language_summary:openapi_language_summary() }
  ].


openapi_contest_type_name() ->
    openapi_contest_type_name([]).

openapi_contest_type_name(Fields) ->
  Default = [ {'name', binary() }
            , {'color', binary() }
            , {'language', openapi_language_summary:openapi_language_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

