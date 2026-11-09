-module(openapi_location_area_pokemon_encounter_version).

-include("openapi.hrl").

-export([openapi_location_area_pokemon_encounter_version/0]).

-export([openapi_location_area_pokemon_encounter_version/1]).

-export_type([openapi_location_area_pokemon_encounter_version/0]).

-type openapi_location_area_pokemon_encounter_version() ::
  [ {'version', openapi_version_summary:openapi_version_summary() }
  | {'max_chance', integer() }
  | {'encounter_details', list(openapi_location_area_encounter_detail:openapi_location_area_encounter_detail()) }
  ].


openapi_location_area_pokemon_encounter_version() ->
    openapi_location_area_pokemon_encounter_version([]).

openapi_location_area_pokemon_encounter_version(Fields) ->
  Default = [ {'version', openapi_version_summary:openapi_version_summary() }
            , {'max_chance', integer() }
            , {'encounter_details', list(openapi_location_area_encounter_detail:openapi_location_area_encounter_detail()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

