#ifndef move_flavor_text_TEST
#define move_flavor_text_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define move_flavor_text_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/move_flavor_text.h"
move_flavor_text_t* instantiate_move_flavor_text(int include_optional);

#include "test_language_summary.c"
#include "test_version_group_summary.c"


move_flavor_text_t* instantiate_move_flavor_text(int include_optional) {
  move_flavor_text_t* move_flavor_text = NULL;
  if (include_optional) {
    move_flavor_text = move_flavor_text_create(
      "0",
       // false, not to have infinite recursion
      instantiate_language_summary(0),
       // false, not to have infinite recursion
      instantiate_version_group_summary(0)
    );
  } else {
    move_flavor_text = move_flavor_text_create(
      "0",
      NULL,
      NULL
    );
  }

  return move_flavor_text;
}


#ifdef move_flavor_text_MAIN

void test_move_flavor_text(int include_optional) {
    move_flavor_text_t* move_flavor_text_1 = instantiate_move_flavor_text(include_optional);

	cJSON* jsonmove_flavor_text_1 = move_flavor_text_convertToJSON(move_flavor_text_1);
	printf("move_flavor_text :\n%s\n", cJSON_Print(jsonmove_flavor_text_1));
	move_flavor_text_t* move_flavor_text_2 = move_flavor_text_parseFromJSON(jsonmove_flavor_text_1);
	cJSON* jsonmove_flavor_text_2 = move_flavor_text_convertToJSON(move_flavor_text_2);
	printf("repeating move_flavor_text:\n%s\n", cJSON_Print(jsonmove_flavor_text_2));
}

int main() {
  test_move_flavor_text(1);
  test_move_flavor_text(0);

  printf("Hello world \n");
  return 0;
}

#endif // move_flavor_text_MAIN
#endif // move_flavor_text_TEST
