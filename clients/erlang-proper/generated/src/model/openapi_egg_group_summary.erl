-module(openapi_egg_group_summary).

-include("openapi.hrl").

-export([openapi_egg_group_summary/0]).

-export([openapi_egg_group_summary/1]).

-export_type([openapi_egg_group_summary/0]).

-type openapi_egg_group_summary() ::
  [ {'name', binary() }
  | {'url', openapi_u_ri:openapi_u_ri() }
  ].


openapi_egg_group_summary() ->
    openapi_egg_group_summary([]).

openapi_egg_group_summary(Fields) ->
  Default = [ {'name', binary() }
            , {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

