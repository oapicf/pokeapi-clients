-module(openapi_berry_detail_flavors_inner_flavor).

-export([encode/1]).

-export_type([openapi_berry_detail_flavors_inner_flavor/0]).

-type openapi_berry_detail_flavors_inner_flavor() ::
    #{ 'name' => binary(),
       'url' => openapi_u_ri:openapi_u_ri()
     }.

encode(#{ 'name' := Name,
          'url' := Url
        }) ->
    #{ 'name' => Name,
       'url' => Url
     }.
