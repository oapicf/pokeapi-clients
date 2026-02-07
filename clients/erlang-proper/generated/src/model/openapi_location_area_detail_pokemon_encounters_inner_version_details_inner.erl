-module(openapi_location_area_detail_pokemon_encounters_inner_version_details_inner).

-include("openapi.hrl").

-export([openapi_location_area_detail_pokemon_encounters_inner_version_details_inner/0]).

-export([openapi_location_area_detail_pokemon_encounters_inner_version_details_inner/1]).

-export_type([openapi_location_area_detail_pokemon_encounters_inner_version_details_inner/0]).

-type openapi_location_area_detail_pokemon_encounters_inner_version_details_inner() ::
  [ {'version', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
  | {'max_chance', integer() }
  | {'encounter_details', openapi_location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details:openapi_location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details() }
  ].


openapi_location_area_detail_pokemon_encounters_inner_version_details_inner() ->
    openapi_location_area_detail_pokemon_encounters_inner_version_details_inner([]).

openapi_location_area_detail_pokemon_encounters_inner_version_details_inner(Fields) ->
  Default = [ {'version', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
            , {'max_chance', integer() }
            , {'encounter_details', openapi_location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details:openapi_location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

