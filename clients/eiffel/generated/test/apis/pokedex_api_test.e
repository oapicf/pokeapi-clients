note
    description: "API tests for POKEDEX_API"
    date: "$Date$"
    revision: "$Revision$"


class POKEDEX_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_pokedex_list
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_limit: INTEGER_32
            l_offset: INTEGER_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.pokedex_list(l_limit, l_offset)
            assert ("not_implemented", False)
        end

    test_pokedex_read
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.pokedex_read(l_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: POKEDEX_API
            -- Create an object instance of `POKEDEX_API'.
        once
            create { POKEDEX_API } Result
        end

end
