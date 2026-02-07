-module(openapi_generation_detail).

-export([encode/1]).

-export_type([openapi_generation_detail/0]).

-type openapi_generation_detail() ::
    #{ 'id' := integer(),
       'name' := binary(),
       'abilities' := list(),
       'main_region' := openapi_region_summary:openapi_region_summary(),
       'moves' := list(),
       'names' := list(),
       'pokemon_species' := list(),
       'types' := list(),
       'version_groups' := list()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'abilities' := Abilities,
          'main_region' := MainRegion,
          'moves' := Moves,
          'names' := Names,
          'pokemon_species' := PokemonSpecies,
          'types' := Types,
          'version_groups' := VersionGroups
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'abilities' => Abilities,
       'main_region' => MainRegion,
       'moves' => Moves,
       'names' => Names,
       'pokemon_species' => PokemonSpecies,
       'types' => Types,
       'version_groups' => VersionGroups
     }.
