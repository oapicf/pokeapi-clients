#ifndef move_learn_method_description_TEST
#define move_learn_method_description_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define move_learn_method_description_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/move_learn_method_description.h"
move_learn_method_description_t* instantiate_move_learn_method_description(int include_optional);

#include "test_language_summary.c"


move_learn_method_description_t* instantiate_move_learn_method_description(int include_optional) {
  move_learn_method_description_t* move_learn_method_description = NULL;
  if (include_optional) {
    move_learn_method_description = move_learn_method_description_create(
      "0",
       // false, not to have infinite recursion
      instantiate_language_summary(0)
    );
  } else {
    move_learn_method_description = move_learn_method_description_create(
      "0",
      NULL
    );
  }

  return move_learn_method_description;
}


#ifdef move_learn_method_description_MAIN

void test_move_learn_method_description(int include_optional) {
    move_learn_method_description_t* move_learn_method_description_1 = instantiate_move_learn_method_description(include_optional);

	cJSON* jsonmove_learn_method_description_1 = move_learn_method_description_convertToJSON(move_learn_method_description_1);
	printf("move_learn_method_description :\n%s\n", cJSON_Print(jsonmove_learn_method_description_1));
	move_learn_method_description_t* move_learn_method_description_2 = move_learn_method_description_parseFromJSON(jsonmove_learn_method_description_1);
	cJSON* jsonmove_learn_method_description_2 = move_learn_method_description_convertToJSON(move_learn_method_description_2);
	printf("repeating move_learn_method_description:\n%s\n", cJSON_Print(jsonmove_learn_method_description_2));
}

int main() {
  test_move_learn_method_description(1);
  test_move_learn_method_description(0);

  printf("Hello world \n");
  return 0;
}

#endif // move_learn_method_description_MAIN
#endif // move_learn_method_description_TEST
