#ifndef generation_summary_TEST
#define generation_summary_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define generation_summary_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/generation_summary.h"
generation_summary_t* instantiate_generation_summary(int include_optional);



generation_summary_t* instantiate_generation_summary(int include_optional) {
  generation_summary_t* generation_summary = NULL;
  if (include_optional) {
    generation_summary = generation_summary_create(
      "0",
      "0"
    );
  } else {
    generation_summary = generation_summary_create(
      "0",
      "0"
    );
  }

  return generation_summary;
}


#ifdef generation_summary_MAIN

void test_generation_summary(int include_optional) {
    generation_summary_t* generation_summary_1 = instantiate_generation_summary(include_optional);

	cJSON* jsongeneration_summary_1 = generation_summary_convertToJSON(generation_summary_1);
	printf("generation_summary :\n%s\n", cJSON_Print(jsongeneration_summary_1));
	generation_summary_t* generation_summary_2 = generation_summary_parseFromJSON(jsongeneration_summary_1);
	cJSON* jsongeneration_summary_2 = generation_summary_convertToJSON(generation_summary_2);
	printf("repeating generation_summary:\n%s\n", cJSON_Print(jsongeneration_summary_2));
}

int main() {
  test_generation_summary(1);
  test_generation_summary(0);

  printf("Hello world \n");
  return 0;
}

#endif // generation_summary_MAIN
#endif // generation_summary_TEST
