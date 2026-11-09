-module(openapi_pokemon_species_variety).

-export([encode/1]).

-export_type([openapi_pokemon_species_variety/0]).

-type openapi_pokemon_species_variety() ::
    #{ 'is_default' := boolean(),
       'pokemon' := openapi_pokemon_summary:openapi_pokemon_summary()
     }.

encode(#{ 'is_default' := IsDefault,
          'pokemon' := Pokemon
        }) ->
    #{ 'is_default' => IsDefault,
       'pokemon' => Pokemon
     }.
