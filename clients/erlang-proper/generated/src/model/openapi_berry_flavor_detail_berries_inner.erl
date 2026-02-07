-module(openapi_berry_flavor_detail_berries_inner).

-include("openapi.hrl").

-export([openapi_berry_flavor_detail_berries_inner/0]).

-export([openapi_berry_flavor_detail_berries_inner/1]).

-export_type([openapi_berry_flavor_detail_berries_inner/0]).

-type openapi_berry_flavor_detail_berries_inner() ::
  [ {'potency', integer() }
  | {'berry', openapi_berry_flavor_detail_berries_inner_berry:openapi_berry_flavor_detail_berries_inner_berry() }
  ].


openapi_berry_flavor_detail_berries_inner() ->
    openapi_berry_flavor_detail_berries_inner([]).

openapi_berry_flavor_detail_berries_inner(Fields) ->
  Default = [ {'potency', integer() }
            , {'berry', openapi_berry_flavor_detail_berries_inner_berry:openapi_berry_flavor_detail_berries_inner_berry() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

