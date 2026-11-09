-module(openapi_gender_detail).

-include("openapi.hrl").

-export([openapi_gender_detail/0]).

-export([openapi_gender_detail/1]).

-export_type([openapi_gender_detail/0]).

-type openapi_gender_detail() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'pokemon_species_details', list(openapi_gender_pokemon_species:openapi_gender_pokemon_species()) }
  | {'required_for_evolution', list(openapi_pokemon_species_summary:openapi_pokemon_species_summary()) }
  ].


openapi_gender_detail() ->
    openapi_gender_detail([]).

openapi_gender_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'pokemon_species_details', list(openapi_gender_pokemon_species:openapi_gender_pokemon_species()) }
            , {'required_for_evolution', list(openapi_pokemon_species_summary:openapi_pokemon_species_summary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

