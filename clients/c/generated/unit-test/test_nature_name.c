#ifndef nature_name_TEST
#define nature_name_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define nature_name_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/nature_name.h"
nature_name_t* instantiate_nature_name(int include_optional);

#include "test_language_summary.c"


nature_name_t* instantiate_nature_name(int include_optional) {
  nature_name_t* nature_name = NULL;
  if (include_optional) {
    nature_name = nature_name_create(
      "0",
       // false, not to have infinite recursion
      instantiate_language_summary(0)
    );
  } else {
    nature_name = nature_name_create(
      "0",
      NULL
    );
  }

  return nature_name;
}


#ifdef nature_name_MAIN

void test_nature_name(int include_optional) {
    nature_name_t* nature_name_1 = instantiate_nature_name(include_optional);

	cJSON* jsonnature_name_1 = nature_name_convertToJSON(nature_name_1);
	printf("nature_name :\n%s\n", cJSON_Print(jsonnature_name_1));
	nature_name_t* nature_name_2 = nature_name_parseFromJSON(jsonnature_name_1);
	cJSON* jsonnature_name_2 = nature_name_convertToJSON(nature_name_2);
	printf("repeating nature_name:\n%s\n", cJSON_Print(jsonnature_name_2));
}

int main() {
  test_nature_name(1);
  test_nature_name(0);

  printf("Hello world \n");
  return 0;
}

#endif // nature_name_MAIN
#endif // nature_name_TEST
