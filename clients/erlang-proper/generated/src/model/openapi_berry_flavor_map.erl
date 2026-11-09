-module(openapi_berry_flavor_map).

-include("openapi.hrl").

-export([openapi_berry_flavor_map/0]).

-export([openapi_berry_flavor_map/1]).

-export_type([openapi_berry_flavor_map/0]).

-type openapi_berry_flavor_map() ::
  [ {'potency', integer() }
  | {'flavor', openapi_berry_flavor_summary:openapi_berry_flavor_summary() }
  ].


openapi_berry_flavor_map() ->
    openapi_berry_flavor_map([]).

openapi_berry_flavor_map(Fields) ->
  Default = [ {'potency', integer(-2147483648, 2147483647) }
            , {'flavor', openapi_berry_flavor_summary:openapi_berry_flavor_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

