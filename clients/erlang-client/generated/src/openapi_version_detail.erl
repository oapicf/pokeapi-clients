-module(openapi_version_detail).

-export([encode/1]).

-export_type([openapi_version_detail/0]).

-type openapi_version_detail() ::
    #{ 'id' := integer(),
       'name' := binary(),
       'names' := list(),
       'version_group' := openapi_version_group_summary:openapi_version_group_summary()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'names' := Names,
          'version_group' := VersionGroup
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'names' => Names,
       'version_group' => VersionGroup
     }.
