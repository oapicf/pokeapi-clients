#ifndef move_meta_TEST
#define move_meta_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define move_meta_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/move_meta.h"
move_meta_t* instantiate_move_meta(int include_optional);

#include "test_move_meta_ailment_summary.c"
#include "test_move_meta_category_summary.c"


move_meta_t* instantiate_move_meta(int include_optional) {
  move_meta_t* move_meta = NULL;
  if (include_optional) {
    move_meta = move_meta_create(
       // false, not to have infinite recursion
      instantiate_move_meta_ailment_summary(0),
       // false, not to have infinite recursion
      instantiate_move_meta_category_summary(0),
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56
    );
  } else {
    move_meta = move_meta_create(
      NULL,
      NULL,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56
    );
  }

  return move_meta;
}


#ifdef move_meta_MAIN

void test_move_meta(int include_optional) {
    move_meta_t* move_meta_1 = instantiate_move_meta(include_optional);

	cJSON* jsonmove_meta_1 = move_meta_convertToJSON(move_meta_1);
	printf("move_meta :\n%s\n", cJSON_Print(jsonmove_meta_1));
	move_meta_t* move_meta_2 = move_meta_parseFromJSON(jsonmove_meta_1);
	cJSON* jsonmove_meta_2 = move_meta_convertToJSON(move_meta_2);
	printf("repeating move_meta:\n%s\n", cJSON_Print(jsonmove_meta_2));
}

int main() {
  test_move_meta(1);
  test_move_meta(0);

  printf("Hello world \n");
  return 0;
}

#endif // move_meta_MAIN
#endif // move_meta_TEST
