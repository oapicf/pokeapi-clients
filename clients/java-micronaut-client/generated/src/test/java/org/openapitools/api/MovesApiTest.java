package org.openapitools.api;

import org.openapitools.model.MoveBattleStyleDetail;
import org.openapitools.model.MoveDetail;
import org.openapitools.model.MoveLearnMethodDetail;
import org.openapitools.model.MoveMetaAilmentDetail;
import org.openapitools.model.MoveMetaCategoryDetail;
import org.openapitools.model.MoveTargetDetail;
import org.openapitools.model.PaginatedMoveBattleStyleSummaryList;
import org.openapitools.model.PaginatedMoveLearnMethodSummaryList;
import org.openapitools.model.PaginatedMoveMetaAilmentSummaryList;
import org.openapitools.model.PaginatedMoveMetaCategorySummaryList;
import org.openapitools.model.PaginatedMoveSummaryList;
import org.openapitools.model.PaginatedMoveTargetSummaryList;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

/**
 * API tests for MovesApi
 */
@MicronautTest
public class MovesApiTest {

    @Inject
    MovesApi api;

    
    /**
     * List move meta ailments
     *
     * Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.
     */
    @Test
    @Disabled("Not Implemented")
    public void moveAilmentListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedMoveMetaAilmentSummaryList body = api.moveAilmentList(limit, offset, q).block();

        // then
        // TODO implement the moveAilmentListTest()
    }

    
    /**
     * Get move meta ailment
     *
     * Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.
     */
    @Test
    @Disabled("Not Implemented")
    public void moveAilmentRetrieveTest() {
        // given
        String id = "example";

        // when
        MoveMetaAilmentDetail body = api.moveAilmentRetrieve(id).block();

        // then
        // TODO implement the moveAilmentRetrieveTest()
    }

    
    /**
     * List move battle styles
     *
     * Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.
     */
    @Test
    @Disabled("Not Implemented")
    public void moveBattleStyleListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedMoveBattleStyleSummaryList body = api.moveBattleStyleList(limit, offset, q).block();

        // then
        // TODO implement the moveBattleStyleListTest()
    }

    
    /**
     * Get move battle style
     *
     * Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.
     */
    @Test
    @Disabled("Not Implemented")
    public void moveBattleStyleRetrieveTest() {
        // given
        String id = "example";

        // when
        MoveBattleStyleDetail body = api.moveBattleStyleRetrieve(id).block();

        // then
        // TODO implement the moveBattleStyleRetrieveTest()
    }

    
    /**
     * List move meta categories
     *
     * Very general categories that loosely group move effects.
     */
    @Test
    @Disabled("Not Implemented")
    public void moveCategoryListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedMoveMetaCategorySummaryList body = api.moveCategoryList(limit, offset, q).block();

        // then
        // TODO implement the moveCategoryListTest()
    }

    
    /**
     * Get move meta category
     *
     * Very general categories that loosely group move effects.
     */
    @Test
    @Disabled("Not Implemented")
    public void moveCategoryRetrieveTest() {
        // given
        String id = "example";

        // when
        MoveMetaCategoryDetail body = api.moveCategoryRetrieve(id).block();

        // then
        // TODO implement the moveCategoryRetrieveTest()
    }

    
    /**
     * List move learn methods
     *
     * Methods by which Pokémon can learn moves.
     */
    @Test
    @Disabled("Not Implemented")
    public void moveLearnMethodListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedMoveLearnMethodSummaryList body = api.moveLearnMethodList(limit, offset, q).block();

        // then
        // TODO implement the moveLearnMethodListTest()
    }

    
    /**
     * Get move learn method
     *
     * Methods by which Pokémon can learn moves.
     */
    @Test
    @Disabled("Not Implemented")
    public void moveLearnMethodRetrieveTest() {
        // given
        String id = "example";

        // when
        MoveLearnMethodDetail body = api.moveLearnMethodRetrieve(id).block();

        // then
        // TODO implement the moveLearnMethodRetrieveTest()
    }

    
    /**
     * List moves
     *
     * Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.
     */
    @Test
    @Disabled("Not Implemented")
    public void moveListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedMoveSummaryList body = api.moveList(limit, offset, q).block();

        // then
        // TODO implement the moveListTest()
    }

    
    /**
     * Get move
     *
     * Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.
     */
    @Test
    @Disabled("Not Implemented")
    public void moveRetrieveTest() {
        // given
        String id = "example";

        // when
        MoveDetail body = api.moveRetrieve(id).block();

        // then
        // TODO implement the moveRetrieveTest()
    }

    
    /**
     * List move targets
     *
     * Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.
     */
    @Test
    @Disabled("Not Implemented")
    public void moveTargetListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedMoveTargetSummaryList body = api.moveTargetList(limit, offset, q).block();

        // then
        // TODO implement the moveTargetListTest()
    }

    
    /**
     * Get move target
     *
     * Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.
     */
    @Test
    @Disabled("Not Implemented")
    public void moveTargetRetrieveTest() {
        // given
        String id = "example";

        // when
        MoveTargetDetail body = api.moveTargetRetrieve(id).block();

        // then
        // TODO implement the moveTargetRetrieveTest()
    }

    
}
