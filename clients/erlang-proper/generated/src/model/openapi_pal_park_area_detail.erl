-module(openapi_pal_park_area_detail).

-include("openapi.hrl").

-export([openapi_pal_park_area_detail/0]).

-export([openapi_pal_park_area_detail/1]).

-export_type([openapi_pal_park_area_detail/0]).

-type openapi_pal_park_area_detail() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'names', list(openapi_pal_park_area_name:openapi_pal_park_area_name()) }
  | {'pokemon_encounters', list(openapi_pal_park_encounter:openapi_pal_park_encounter()) }
  ].


openapi_pal_park_area_detail() ->
    openapi_pal_park_area_detail([]).

openapi_pal_park_area_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'names', list(openapi_pal_park_area_name:openapi_pal_park_area_name()) }
            , {'pokemon_encounters', list(openapi_pal_park_encounter:openapi_pal_park_encounter()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

