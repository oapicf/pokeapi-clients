#ifndef egg_group_name_TEST
#define egg_group_name_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define egg_group_name_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/egg_group_name.h"
egg_group_name_t* instantiate_egg_group_name(int include_optional);

#include "test_language_summary.c"


egg_group_name_t* instantiate_egg_group_name(int include_optional) {
  egg_group_name_t* egg_group_name = NULL;
  if (include_optional) {
    egg_group_name = egg_group_name_create(
      "0",
       // false, not to have infinite recursion
      instantiate_language_summary(0)
    );
  } else {
    egg_group_name = egg_group_name_create(
      "0",
      NULL
    );
  }

  return egg_group_name;
}


#ifdef egg_group_name_MAIN

void test_egg_group_name(int include_optional) {
    egg_group_name_t* egg_group_name_1 = instantiate_egg_group_name(include_optional);

	cJSON* jsonegg_group_name_1 = egg_group_name_convertToJSON(egg_group_name_1);
	printf("egg_group_name :\n%s\n", cJSON_Print(jsonegg_group_name_1));
	egg_group_name_t* egg_group_name_2 = egg_group_name_parseFromJSON(jsonegg_group_name_1);
	cJSON* jsonegg_group_name_2 = egg_group_name_convertToJSON(egg_group_name_2);
	printf("repeating egg_group_name:\n%s\n", cJSON_Print(jsonegg_group_name_2));
}

int main() {
  test_egg_group_name(1);
  test_egg_group_name(0);

  printf("Hello world \n");
  return 0;
}

#endif // egg_group_name_MAIN
#endif // egg_group_name_TEST
