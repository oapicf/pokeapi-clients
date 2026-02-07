-module(openapi_egg_group_name).

-include("openapi.hrl").

-export([openapi_egg_group_name/0]).

-export([openapi_egg_group_name/1]).

-export_type([openapi_egg_group_name/0]).

-type openapi_egg_group_name() ::
  [ {'name', binary() }
  | {'language', openapi_language_summary:openapi_language_summary() }
  ].


openapi_egg_group_name() ->
    openapi_egg_group_name([]).

openapi_egg_group_name(Fields) ->
  Default = [ {'name', binary() }
            , {'language', openapi_language_summary:openapi_language_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

