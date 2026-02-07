note
    description: "API tests for ENCOUNTERS_API"
    date: "$Date$"
    revision: "$Revision$"


class ENCOUNTERS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_encounter_condition_list
            -- List encounter conditions
            --
            -- Conditions which affect what pokemon might appear in the wild, e.g., day or night.
        local
            l_response: PAGINATED_ENCOUNTER_CONDITION_SUMMARY_LIST
            l_limit: INTEGER_32
            l_offset: INTEGER_32
            l_q: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.encounter_condition_list(l_limit, l_offset, l_q)
            assert ("not_implemented", False)
        end

    test_encounter_condition_retrieve
            -- Get encounter condition
            --
            -- Conditions which affect what pokemon might appear in the wild, e.g., day or night.
        local
            l_response: ENCOUNTER_CONDITION_DETAIL
            l_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.encounter_condition_retrieve(l_id)
            assert ("not_implemented", False)
        end

    test_encounter_condition_value_list
            -- List encounter condition values
            --
            -- Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
        local
            l_response: PAGINATED_ENCOUNTER_CONDITION_VALUE_SUMMARY_LIST
            l_limit: INTEGER_32
            l_offset: INTEGER_32
            l_q: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.encounter_condition_value_list(l_limit, l_offset, l_q)
            assert ("not_implemented", False)
        end

    test_encounter_condition_value_retrieve
            -- Get encounter condition value
            --
            -- Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
        local
            l_response: ENCOUNTER_CONDITION_VALUE_DETAIL
            l_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.encounter_condition_value_retrieve(l_id)
            assert ("not_implemented", False)
        end

    test_encounter_method_list
            -- List encounter methods
            --
            -- Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
        local
            l_response: PAGINATED_ENCOUNTER_METHOD_SUMMARY_LIST
            l_limit: INTEGER_32
            l_offset: INTEGER_32
            l_q: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.encounter_method_list(l_limit, l_offset, l_q)
            assert ("not_implemented", False)
        end

    test_encounter_method_retrieve
            -- Get encounter method
            --
            -- Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
        local
            l_response: ENCOUNTER_METHOD_DETAIL
            l_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.encounter_method_retrieve(l_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: ENCOUNTERS_API
            -- Create an object instance of `ENCOUNTERS_API'.
        once
            create { ENCOUNTERS_API } Result
        end

end
