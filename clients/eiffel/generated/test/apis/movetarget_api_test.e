note
    description: "API tests for MOVETARGET_API"
    date: "$Date$"
    revision: "$Revision$"


class MOVETARGET_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_move_target_list
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_limit: INTEGER_32
            l_offset: INTEGER_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.move_target_list(l_limit, l_offset)
            assert ("not_implemented", False)
        end

    test_move_target_read
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.move_target_read(l_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: MOVETARGET_API
            -- Create an object instance of `MOVETARGET_API'.
        once
            create { MOVETARGET_API } Result
        end

end
