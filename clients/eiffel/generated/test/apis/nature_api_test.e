note
    description: "API tests for NATURE_API"
    date: "$Date$"
    revision: "$Revision$"


class NATURE_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_nature_list
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_limit: INTEGER_32
            l_offset: INTEGER_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.nature_list(l_limit, l_offset)
            assert ("not_implemented", False)
        end

    test_nature_read
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.nature_read(l_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: NATURE_API
            -- Create an object instance of `NATURE_API'.
        once
            create { NATURE_API } Result
        end

end
