note
    description: "API tests for LOCATION_API"
    date: "$Date$"
    revision: "$Revision$"


class LOCATION_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_location_area_list
            -- List location areas
            --
            -- Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
        local
            l_response: PAGINATED_LOCATION_AREA_SUMMARY_LIST
            l_limit: INTEGER_32
            l_offset: INTEGER_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.location_area_list(l_limit, l_offset)
            assert ("not_implemented", False)
        end

    test_location_area_retrieve
            -- Get location area
            --
            -- Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
        local
            l_response: LOCATION_AREA_DETAIL
            l_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.location_area_retrieve(l_id)
            assert ("not_implemented", False)
        end

    test_location_list
            -- List locations
            --
            -- Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
        local
            l_response: PAGINATED_LOCATION_SUMMARY_LIST
            l_limit: INTEGER_32
            l_offset: INTEGER_32
            l_q: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.location_list(l_limit, l_offset, l_q)
            assert ("not_implemented", False)
        end

    test_location_retrieve
            -- Get location
            --
            -- Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
        local
            l_response: LOCATION_DETAIL
            l_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.location_retrieve(l_id)
            assert ("not_implemented", False)
        end

    test_pal_park_area_list
            -- List pal park areas
            --
            -- Areas used for grouping Pokémon encounters in Pal Park. They&#39;re like habitats that are specific to Pal Park.
        local
            l_response: PAGINATED_PAL_PARK_AREA_SUMMARY_LIST
            l_limit: INTEGER_32
            l_offset: INTEGER_32
            l_q: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.pal_park_area_list(l_limit, l_offset, l_q)
            assert ("not_implemented", False)
        end

    test_pal_park_area_retrieve
            -- Get pal park area
            --
            -- Areas used for grouping Pokémon encounters in Pal Park. They&#39;re like habitats that are specific to Pal Park.
        local
            l_response: PAL_PARK_AREA_DETAIL
            l_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.pal_park_area_retrieve(l_id)
            assert ("not_implemented", False)
        end

    test_region_list
            -- List regions
            --
            -- A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
        local
            l_response: PAGINATED_REGION_SUMMARY_LIST
            l_limit: INTEGER_32
            l_offset: INTEGER_32
            l_q: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.region_list(l_limit, l_offset, l_q)
            assert ("not_implemented", False)
        end

    test_region_retrieve
            -- Get region
            --
            -- A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
        local
            l_response: REGION_DETAIL
            l_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.region_retrieve(l_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: LOCATION_API
            -- Create an object instance of `LOCATION_API'.
        once
            create { LOCATION_API } Result
        end

end
