-module(openapi_characteristic_summary).

-include("openapi.hrl").

-export([openapi_characteristic_summary/0]).

-export([openapi_characteristic_summary/1]).

-export_type([openapi_characteristic_summary/0]).

-type openapi_characteristic_summary() ::
  [ {'url', openapi_u_ri:openapi_u_ri() }
  ].


openapi_characteristic_summary() ->
    openapi_characteristic_summary([]).

openapi_characteristic_summary(Fields) ->
  Default = [ {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

