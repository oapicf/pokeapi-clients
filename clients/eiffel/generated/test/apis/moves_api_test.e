note
    description: "API tests for MOVES_API"
    date: "$Date$"
    revision: "$Revision$"


class MOVES_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_move_ailment_list
            -- List move meta ailments
            --
            -- Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.
        local
            l_response: PAGINATED_MOVE_META_AILMENT_SUMMARY_LIST
            l_limit: INTEGER_32
            l_offset: INTEGER_32
            l_q: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.move_ailment_list(l_limit, l_offset, l_q)
            assert ("not_implemented", False)
        end

    test_move_ailment_retrieve
            -- Get move meta ailment
            --
            -- Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.
        local
            l_response: MOVE_META_AILMENT_DETAIL
            l_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.move_ailment_retrieve(l_id)
            assert ("not_implemented", False)
        end

    test_move_battle_style_list
            -- List move battle styles
            --
            -- Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.
        local
            l_response: PAGINATED_MOVE_BATTLE_STYLE_SUMMARY_LIST
            l_limit: INTEGER_32
            l_offset: INTEGER_32
            l_q: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.move_battle_style_list(l_limit, l_offset, l_q)
            assert ("not_implemented", False)
        end

    test_move_battle_style_retrieve
            -- Get move battle style
            --
            -- Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.
        local
            l_response: MOVE_BATTLE_STYLE_DETAIL
            l_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.move_battle_style_retrieve(l_id)
            assert ("not_implemented", False)
        end

    test_move_category_list
            -- List move meta categories
            --
            -- Very general categories that loosely group move effects.
        local
            l_response: PAGINATED_MOVE_META_CATEGORY_SUMMARY_LIST
            l_limit: INTEGER_32
            l_offset: INTEGER_32
            l_q: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.move_category_list(l_limit, l_offset, l_q)
            assert ("not_implemented", False)
        end

    test_move_category_retrieve
            -- Get move meta category
            --
            -- Very general categories that loosely group move effects.
        local
            l_response: MOVE_META_CATEGORY_DETAIL
            l_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.move_category_retrieve(l_id)
            assert ("not_implemented", False)
        end

    test_move_learn_method_list
            -- List move learn methods
            --
            -- Methods by which Pokémon can learn moves.
        local
            l_response: PAGINATED_MOVE_LEARN_METHOD_SUMMARY_LIST
            l_limit: INTEGER_32
            l_offset: INTEGER_32
            l_q: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.move_learn_method_list(l_limit, l_offset, l_q)
            assert ("not_implemented", False)
        end

    test_move_learn_method_retrieve
            -- Get move learn method
            --
            -- Methods by which Pokémon can learn moves.
        local
            l_response: MOVE_LEARN_METHOD_DETAIL
            l_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.move_learn_method_retrieve(l_id)
            assert ("not_implemented", False)
        end

    test_move_list
            -- List moves
            --
            -- Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.
        local
            l_response: PAGINATED_MOVE_SUMMARY_LIST
            l_limit: INTEGER_32
            l_offset: INTEGER_32
            l_q: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.move_list(l_limit, l_offset, l_q)
            assert ("not_implemented", False)
        end

    test_move_retrieve
            -- Get move
            --
            -- Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.
        local
            l_response: MOVE_DETAIL
            l_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.move_retrieve(l_id)
            assert ("not_implemented", False)
        end

    test_move_target_list
            -- List move targets
            --
            -- Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.
        local
            l_response: PAGINATED_MOVE_TARGET_SUMMARY_LIST
            l_limit: INTEGER_32
            l_offset: INTEGER_32
            l_q: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.move_target_list(l_limit, l_offset, l_q)
            assert ("not_implemented", False)
        end

    test_move_target_retrieve
            -- Get move target
            --
            -- Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.
        local
            l_response: MOVE_TARGET_DETAIL
            l_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.move_target_retrieve(l_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: MOVES_API
            -- Create an object instance of `MOVES_API'.
        once
            create { MOVES_API } Result
        end

end
