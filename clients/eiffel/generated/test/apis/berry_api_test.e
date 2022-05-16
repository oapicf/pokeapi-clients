note
    description: "API tests for BERRY_API"
    date: "$Date$"
    revision: "$Revision$"


class BERRY_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_berry_list
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_limit: INTEGER_32
            l_offset: INTEGER_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.berry_list(l_limit, l_offset)
            assert ("not_implemented", False)
        end

    test_berry_read
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.berry_read(l_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: BERRY_API
            -- Create an object instance of `BERRY_API'.
        once
            create { BERRY_API } Result
        end

end
