-module(openapi_evolution_chain_link).

-include("openapi.hrl").

-export([openapi_evolution_chain_link/0]).

-export([openapi_evolution_chain_link/1]).

-export_type([openapi_evolution_chain_link/0]).

-type openapi_evolution_chain_link() ::
  [ {'is_baby', boolean() }
  | {'species', openapi_pokemon_species_summary:openapi_pokemon_species_summary() }
  | {'evolution_details', list(openapi_pokemon_evolution:openapi_pokemon_evolution()) }
  | {'evolves_to', list(openapi_evolution_chain_link:openapi_evolution_chain_link()) }
  ].


openapi_evolution_chain_link() ->
    openapi_evolution_chain_link([]).

openapi_evolution_chain_link(Fields) ->
  Default = [ {'is_baby', boolean() }
            , {'species', openapi_pokemon_species_summary:openapi_pokemon_species_summary() }
            , {'evolution_details', list(openapi_pokemon_evolution:openapi_pokemon_evolution()) }
            , {'evolves_to', list(openapi_evolution_chain_link:openapi_evolution_chain_link()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

