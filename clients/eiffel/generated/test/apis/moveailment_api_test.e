note
    description: "API tests for MOVEAILMENT_API"
    date: "$Date$"
    revision: "$Revision$"


class MOVEAILMENT_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_move_ailment_list
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_limit: INTEGER_32
            l_offset: INTEGER_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.move_ailment_list(l_limit, l_offset)
            assert ("not_implemented", False)
        end

    test_move_ailment_read
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.move_ailment_read(l_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: MOVEAILMENT_API
            -- Create an object instance of `MOVEAILMENT_API'.
        once
            create { MOVEAILMENT_API } Result
        end

end
