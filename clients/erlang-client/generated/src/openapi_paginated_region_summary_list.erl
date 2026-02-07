-module(openapi_paginated_region_summary_list).

-export([encode/1]).

-export_type([openapi_paginated_region_summary_list/0]).

-type openapi_paginated_region_summary_list() ::
    #{ 'count' => integer(),
       'next' => openapi_u_ri:openapi_u_ri(),
       'previous' => openapi_u_ri:openapi_u_ri(),
       'results' => list()
     }.

encode(#{ 'count' := Count,
          'next' := Next,
          'previous' := Previous,
          'results' := Results
        }) ->
    #{ 'count' => Count,
       'next' => Next,
       'previous' => Previous,
       'results' => Results
     }.
