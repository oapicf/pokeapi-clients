-module(openapi_move_learn_method_detail).

-export([encode/1]).

-export_type([openapi_move_learn_method_detail/0]).

-type openapi_move_learn_method_detail() ::
    #{ 'id' := integer(),
       'name' := binary(),
       'names' := list(),
       'descriptions' := list(),
       'version_groups' := list()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'names' := Names,
          'descriptions' := Descriptions,
          'version_groups' := VersionGroups
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'names' => Names,
       'descriptions' => Descriptions,
       'version_groups' => VersionGroups
     }.
