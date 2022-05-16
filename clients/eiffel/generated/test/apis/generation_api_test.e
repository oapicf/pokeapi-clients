note
    description: "API tests for GENERATION_API"
    date: "$Date$"
    revision: "$Revision$"


class GENERATION_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_generation_list
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_limit: INTEGER_32
            l_offset: INTEGER_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.generation_list(l_limit, l_offset)
            assert ("not_implemented", False)
        end

    test_generation_read
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.generation_read(l_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: GENERATION_API
            -- Create an object instance of `GENERATION_API'.
        once
            create { GENERATION_API } Result
        end

end
