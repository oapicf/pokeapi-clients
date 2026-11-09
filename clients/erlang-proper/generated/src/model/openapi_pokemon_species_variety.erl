-module(openapi_pokemon_species_variety).

-include("openapi.hrl").

-export([openapi_pokemon_species_variety/0]).

-export([openapi_pokemon_species_variety/1]).

-export_type([openapi_pokemon_species_variety/0]).

-type openapi_pokemon_species_variety() ::
  [ {'is_default', boolean() }
  | {'pokemon', openapi_pokemon_summary:openapi_pokemon_summary() }
  ].


openapi_pokemon_species_variety() ->
    openapi_pokemon_species_variety([]).

openapi_pokemon_species_variety(Fields) ->
  Default = [ {'is_default', boolean() }
            , {'pokemon', openapi_pokemon_summary:openapi_pokemon_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

