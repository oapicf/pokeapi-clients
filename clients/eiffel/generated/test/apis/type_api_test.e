note
    description: "API tests for TYPE_API"
    date: "$Date$"
    revision: "$Revision$"


class TYPE_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_type_list
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_limit: INTEGER_32
            l_offset: INTEGER_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.type_list(l_limit, l_offset)
            assert ("not_implemented", False)
        end

    test_type_read
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.type_read(l_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: TYPE_API
            -- Create an object instance of `TYPE_API'.
        once
            create { TYPE_API } Result
        end

end
