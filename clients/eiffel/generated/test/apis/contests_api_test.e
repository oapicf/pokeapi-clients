note
    description: "API tests for CONTESTS_API"
    date: "$Date$"
    revision: "$Revision$"


class CONTESTS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_contest_effect_list
            -- List contest effects
            --
            -- Contest effects refer to the effects of moves when used in contests.
        local
            l_response: PAGINATED_CONTEST_EFFECT_SUMMARY_LIST
            l_limit: INTEGER_32
            l_offset: INTEGER_32
            l_q: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.contest_effect_list(l_limit, l_offset, l_q)
            assert ("not_implemented", False)
        end

    test_contest_effect_retrieve
            -- Get contest effect
            --
            -- Contest effects refer to the effects of moves when used in contests.
        local
            l_response: CONTEST_EFFECT_DETAIL
            l_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.contest_effect_retrieve(l_id)
            assert ("not_implemented", False)
        end

    test_contest_type_list
            -- List contest types
            --
            -- Contest types are categories judges used to weigh a Pokémon&#39;s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
        local
            l_response: PAGINATED_CONTEST_TYPE_SUMMARY_LIST
            l_limit: INTEGER_32
            l_offset: INTEGER_32
            l_q: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.contest_type_list(l_limit, l_offset, l_q)
            assert ("not_implemented", False)
        end

    test_contest_type_retrieve
            -- Get contest type
            --
            -- Contest types are categories judges used to weigh a Pokémon&#39;s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
        local
            l_response: CONTEST_TYPE_DETAIL
            l_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.contest_type_retrieve(l_id)
            assert ("not_implemented", False)
        end

    test_super_contest_effect_list
            -- List super contest effects
            --
            -- Super contest effects refer to the effects of moves when used in super contests.
        local
            l_response: PAGINATED_SUPER_CONTEST_EFFECT_SUMMARY_LIST
            l_limit: INTEGER_32
            l_offset: INTEGER_32
            l_q: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.super_contest_effect_list(l_limit, l_offset, l_q)
            assert ("not_implemented", False)
        end

    test_super_contest_effect_retrieve
            -- Get super contest effect
            --
            -- Super contest effects refer to the effects of moves when used in super contests.
        local
            l_response: SUPER_CONTEST_EFFECT_DETAIL
            l_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.super_contest_effect_retrieve(l_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: CONTESTS_API
            -- Create an object instance of `CONTESTS_API'.
        once
            create { CONTESTS_API } Result
        end

end
