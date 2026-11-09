-module(openapi_pokemon_encounter_response).

-include("openapi.hrl").

-export([openapi_pokemon_encounter_response/0]).

-export([openapi_pokemon_encounter_response/1]).

-export_type([openapi_pokemon_encounter_response/0]).

-type openapi_pokemon_encounter_response() ::
  [ {'location_area', openapi_location_area_summary:openapi_location_area_summary() }
  | {'version_details', list(openapi_pokemon_encounter_version_detail_response:openapi_pokemon_encounter_version_detail_response()) }
  ].


openapi_pokemon_encounter_response() ->
    openapi_pokemon_encounter_response([]).

openapi_pokemon_encounter_response(Fields) ->
  Default = [ {'location_area', openapi_location_area_summary:openapi_location_area_summary() }
            , {'version_details', list(openapi_pokemon_encounter_version_detail_response:openapi_pokemon_encounter_version_detail_response()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

