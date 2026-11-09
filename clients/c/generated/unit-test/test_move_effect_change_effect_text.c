#ifndef move_effect_change_effect_text_TEST
#define move_effect_change_effect_text_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define move_effect_change_effect_text_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/move_effect_change_effect_text.h"
move_effect_change_effect_text_t* instantiate_move_effect_change_effect_text(int include_optional);

#include "test_language_summary.c"


move_effect_change_effect_text_t* instantiate_move_effect_change_effect_text(int include_optional) {
  move_effect_change_effect_text_t* move_effect_change_effect_text = NULL;
  if (include_optional) {
    move_effect_change_effect_text = move_effect_change_effect_text_create(
      "0",
       // false, not to have infinite recursion
      instantiate_language_summary(0)
    );
  } else {
    move_effect_change_effect_text = move_effect_change_effect_text_create(
      "0",
      NULL
    );
  }

  return move_effect_change_effect_text;
}


#ifdef move_effect_change_effect_text_MAIN

void test_move_effect_change_effect_text(int include_optional) {
    move_effect_change_effect_text_t* move_effect_change_effect_text_1 = instantiate_move_effect_change_effect_text(include_optional);

	cJSON* jsonmove_effect_change_effect_text_1 = move_effect_change_effect_text_convertToJSON(move_effect_change_effect_text_1);
	printf("move_effect_change_effect_text :\n%s\n", cJSON_Print(jsonmove_effect_change_effect_text_1));
	move_effect_change_effect_text_t* move_effect_change_effect_text_2 = move_effect_change_effect_text_parseFromJSON(jsonmove_effect_change_effect_text_1);
	cJSON* jsonmove_effect_change_effect_text_2 = move_effect_change_effect_text_convertToJSON(move_effect_change_effect_text_2);
	printf("repeating move_effect_change_effect_text:\n%s\n", cJSON_Print(jsonmove_effect_change_effect_text_2));
}

int main() {
  test_move_effect_change_effect_text(1);
  test_move_effect_change_effect_text(0);

  printf("Hello world \n");
  return 0;
}

#endif // move_effect_change_effect_text_MAIN
#endif // move_effect_change_effect_text_TEST
