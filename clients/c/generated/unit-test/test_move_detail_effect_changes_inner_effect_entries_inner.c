#ifndef move_detail_effect_changes_inner_effect_entries_inner_TEST
#define move_detail_effect_changes_inner_effect_entries_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define move_detail_effect_changes_inner_effect_entries_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/move_detail_effect_changes_inner_effect_entries_inner.h"
move_detail_effect_changes_inner_effect_entries_inner_t* instantiate_move_detail_effect_changes_inner_effect_entries_inner(int include_optional);

#include "test_ability_detail_pokemon_inner_pokemon.c"


move_detail_effect_changes_inner_effect_entries_inner_t* instantiate_move_detail_effect_changes_inner_effect_entries_inner(int include_optional) {
  move_detail_effect_changes_inner_effect_entries_inner_t* move_detail_effect_changes_inner_effect_entries_inner = NULL;
  if (include_optional) {
    move_detail_effect_changes_inner_effect_entries_inner = move_detail_effect_changes_inner_effect_entries_inner_create(
      "0",
       // false, not to have infinite recursion
      instantiate_ability_detail_pokemon_inner_pokemon(0)
    );
  } else {
    move_detail_effect_changes_inner_effect_entries_inner = move_detail_effect_changes_inner_effect_entries_inner_create(
      "0",
      NULL
    );
  }

  return move_detail_effect_changes_inner_effect_entries_inner;
}


#ifdef move_detail_effect_changes_inner_effect_entries_inner_MAIN

void test_move_detail_effect_changes_inner_effect_entries_inner(int include_optional) {
    move_detail_effect_changes_inner_effect_entries_inner_t* move_detail_effect_changes_inner_effect_entries_inner_1 = instantiate_move_detail_effect_changes_inner_effect_entries_inner(include_optional);

	cJSON* jsonmove_detail_effect_changes_inner_effect_entries_inner_1 = move_detail_effect_changes_inner_effect_entries_inner_convertToJSON(move_detail_effect_changes_inner_effect_entries_inner_1);
	printf("move_detail_effect_changes_inner_effect_entries_inner :\n%s\n", cJSON_Print(jsonmove_detail_effect_changes_inner_effect_entries_inner_1));
	move_detail_effect_changes_inner_effect_entries_inner_t* move_detail_effect_changes_inner_effect_entries_inner_2 = move_detail_effect_changes_inner_effect_entries_inner_parseFromJSON(jsonmove_detail_effect_changes_inner_effect_entries_inner_1);
	cJSON* jsonmove_detail_effect_changes_inner_effect_entries_inner_2 = move_detail_effect_changes_inner_effect_entries_inner_convertToJSON(move_detail_effect_changes_inner_effect_entries_inner_2);
	printf("repeating move_detail_effect_changes_inner_effect_entries_inner:\n%s\n", cJSON_Print(jsonmove_detail_effect_changes_inner_effect_entries_inner_2));
}

int main() {
  test_move_detail_effect_changes_inner_effect_entries_inner(1);
  test_move_detail_effect_changes_inner_effect_entries_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // move_detail_effect_changes_inner_effect_entries_inner_MAIN
#endif // move_detail_effect_changes_inner_effect_entries_inner_TEST
