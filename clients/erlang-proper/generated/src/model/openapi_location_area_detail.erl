-module(openapi_location_area_detail).

-include("openapi.hrl").

-export([openapi_location_area_detail/0]).

-export([openapi_location_area_detail/1]).

-export_type([openapi_location_area_detail/0]).

-type openapi_location_area_detail() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'game_index', integer() }
  | {'encounter_method_rates', list(openapi_location_area_encounter_rate:openapi_location_area_encounter_rate()) }
  | {'location', openapi_location_summary:openapi_location_summary() }
  | {'names', list(openapi_location_area_name:openapi_location_area_name()) }
  | {'pokemon_encounters', list(openapi_location_area_pokemon_encounter:openapi_location_area_pokemon_encounter()) }
  ].


openapi_location_area_detail() ->
    openapi_location_area_detail([]).

openapi_location_area_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'game_index', integer(-2147483648, 2147483647) }
            , {'encounter_method_rates', list(openapi_location_area_encounter_rate:openapi_location_area_encounter_rate()) }
            , {'location', openapi_location_summary:openapi_location_summary() }
            , {'names', list(openapi_location_area_name:openapi_location_area_name()) }
            , {'pokemon_encounters', list(openapi_location_area_pokemon_encounter:openapi_location_area_pokemon_encounter()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

