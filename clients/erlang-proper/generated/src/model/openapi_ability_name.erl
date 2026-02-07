-module(openapi_ability_name).

-include("openapi.hrl").

-export([openapi_ability_name/0]).

-export([openapi_ability_name/1]).

-export_type([openapi_ability_name/0]).

-type openapi_ability_name() ::
  [ {'name', binary() }
  | {'language', openapi_language_summary:openapi_language_summary() }
  ].


openapi_ability_name() ->
    openapi_ability_name([]).

openapi_ability_name(Fields) ->
  Default = [ {'name', binary() }
            , {'language', openapi_language_summary:openapi_language_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

