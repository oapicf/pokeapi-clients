note
    description: "API tests for GENDER_API"
    date: "$Date$"
    revision: "$Revision$"


class GENDER_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_gender_list
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_limit: INTEGER_32
            l_offset: INTEGER_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.gender_list(l_limit, l_offset)
            assert ("not_implemented", False)
        end

    test_gender_read
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.gender_read(l_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: GENDER_API
            -- Create an object instance of `GENDER_API'.
        once
            create { GENDER_API } Result
        end

end
