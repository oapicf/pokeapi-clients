-module(openapi_berry_flavor_detail_berries_inner_berry).

-include("openapi.hrl").

-export([openapi_berry_flavor_detail_berries_inner_berry/0]).

-export([openapi_berry_flavor_detail_berries_inner_berry/1]).

-export_type([openapi_berry_flavor_detail_berries_inner_berry/0]).

-type openapi_berry_flavor_detail_berries_inner_berry() ::
  [ {'name', binary() }
  | {'url', openapi_u_ri:openapi_u_ri() }
  ].


openapi_berry_flavor_detail_berries_inner_berry() ->
    openapi_berry_flavor_detail_berries_inner_berry([]).

openapi_berry_flavor_detail_berries_inner_berry(Fields) ->
  Default = [ {'name', binary() }
            , {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

