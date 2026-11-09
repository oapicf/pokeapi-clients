#ifndef move_combos_TEST
#define move_combos_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define move_combos_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/move_combos.h"
move_combos_t* instantiate_move_combos(int include_optional);

#include "test_move_combo_usage.c"
#include "test_move_combo_usage.c"


move_combos_t* instantiate_move_combos(int include_optional) {
  move_combos_t* move_combos = NULL;
  if (include_optional) {
    move_combos = move_combos_create(
       // false, not to have infinite recursion
      instantiate_move_combo_usage(0),
       // false, not to have infinite recursion
      instantiate_move_combo_usage(0)
    );
  } else {
    move_combos = move_combos_create(
      NULL,
      NULL
    );
  }

  return move_combos;
}


#ifdef move_combos_MAIN

void test_move_combos(int include_optional) {
    move_combos_t* move_combos_1 = instantiate_move_combos(include_optional);

	cJSON* jsonmove_combos_1 = move_combos_convertToJSON(move_combos_1);
	printf("move_combos :\n%s\n", cJSON_Print(jsonmove_combos_1));
	move_combos_t* move_combos_2 = move_combos_parseFromJSON(jsonmove_combos_1);
	cJSON* jsonmove_combos_2 = move_combos_convertToJSON(move_combos_2);
	printf("repeating move_combos:\n%s\n", cJSON_Print(jsonmove_combos_2));
}

int main() {
  test_move_combos(1);
  test_move_combos(0);

  printf("Hello world \n");
  return 0;
}

#endif // move_combos_MAIN
#endif // move_combos_TEST
