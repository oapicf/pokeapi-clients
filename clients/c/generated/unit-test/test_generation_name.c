#ifndef generation_name_TEST
#define generation_name_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define generation_name_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/generation_name.h"
generation_name_t* instantiate_generation_name(int include_optional);

#include "test_language_summary.c"


generation_name_t* instantiate_generation_name(int include_optional) {
  generation_name_t* generation_name = NULL;
  if (include_optional) {
    generation_name = generation_name_create(
      "0",
       // false, not to have infinite recursion
      instantiate_language_summary(0)
    );
  } else {
    generation_name = generation_name_create(
      "0",
      NULL
    );
  }

  return generation_name;
}


#ifdef generation_name_MAIN

void test_generation_name(int include_optional) {
    generation_name_t* generation_name_1 = instantiate_generation_name(include_optional);

	cJSON* jsongeneration_name_1 = generation_name_convertToJSON(generation_name_1);
	printf("generation_name :\n%s\n", cJSON_Print(jsongeneration_name_1));
	generation_name_t* generation_name_2 = generation_name_parseFromJSON(jsongeneration_name_1);
	cJSON* jsongeneration_name_2 = generation_name_convertToJSON(generation_name_2);
	printf("repeating generation_name:\n%s\n", cJSON_Print(jsongeneration_name_2));
}

int main() {
  test_generation_name(1);
  test_generation_name(0);

  printf("Hello world \n");
  return 0;
}

#endif // generation_name_MAIN
#endif // generation_name_TEST
