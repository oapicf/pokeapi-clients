-module(openapi_machine_detail).

-export([encode/1]).

-export_type([openapi_machine_detail/0]).

-type openapi_machine_detail() ::
    #{ 'id' := integer(),
       'item' := openapi_item_summary:openapi_item_summary(),
       'version_group' := openapi_version_group_summary:openapi_version_group_summary(),
       'move' := openapi_move_summary:openapi_move_summary()
     }.

encode(#{ 'id' := Id,
          'item' := Item,
          'version_group' := VersionGroup,
          'move' := Move
        }) ->
    #{ 'id' => Id,
       'item' => Item,
       'version_group' => VersionGroup,
       'move' => Move
     }.
