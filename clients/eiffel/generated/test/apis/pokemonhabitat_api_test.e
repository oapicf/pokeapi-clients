note
    description: "API tests for POKEMONHABITAT_API"
    date: "$Date$"
    revision: "$Revision$"


class POKEMONHABITAT_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_pokemon_habitat_list
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_limit: INTEGER_32
            l_offset: INTEGER_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.pokemon_habitat_list(l_limit, l_offset)
            assert ("not_implemented", False)
        end

    test_pokemon_habitat_read
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.pokemon_habitat_read(l_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: POKEMONHABITAT_API
            -- Create an object instance of `POKEMONHABITAT_API'.
        once
            create { POKEMONHABITAT_API } Result
        end

end
