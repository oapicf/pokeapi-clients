-module(openapi_version_group_detail).

-export([encode/1]).

-export_type([openapi_version_group_detail/0]).

-type openapi_version_group_detail() ::
    #{ 'id' := integer(),
       'name' := binary(),
       'order' => integer(),
       'generation' := openapi_generation_summary:openapi_generation_summary(),
       'move_learn_methods' := list(),
       'pokedexes' := list(),
       'regions' := list(),
       'versions' := list()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'order' := Order,
          'generation' := Generation,
          'move_learn_methods' := MoveLearnMethods,
          'pokedexes' := Pokedexes,
          'regions' := Regions,
          'versions' := Versions
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'order' => Order,
       'generation' => Generation,
       'move_learn_methods' => MoveLearnMethods,
       'pokedexes' => Pokedexes,
       'regions' => Regions,
       'versions' => Versions
     }.
