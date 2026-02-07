-module(openapi_berry_detail_flavors_inner_flavor).

-include("openapi.hrl").

-export([openapi_berry_detail_flavors_inner_flavor/0]).

-export([openapi_berry_detail_flavors_inner_flavor/1]).

-export_type([openapi_berry_detail_flavors_inner_flavor/0]).

-type openapi_berry_detail_flavors_inner_flavor() ::
  [ {'name', binary() }
  | {'url', openapi_u_ri:openapi_u_ri() }
  ].


openapi_berry_detail_flavors_inner_flavor() ->
    openapi_berry_detail_flavors_inner_flavor([]).

openapi_berry_detail_flavors_inner_flavor(Fields) ->
  Default = [ {'name', binary() }
            , {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

