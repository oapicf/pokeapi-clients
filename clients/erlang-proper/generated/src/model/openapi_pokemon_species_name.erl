-module(openapi_pokemon_species_name).

-include("openapi.hrl").

-export([openapi_pokemon_species_name/0]).

-export([openapi_pokemon_species_name/1]).

-export_type([openapi_pokemon_species_name/0]).

-type openapi_pokemon_species_name() ::
  [ {'name', binary() }
  | {'language', openapi_language_summary:openapi_language_summary() }
  ].


openapi_pokemon_species_name() ->
    openapi_pokemon_species_name([]).

openapi_pokemon_species_name(Fields) ->
  Default = [ {'name', binary() }
            , {'language', openapi_language_summary:openapi_language_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

