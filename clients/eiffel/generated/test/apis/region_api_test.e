note
    description: "API tests for REGION_API"
    date: "$Date$"
    revision: "$Revision$"


class REGION_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_region_list
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_limit: INTEGER_32
            l_offset: INTEGER_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.region_list(l_limit, l_offset)
            assert ("not_implemented", False)
        end

    test_region_read
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.region_read(l_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: REGION_API
            -- Create an object instance of `REGION_API'.
        once
            create { REGION_API } Result
        end

end
