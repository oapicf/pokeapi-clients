note
    description: "API tests for EVOLUTIONTRIGGER_API"
    date: "$Date$"
    revision: "$Revision$"


class EVOLUTIONTRIGGER_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_evolution_trigger_list
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_limit: INTEGER_32
            l_offset: INTEGER_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.evolution_trigger_list(l_limit, l_offset)
            assert ("not_implemented", False)
        end

    test_evolution_trigger_read
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.evolution_trigger_read(l_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: EVOLUTIONTRIGGER_API
            -- Create an object instance of `EVOLUTIONTRIGGER_API'.
        once
            create { EVOLUTIONTRIGGER_API } Result
        end

end
