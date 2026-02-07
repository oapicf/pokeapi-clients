#ifndef language_name_TEST
#define language_name_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define language_name_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/language_name.h"
language_name_t* instantiate_language_name(int include_optional);

#include "test_language_summary.c"


language_name_t* instantiate_language_name(int include_optional) {
  language_name_t* language_name = NULL;
  if (include_optional) {
    language_name = language_name_create(
      "0",
       // false, not to have infinite recursion
      instantiate_language_summary(0)
    );
  } else {
    language_name = language_name_create(
      "0",
      NULL
    );
  }

  return language_name;
}


#ifdef language_name_MAIN

void test_language_name(int include_optional) {
    language_name_t* language_name_1 = instantiate_language_name(include_optional);

	cJSON* jsonlanguage_name_1 = language_name_convertToJSON(language_name_1);
	printf("language_name :\n%s\n", cJSON_Print(jsonlanguage_name_1));
	language_name_t* language_name_2 = language_name_parseFromJSON(jsonlanguage_name_1);
	cJSON* jsonlanguage_name_2 = language_name_convertToJSON(language_name_2);
	printf("repeating language_name:\n%s\n", cJSON_Print(jsonlanguage_name_2));
}

int main() {
  test_language_name(1);
  test_language_name(0);

  printf("Hello world \n");
  return 0;
}

#endif // language_name_MAIN
#endif // language_name_TEST
