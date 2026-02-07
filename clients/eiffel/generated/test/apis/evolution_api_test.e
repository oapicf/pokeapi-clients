note
    description: "API tests for EVOLUTION_API"
    date: "$Date$"
    revision: "$Revision$"


class EVOLUTION_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_evolution_chain_list
            -- List evolution chains
            --
            -- Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.
        local
            l_response: PAGINATED_EVOLUTION_CHAIN_SUMMARY_LIST
            l_limit: INTEGER_32
            l_offset: INTEGER_32
            l_q: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.evolution_chain_list(l_limit, l_offset, l_q)
            assert ("not_implemented", False)
        end

    test_evolution_chain_retrieve
            -- Get evolution chain
            --
            -- Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.
        local
            l_response: EVOLUTION_CHAIN_DETAIL
            l_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.evolution_chain_retrieve(l_id)
            assert ("not_implemented", False)
        end

    test_evolution_trigger_list
            -- List evolution triggers
            --
            -- Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.
        local
            l_response: PAGINATED_EVOLUTION_TRIGGER_SUMMARY_LIST
            l_limit: INTEGER_32
            l_offset: INTEGER_32
            l_q: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.evolution_trigger_list(l_limit, l_offset, l_q)
            assert ("not_implemented", False)
        end

    test_evolution_trigger_retrieve
            -- Get evolution trigger
            --
            -- Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.
        local
            l_response: EVOLUTION_TRIGGER_DETAIL
            l_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.evolution_trigger_retrieve(l_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: EVOLUTION_API
            -- Create an object instance of `EVOLUTION_API'.
        once
            create { EVOLUTION_API } Result
        end

end
