note
    description: "API tests for BERRIES_API"
    date: "$Date$"
    revision: "$Revision$"


class BERRIES_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_berry_firmness_list
            -- List berry firmness
            --
            -- Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.
        local
            l_response: PAGINATED_BERRY_FIRMNESS_SUMMARY_LIST
            l_limit: INTEGER_32
            l_offset: INTEGER_32
            l_q: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.berry_firmness_list(l_limit, l_offset, l_q)
            assert ("not_implemented", False)
        end

    test_berry_firmness_retrieve
            -- Get berry by firmness
            --
            -- Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.
        local
            l_response: BERRY_FIRMNESS_DETAIL
            l_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.berry_firmness_retrieve(l_id)
            assert ("not_implemented", False)
        end

    test_berry_flavor_list
            -- List berry flavors
            --
            -- Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.
        local
            l_response: PAGINATED_BERRY_FLAVOR_SUMMARY_LIST
            l_limit: INTEGER_32
            l_offset: INTEGER_32
            l_q: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.berry_flavor_list(l_limit, l_offset, l_q)
            assert ("not_implemented", False)
        end

    test_berry_flavor_retrieve
            -- Get berries by flavor
            --
            -- Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.
        local
            l_response: BERRY_FLAVOR_DETAIL
            l_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.berry_flavor_retrieve(l_id)
            assert ("not_implemented", False)
        end

    test_berry_list
            -- List berries
            --
            -- Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.
        local
            l_response: PAGINATED_BERRY_SUMMARY_LIST
            l_limit: INTEGER_32
            l_offset: INTEGER_32
            l_q: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.berry_list(l_limit, l_offset, l_q)
            assert ("not_implemented", False)
        end

    test_berry_retrieve
            -- Get a berry
            --
            -- Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.
        local
            l_response: BERRY_DETAIL
            l_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.berry_retrieve(l_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: BERRIES_API
            -- Create an object instance of `BERRIES_API'.
        once
            create { BERRIES_API } Result
        end

end
