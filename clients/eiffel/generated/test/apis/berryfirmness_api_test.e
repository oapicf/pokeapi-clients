note
    description: "API tests for BERRYFIRMNESS_API"
    date: "$Date$"
    revision: "$Revision$"


class BERRYFIRMNESS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_berry_firmness_list
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_limit: INTEGER_32
            l_offset: INTEGER_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.berry_firmness_list(l_limit, l_offset)
            assert ("not_implemented", False)
        end

    test_berry_firmness_read
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.berry_firmness_read(l_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: BERRYFIRMNESS_API
            -- Create an object instance of `BERRYFIRMNESS_API'.
        once
            create { BERRYFIRMNESS_API } Result
        end

end
