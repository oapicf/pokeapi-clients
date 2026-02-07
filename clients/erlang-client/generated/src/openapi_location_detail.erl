-module(openapi_location_detail).

-export([encode/1]).

-export_type([openapi_location_detail/0]).

-type openapi_location_detail() ::
    #{ 'id' := integer(),
       'name' := binary(),
       'region' := openapi_region_summary:openapi_region_summary(),
       'names' := list(),
       'game_indices' := list(),
       'areas' := list()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'region' := Region,
          'names' := Names,
          'game_indices' := GameIndices,
          'areas' := Areas
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'region' => Region,
       'names' => Names,
       'game_indices' => GameIndices,
       'areas' => Areas
     }.
