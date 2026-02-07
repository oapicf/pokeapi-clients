note
    description: "API tests for MACHINES_API"
    date: "$Date$"
    revision: "$Revision$"


class MACHINES_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_machine_list
            -- List machines
            --
            -- Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
        local
            l_response: PAGINATED_MACHINE_SUMMARY_LIST
            l_limit: INTEGER_32
            l_offset: INTEGER_32
            l_q: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.machine_list(l_limit, l_offset, l_q)
            assert ("not_implemented", False)
        end

    test_machine_retrieve
            -- Get machine
            --
            -- Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
        local
            l_response: MACHINE_DETAIL
            l_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.machine_retrieve(l_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: MACHINES_API
            -- Create an object instance of `MACHINES_API'.
        once
            create { MACHINES_API } Result
        end

end
