-module(openapi_pokemon_species_genus).

-include("openapi.hrl").

-export([openapi_pokemon_species_genus/0]).

-export([openapi_pokemon_species_genus/1]).

-export_type([openapi_pokemon_species_genus/0]).

-type openapi_pokemon_species_genus() ::
  [ {'genus', binary() }
  | {'language', openapi_language_summary:openapi_language_summary() }
  ].


openapi_pokemon_species_genus() ->
    openapi_pokemon_species_genus([]).

openapi_pokemon_species_genus(Fields) ->
  Default = [ {'genus', binary() }
            , {'language', openapi_language_summary:openapi_language_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

