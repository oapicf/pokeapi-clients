-module(openapi_berry_flavor_berry_map).

-include("openapi.hrl").

-export([openapi_berry_flavor_berry_map/0]).

-export([openapi_berry_flavor_berry_map/1]).

-export_type([openapi_berry_flavor_berry_map/0]).

-type openapi_berry_flavor_berry_map() ::
  [ {'potency', integer() }
  | {'berry', openapi_berry_summary:openapi_berry_summary() }
  ].


openapi_berry_flavor_berry_map() ->
    openapi_berry_flavor_berry_map([]).

openapi_berry_flavor_berry_map(Fields) ->
  Default = [ {'potency', integer(-2147483648, 2147483647) }
            , {'berry', openapi_berry_summary:openapi_berry_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

