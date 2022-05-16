note
    description: "API tests for CONTESTTYPE_API"
    date: "$Date$"
    revision: "$Revision$"


class CONTESTTYPE_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_contest_type_list
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_limit: INTEGER_32
            l_offset: INTEGER_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.contest_type_list(l_limit, l_offset)
            assert ("not_implemented", False)
        end

    test_contest_type_read
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.contest_type_read(l_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: CONTESTTYPE_API
            -- Create an object instance of `CONTESTTYPE_API'.
        once
            create { CONTESTTYPE_API } Result
        end

end
