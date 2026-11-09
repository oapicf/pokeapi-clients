-module(openapi_gender_pokemon_species).

-include("openapi.hrl").

-export([openapi_gender_pokemon_species/0]).

-export([openapi_gender_pokemon_species/1]).

-export_type([openapi_gender_pokemon_species/0]).

-type openapi_gender_pokemon_species() ::
  [ {'rate', integer() }
  | {'pokemon_species', openapi_pokemon_species_summary:openapi_pokemon_species_summary() }
  ].


openapi_gender_pokemon_species() ->
    openapi_gender_pokemon_species([]).

openapi_gender_pokemon_species(Fields) ->
  Default = [ {'rate', integer() }
            , {'pokemon_species', openapi_pokemon_species_summary:openapi_pokemon_species_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

