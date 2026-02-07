#ifndef move_meta_category_summary_TEST
#define move_meta_category_summary_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define move_meta_category_summary_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/move_meta_category_summary.h"
move_meta_category_summary_t* instantiate_move_meta_category_summary(int include_optional);



move_meta_category_summary_t* instantiate_move_meta_category_summary(int include_optional) {
  move_meta_category_summary_t* move_meta_category_summary = NULL;
  if (include_optional) {
    move_meta_category_summary = move_meta_category_summary_create(
      "0",
      "0"
    );
  } else {
    move_meta_category_summary = move_meta_category_summary_create(
      "0",
      "0"
    );
  }

  return move_meta_category_summary;
}


#ifdef move_meta_category_summary_MAIN

void test_move_meta_category_summary(int include_optional) {
    move_meta_category_summary_t* move_meta_category_summary_1 = instantiate_move_meta_category_summary(include_optional);

	cJSON* jsonmove_meta_category_summary_1 = move_meta_category_summary_convertToJSON(move_meta_category_summary_1);
	printf("move_meta_category_summary :\n%s\n", cJSON_Print(jsonmove_meta_category_summary_1));
	move_meta_category_summary_t* move_meta_category_summary_2 = move_meta_category_summary_parseFromJSON(jsonmove_meta_category_summary_1);
	cJSON* jsonmove_meta_category_summary_2 = move_meta_category_summary_convertToJSON(move_meta_category_summary_2);
	printf("repeating move_meta_category_summary:\n%s\n", cJSON_Print(jsonmove_meta_category_summary_2));
}

int main() {
  test_move_meta_category_summary(1);
  test_move_meta_category_summary(0);

  printf("Hello world \n");
  return 0;
}

#endif // move_meta_category_summary_MAIN
#endif // move_meta_category_summary_TEST
