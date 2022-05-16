note
    description: "API tests for GROWTHRATE_API"
    date: "$Date$"
    revision: "$Revision$"


class GROWTHRATE_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_growth_rate_list
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_limit: INTEGER_32
            l_offset: INTEGER_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.growth_rate_list(l_limit, l_offset)
            assert ("not_implemented", False)
        end

    test_growth_rate_read
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.growth_rate_read(l_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: GROWTHRATE_API
            -- Create an object instance of `GROWTHRATE_API'.
        once
            create { GROWTHRATE_API } Result
        end

end
