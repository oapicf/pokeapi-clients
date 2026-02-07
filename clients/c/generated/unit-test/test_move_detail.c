#ifndef move_detail_TEST
#define move_detail_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define move_detail_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/move_detail.h"
move_detail_t* instantiate_move_detail(int include_optional);

#include "test_move_detail_contest_combos.c"
#include "test_contest_type_summary.c"
#include "test_contest_effect_summary.c"
#include "test_move_damage_class_summary.c"
#include "test_generation_summary.c"
#include "test_move_meta.c"
#include "test_super_contest_effect_summary.c"
#include "test_move_target_summary.c"
#include "test_type_summary.c"


move_detail_t* instantiate_move_detail(int include_optional) {
  move_detail_t* move_detail = NULL;
  if (include_optional) {
    move_detail = move_detail_create(
      56,
      "0",
      56,
      56,
      56,
      56,
      56,
       // false, not to have infinite recursion
      instantiate_move_detail_contest_combos(0),
       // false, not to have infinite recursion
      instantiate_contest_type_summary(0),
       // false, not to have infinite recursion
      instantiate_contest_effect_summary(0),
       // false, not to have infinite recursion
      instantiate_move_damage_class_summary(0),
      list_createList(),
      list_createList(),
       // false, not to have infinite recursion
      instantiate_generation_summary(0),
       // false, not to have infinite recursion
      instantiate_move_meta(0),
      list_createList(),
      list_createList(),
      list_createList(),
       // false, not to have infinite recursion
      instantiate_super_contest_effect_summary(0),
       // false, not to have infinite recursion
      instantiate_move_target_summary(0),
       // false, not to have infinite recursion
      instantiate_type_summary(0),
      list_createList(),
      list_createList(),
      list_createList()
    );
  } else {
    move_detail = move_detail_create(
      56,
      "0",
      56,
      56,
      56,
      56,
      56,
      NULL,
      NULL,
      NULL,
      NULL,
      list_createList(),
      list_createList(),
      NULL,
      NULL,
      list_createList(),
      list_createList(),
      list_createList(),
      NULL,
      NULL,
      NULL,
      list_createList(),
      list_createList(),
      list_createList()
    );
  }

  return move_detail;
}


#ifdef move_detail_MAIN

void test_move_detail(int include_optional) {
    move_detail_t* move_detail_1 = instantiate_move_detail(include_optional);

	cJSON* jsonmove_detail_1 = move_detail_convertToJSON(move_detail_1);
	printf("move_detail :\n%s\n", cJSON_Print(jsonmove_detail_1));
	move_detail_t* move_detail_2 = move_detail_parseFromJSON(jsonmove_detail_1);
	cJSON* jsonmove_detail_2 = move_detail_convertToJSON(move_detail_2);
	printf("repeating move_detail:\n%s\n", cJSON_Print(jsonmove_detail_2));
}

int main() {
  test_move_detail(1);
  test_move_detail(0);

  printf("Hello world \n");
  return 0;
}

#endif // move_detail_MAIN
#endif // move_detail_TEST
