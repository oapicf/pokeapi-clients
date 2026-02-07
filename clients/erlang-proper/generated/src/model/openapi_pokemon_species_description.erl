-module(openapi_pokemon_species_description).

-include("openapi.hrl").

-export([openapi_pokemon_species_description/0]).

-export([openapi_pokemon_species_description/1]).

-export_type([openapi_pokemon_species_description/0]).

-type openapi_pokemon_species_description() ::
  [ {'description', binary() }
  | {'language', openapi_language_summary:openapi_language_summary() }
  ].


openapi_pokemon_species_description() ->
    openapi_pokemon_species_description([]).

openapi_pokemon_species_description(Fields) ->
  Default = [ {'description', binary() }
            , {'language', openapi_language_summary:openapi_language_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

