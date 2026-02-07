#ifndef move_meta_ailment_name_TEST
#define move_meta_ailment_name_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define move_meta_ailment_name_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/move_meta_ailment_name.h"
move_meta_ailment_name_t* instantiate_move_meta_ailment_name(int include_optional);

#include "test_language_summary.c"


move_meta_ailment_name_t* instantiate_move_meta_ailment_name(int include_optional) {
  move_meta_ailment_name_t* move_meta_ailment_name = NULL;
  if (include_optional) {
    move_meta_ailment_name = move_meta_ailment_name_create(
      "0",
       // false, not to have infinite recursion
      instantiate_language_summary(0)
    );
  } else {
    move_meta_ailment_name = move_meta_ailment_name_create(
      "0",
      NULL
    );
  }

  return move_meta_ailment_name;
}


#ifdef move_meta_ailment_name_MAIN

void test_move_meta_ailment_name(int include_optional) {
    move_meta_ailment_name_t* move_meta_ailment_name_1 = instantiate_move_meta_ailment_name(include_optional);

	cJSON* jsonmove_meta_ailment_name_1 = move_meta_ailment_name_convertToJSON(move_meta_ailment_name_1);
	printf("move_meta_ailment_name :\n%s\n", cJSON_Print(jsonmove_meta_ailment_name_1));
	move_meta_ailment_name_t* move_meta_ailment_name_2 = move_meta_ailment_name_parseFromJSON(jsonmove_meta_ailment_name_1);
	cJSON* jsonmove_meta_ailment_name_2 = move_meta_ailment_name_convertToJSON(move_meta_ailment_name_2);
	printf("repeating move_meta_ailment_name:\n%s\n", cJSON_Print(jsonmove_meta_ailment_name_2));
}

int main() {
  test_move_meta_ailment_name(1);
  test_move_meta_ailment_name(0);

  printf("Hello world \n");
  return 0;
}

#endif // move_meta_ailment_name_MAIN
#endif // move_meta_ailment_name_TEST
