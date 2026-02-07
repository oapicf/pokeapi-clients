-module(openapi_version_name).

-include("openapi.hrl").

-export([openapi_version_name/0]).

-export([openapi_version_name/1]).

-export_type([openapi_version_name/0]).

-type openapi_version_name() ::
  [ {'name', binary() }
  | {'language', openapi_language_summary:openapi_language_summary() }
  ].


openapi_version_name() ->
    openapi_version_name([]).

openapi_version_name(Fields) ->
  Default = [ {'name', binary() }
            , {'language', openapi_language_summary:openapi_language_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

