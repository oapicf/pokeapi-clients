note
    description: "API tests for UTILITY_API"
    date: "$Date$"
    revision: "$Revision$"


class UTILITY_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_language_list
            -- List languages
            --
            -- Languages for translations of API resource information.
        local
            l_response: PAGINATED_LANGUAGE_SUMMARY_LIST
            l_limit: INTEGER_32
            l_offset: INTEGER_32
            l_q: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.language_list(l_limit, l_offset, l_q)
            assert ("not_implemented", False)
        end

    test_language_retrieve
            -- Get language
            --
            -- Languages for translations of API resource information.
        local
            l_response: LANGUAGE_DETAIL
            l_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.language_retrieve(l_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: UTILITY_API
            -- Create an object instance of `UTILITY_API'.
        once
            create { UTILITY_API } Result
        end

end
