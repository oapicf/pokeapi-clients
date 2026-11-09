-module(openapi_location_area_pokemon_encounter).

-include("openapi.hrl").

-export([openapi_location_area_pokemon_encounter/0]).

-export([openapi_location_area_pokemon_encounter/1]).

-export_type([openapi_location_area_pokemon_encounter/0]).

-type openapi_location_area_pokemon_encounter() ::
  [ {'pokemon', openapi_pokemon_summary:openapi_pokemon_summary() }
  | {'version_details', list(openapi_location_area_pokemon_encounter_version:openapi_location_area_pokemon_encounter_version()) }
  ].


openapi_location_area_pokemon_encounter() ->
    openapi_location_area_pokemon_encounter([]).

openapi_location_area_pokemon_encounter(Fields) ->
  Default = [ {'pokemon', openapi_pokemon_summary:openapi_pokemon_summary() }
            , {'version_details', list(openapi_location_area_pokemon_encounter_version:openapi_location_area_pokemon_encounter_version()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

