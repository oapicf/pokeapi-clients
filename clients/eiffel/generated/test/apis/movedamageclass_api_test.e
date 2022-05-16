note
    description: "API tests for MOVEDAMAGECLASS_API"
    date: "$Date$"
    revision: "$Revision$"


class MOVEDAMAGECLASS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_move_damage_class_list
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_limit: INTEGER_32
            l_offset: INTEGER_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.move_damage_class_list(l_limit, l_offset)
            assert ("not_implemented", False)
        end

    test_move_damage_class_read
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.move_damage_class_read(l_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: MOVEDAMAGECLASS_API
            -- Create an object instance of `MOVEDAMAGECLASS_API'.
        once
            create { MOVEDAMAGECLASS_API } Result
        end

end
