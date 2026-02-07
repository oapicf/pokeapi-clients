-module(openapi_pokeathlon_stat_detail).

-export([encode/1]).

-export_type([openapi_pokeathlon_stat_detail/0]).

-type openapi_pokeathlon_stat_detail() ::
    #{ 'id' := integer(),
       'name' := binary(),
       'affecting_natures' := openapi_pokeathlon_stat_detail_affecting_natures:openapi_pokeathlon_stat_detail_affecting_natures(),
       'names' := list()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'affecting_natures' := AffectingNatures,
          'names' := Names
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'affecting_natures' => AffectingNatures,
       'names' => Names
     }.
