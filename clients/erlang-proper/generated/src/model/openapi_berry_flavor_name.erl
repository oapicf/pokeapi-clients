-module(openapi_berry_flavor_name).

-include("openapi.hrl").

-export([openapi_berry_flavor_name/0]).

-export([openapi_berry_flavor_name/1]).

-export_type([openapi_berry_flavor_name/0]).

-type openapi_berry_flavor_name() ::
  [ {'name', binary() }
  | {'language', openapi_language_summary:openapi_language_summary() }
  ].


openapi_berry_flavor_name() ->
    openapi_berry_flavor_name([]).

openapi_berry_flavor_name(Fields) ->
  Default = [ {'name', binary() }
            , {'language', openapi_language_summary:openapi_language_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

