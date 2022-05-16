note
    description: "API tests for LANGUAGE_API"
    date: "$Date$"
    revision: "$Revision$"


class LANGUAGE_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_language_list
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_limit: INTEGER_32
            l_offset: INTEGER_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.language_list(l_limit, l_offset)
            assert ("not_implemented", False)
        end

    test_language_read
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.language_read(l_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: LANGUAGE_API
            -- Create an object instance of `LANGUAGE_API'.
        once
            create { LANGUAGE_API } Result
        end

end
