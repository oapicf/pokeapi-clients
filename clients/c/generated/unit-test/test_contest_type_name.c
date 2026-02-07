#ifndef contest_type_name_TEST
#define contest_type_name_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define contest_type_name_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/contest_type_name.h"
contest_type_name_t* instantiate_contest_type_name(int include_optional);

#include "test_language_summary.c"


contest_type_name_t* instantiate_contest_type_name(int include_optional) {
  contest_type_name_t* contest_type_name = NULL;
  if (include_optional) {
    contest_type_name = contest_type_name_create(
      "0",
      "0",
       // false, not to have infinite recursion
      instantiate_language_summary(0)
    );
  } else {
    contest_type_name = contest_type_name_create(
      "0",
      "0",
      NULL
    );
  }

  return contest_type_name;
}


#ifdef contest_type_name_MAIN

void test_contest_type_name(int include_optional) {
    contest_type_name_t* contest_type_name_1 = instantiate_contest_type_name(include_optional);

	cJSON* jsoncontest_type_name_1 = contest_type_name_convertToJSON(contest_type_name_1);
	printf("contest_type_name :\n%s\n", cJSON_Print(jsoncontest_type_name_1));
	contest_type_name_t* contest_type_name_2 = contest_type_name_parseFromJSON(jsoncontest_type_name_1);
	cJSON* jsoncontest_type_name_2 = contest_type_name_convertToJSON(contest_type_name_2);
	printf("repeating contest_type_name:\n%s\n", cJSON_Print(jsoncontest_type_name_2));
}

int main() {
  test_contest_type_name(1);
  test_contest_type_name(0);

  printf("Hello world \n");
  return 0;
}

#endif // contest_type_name_MAIN
#endif // contest_type_name_TEST
