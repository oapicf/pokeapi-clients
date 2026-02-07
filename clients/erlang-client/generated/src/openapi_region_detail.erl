-module(openapi_region_detail).

-export([encode/1]).

-export_type([openapi_region_detail/0]).

-type openapi_region_detail() ::
    #{ 'id' := integer(),
       'name' := binary(),
       'locations' := list(),
       'main_generation' := openapi_generation_summary:openapi_generation_summary(),
       'names' := list(),
       'pokedexes' := list(),
       'version_groups' := list()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'locations' := Locations,
          'main_generation' := MainGeneration,
          'names' := Names,
          'pokedexes' := Pokedexes,
          'version_groups' := VersionGroups
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'locations' => Locations,
       'main_generation' => MainGeneration,
       'names' => Names,
       'pokedexes' => Pokedexes,
       'version_groups' => VersionGroups
     }.
