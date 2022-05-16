note
    description: "API tests for MOVE_API"
    date: "$Date$"
    revision: "$Revision$"


class MOVE_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_move_list
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_limit: INTEGER_32
            l_offset: INTEGER_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.move_list(l_limit, l_offset)
            assert ("not_implemented", False)
        end

    test_move_read
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.move_read(l_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: MOVE_API
            -- Create an object instance of `MOVE_API'.
        once
            create { MOVE_API } Result
        end

end
