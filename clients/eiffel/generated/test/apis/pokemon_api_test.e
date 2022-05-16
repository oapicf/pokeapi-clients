note
    description: "API tests for POKEMON_API"
    date: "$Date$"
    revision: "$Revision$"


class POKEMON_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_pokemon_list
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_limit: INTEGER_32
            l_offset: INTEGER_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.pokemon_list(l_limit, l_offset)
            assert ("not_implemented", False)
        end

    test_pokemon_read
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.pokemon_read(l_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: POKEMON_API
            -- Create an object instance of `POKEMON_API'.
        once
            create { POKEMON_API } Result
        end

end
