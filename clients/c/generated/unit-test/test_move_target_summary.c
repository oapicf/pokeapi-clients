#ifndef move_target_summary_TEST
#define move_target_summary_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define move_target_summary_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/move_target_summary.h"
move_target_summary_t* instantiate_move_target_summary(int include_optional);



move_target_summary_t* instantiate_move_target_summary(int include_optional) {
  move_target_summary_t* move_target_summary = NULL;
  if (include_optional) {
    move_target_summary = move_target_summary_create(
      "0",
      "0"
    );
  } else {
    move_target_summary = move_target_summary_create(
      "0",
      "0"
    );
  }

  return move_target_summary;
}


#ifdef move_target_summary_MAIN

void test_move_target_summary(int include_optional) {
    move_target_summary_t* move_target_summary_1 = instantiate_move_target_summary(include_optional);

	cJSON* jsonmove_target_summary_1 = move_target_summary_convertToJSON(move_target_summary_1);
	printf("move_target_summary :\n%s\n", cJSON_Print(jsonmove_target_summary_1));
	move_target_summary_t* move_target_summary_2 = move_target_summary_parseFromJSON(jsonmove_target_summary_1);
	cJSON* jsonmove_target_summary_2 = move_target_summary_convertToJSON(move_target_summary_2);
	printf("repeating move_target_summary:\n%s\n", cJSON_Print(jsonmove_target_summary_2));
}

int main() {
  test_move_target_summary(1);
  test_move_target_summary(0);

  printf("Hello world \n");
  return 0;
}

#endif // move_target_summary_MAIN
#endif // move_target_summary_TEST
