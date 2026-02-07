-module(openapi_berry_flavor_detail_berries_inner_berry).

-export([encode/1]).

-export_type([openapi_berry_flavor_detail_berries_inner_berry/0]).

-type openapi_berry_flavor_detail_berries_inner_berry() ::
    #{ 'name' => binary(),
       'url' => openapi_u_ri:openapi_u_ri()
     }.

encode(#{ 'name' := Name,
          'url' := Url
        }) ->
    #{ 'name' => Name,
       'url' => Url
     }.
