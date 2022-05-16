note
    description: "API tests for ABILITY_API"
    date: "$Date$"
    revision: "$Revision$"


class ABILITY_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_ability_list
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_limit: INTEGER_32
            l_offset: INTEGER_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.ability_list(l_limit, l_offset)
            assert ("not_implemented", False)
        end

    test_ability_read
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.ability_read(l_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: ABILITY_API
            -- Create an object instance of `ABILITY_API'.
        once
            create { ABILITY_API } Result
        end

end
