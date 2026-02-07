-module(openapi_pokedex_detail).

-export([encode/1]).

-export_type([openapi_pokedex_detail/0]).

-type openapi_pokedex_detail() ::
    #{ 'id' := integer(),
       'name' := binary(),
       'is_main_series' => boolean(),
       'descriptions' := list(),
       'names' := list(),
       'pokemon_entries' := list(),
       'region' := openapi_region_summary:openapi_region_summary(),
       'version_groups' := list()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'is_main_series' := IsMainSeries,
          'descriptions' := Descriptions,
          'names' := Names,
          'pokemon_entries' := PokemonEntries,
          'region' := Region,
          'version_groups' := VersionGroups
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'is_main_series' => IsMainSeries,
       'descriptions' => Descriptions,
       'names' => Names,
       'pokemon_entries' => PokemonEntries,
       'region' => Region,
       'version_groups' => VersionGroups
     }.
