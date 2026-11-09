-module(openapi_item_machine).

-export([encode/1]).

-export_type([openapi_item_machine/0]).

-type openapi_item_machine() ::
    #{ 'machine' := openapi_machine_summary:openapi_machine_summary(),
       'version_group' := openapi_version_group_summary:openapi_version_group_summary()
     }.

encode(#{ 'machine' := Machine,
          'version_group' := VersionGroup
        }) ->
    #{ 'machine' => Machine,
       'version_group' => VersionGroup
     }.
