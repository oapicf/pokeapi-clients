#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/move_battle_style_detail.h"
#include "../model/move_detail.h"
#include "../model/move_learn_method_detail.h"
#include "../model/move_meta_ailment_detail.h"
#include "../model/move_meta_category_detail.h"
#include "../model/move_target_detail.h"
#include "../model/paginated_move_battle_style_summary_list.h"
#include "../model/paginated_move_learn_method_summary_list.h"
#include "../model/paginated_move_meta_ailment_summary_list.h"
#include "../model/paginated_move_meta_category_summary_list.h"
#include "../model/paginated_move_summary_list.h"
#include "../model/paginated_move_target_summary_list.h"


// List move meta ailments
//
// Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.
//
paginated_move_meta_ailment_summary_list_t*
MovesAPI_moveAilmentList(apiClient_t *apiClient, int *limit, int *offset, char *q);


// Get move meta ailment
//
// Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.
//
move_meta_ailment_detail_t*
MovesAPI_moveAilmentRetrieve(apiClient_t *apiClient, char *id);


// List move battle styles
//
// Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.
//
paginated_move_battle_style_summary_list_t*
MovesAPI_moveBattleStyleList(apiClient_t *apiClient, int *limit, int *offset, char *q);


// Get move battle style
//
// Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.
//
move_battle_style_detail_t*
MovesAPI_moveBattleStyleRetrieve(apiClient_t *apiClient, char *id);


// List move meta categories
//
// Very general categories that loosely group move effects.
//
paginated_move_meta_category_summary_list_t*
MovesAPI_moveCategoryList(apiClient_t *apiClient, int *limit, int *offset, char *q);


// Get move meta category
//
// Very general categories that loosely group move effects.
//
move_meta_category_detail_t*
MovesAPI_moveCategoryRetrieve(apiClient_t *apiClient, char *id);


// List move learn methods
//
// Methods by which Pokémon can learn moves.
//
paginated_move_learn_method_summary_list_t*
MovesAPI_moveLearnMethodList(apiClient_t *apiClient, int *limit, int *offset, char *q);


// Get move learn method
//
// Methods by which Pokémon can learn moves.
//
move_learn_method_detail_t*
MovesAPI_moveLearnMethodRetrieve(apiClient_t *apiClient, char *id);


// List moves
//
// Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.
//
paginated_move_summary_list_t*
MovesAPI_moveList(apiClient_t *apiClient, int *limit, int *offset, char *q);


// Get move
//
// Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.
//
move_detail_t*
MovesAPI_moveRetrieve(apiClient_t *apiClient, char *id);


// List move targets
//
// Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.
//
paginated_move_target_summary_list_t*
MovesAPI_moveTargetList(apiClient_t *apiClient, int *limit, int *offset, char *q);


// Get move target
//
// Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.
//
move_target_detail_t*
MovesAPI_moveTargetRetrieve(apiClient_t *apiClient, char *id);


