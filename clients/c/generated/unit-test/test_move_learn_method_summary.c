#ifndef move_learn_method_summary_TEST
#define move_learn_method_summary_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define move_learn_method_summary_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/move_learn_method_summary.h"
move_learn_method_summary_t* instantiate_move_learn_method_summary(int include_optional);



move_learn_method_summary_t* instantiate_move_learn_method_summary(int include_optional) {
  move_learn_method_summary_t* move_learn_method_summary = NULL;
  if (include_optional) {
    move_learn_method_summary = move_learn_method_summary_create(
      "0",
      "0"
    );
  } else {
    move_learn_method_summary = move_learn_method_summary_create(
      "0",
      "0"
    );
  }

  return move_learn_method_summary;
}


#ifdef move_learn_method_summary_MAIN

void test_move_learn_method_summary(int include_optional) {
    move_learn_method_summary_t* move_learn_method_summary_1 = instantiate_move_learn_method_summary(include_optional);

	cJSON* jsonmove_learn_method_summary_1 = move_learn_method_summary_convertToJSON(move_learn_method_summary_1);
	printf("move_learn_method_summary :\n%s\n", cJSON_Print(jsonmove_learn_method_summary_1));
	move_learn_method_summary_t* move_learn_method_summary_2 = move_learn_method_summary_parseFromJSON(jsonmove_learn_method_summary_1);
	cJSON* jsonmove_learn_method_summary_2 = move_learn_method_summary_convertToJSON(move_learn_method_summary_2);
	printf("repeating move_learn_method_summary:\n%s\n", cJSON_Print(jsonmove_learn_method_summary_2));
}

int main() {
  test_move_learn_method_summary(1);
  test_move_learn_method_summary(0);

  printf("Hello world \n");
  return 0;
}

#endif // move_learn_method_summary_MAIN
#endif // move_learn_method_summary_TEST
