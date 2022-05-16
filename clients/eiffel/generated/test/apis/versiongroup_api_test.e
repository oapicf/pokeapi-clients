note
    description: "API tests for VERSIONGROUP_API"
    date: "$Date$"
    revision: "$Revision$"


class VERSIONGROUP_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_version_group_list
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_limit: INTEGER_32
            l_offset: INTEGER_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.version_group_list(l_limit, l_offset)
            assert ("not_implemented", False)
        end

    test_version_group_read
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.version_group_read(l_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: VERSIONGROUP_API
            -- Create an object instance of `VERSIONGROUP_API'.
        once
            create { VERSIONGROUP_API } Result
        end

end
