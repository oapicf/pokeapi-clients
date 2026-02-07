-module(openapi_berry_detail_flavors_inner).

-include("openapi.hrl").

-export([openapi_berry_detail_flavors_inner/0]).

-export([openapi_berry_detail_flavors_inner/1]).

-export_type([openapi_berry_detail_flavors_inner/0]).

-type openapi_berry_detail_flavors_inner() ::
  [ {'potency', integer() }
  | {'flavor', openapi_berry_detail_flavors_inner_flavor:openapi_berry_detail_flavors_inner_flavor() }
  ].


openapi_berry_detail_flavors_inner() ->
    openapi_berry_detail_flavors_inner([]).

openapi_berry_detail_flavors_inner(Fields) ->
  Default = [ {'potency', integer() }
            , {'flavor', openapi_berry_detail_flavors_inner_flavor:openapi_berry_detail_flavors_inner_flavor() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

