-module(openapi_location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details).

-include("openapi.hrl").

-export([openapi_location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details/0]).

-export([openapi_location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details/1]).

-export_type([openapi_location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details/0]).

-type openapi_location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details() ::
  [ {'min_level', integer() }
  | {'max_level', integer() }
  | {'condition_values', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
  | {'chance', integer() }
  | {'method', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
  ].


openapi_location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details() ->
    openapi_location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details([]).

openapi_location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details(Fields) ->
  Default = [ {'min_level', integer() }
            , {'max_level', integer() }
            , {'condition_values', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
            , {'chance', integer() }
            , {'method', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

