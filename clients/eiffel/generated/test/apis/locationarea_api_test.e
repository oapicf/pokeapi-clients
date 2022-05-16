note
    description: "API tests for LOCATIONAREA_API"
    date: "$Date$"
    revision: "$Revision$"


class LOCATIONAREA_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_location_area_list
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_limit: INTEGER_32
            l_offset: INTEGER_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.location_area_list(l_limit, l_offset)
            assert ("not_implemented", False)
        end

    test_location_area_read
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.location_area_read(l_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: LOCATIONAREA_API
            -- Create an object instance of `LOCATIONAREA_API'.
        once
            create { LOCATIONAREA_API } Result
        end

end
