note
    description: "API tests for MOVELEARNMETHOD_API"
    date: "$Date$"
    revision: "$Revision$"


class MOVELEARNMETHOD_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_move_learn_method_list
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_limit: INTEGER_32
            l_offset: INTEGER_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.move_learn_method_list(l_limit, l_offset)
            assert ("not_implemented", False)
        end

    test_move_learn_method_read
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.move_learn_method_read(l_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: MOVELEARNMETHOD_API
            -- Create an object instance of `MOVELEARNMETHOD_API'.
        once
            create { MOVELEARNMETHOD_API } Result
        end

end
