#ifndef location_game_index_TEST
#define location_game_index_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define location_game_index_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/location_game_index.h"
location_game_index_t* instantiate_location_game_index(int include_optional);

#include "test_generation_summary.c"


location_game_index_t* instantiate_location_game_index(int include_optional) {
  location_game_index_t* location_game_index = NULL;
  if (include_optional) {
    location_game_index = location_game_index_create(
      56,
       // false, not to have infinite recursion
      instantiate_generation_summary(0)
    );
  } else {
    location_game_index = location_game_index_create(
      56,
      NULL
    );
  }

  return location_game_index;
}


#ifdef location_game_index_MAIN

void test_location_game_index(int include_optional) {
    location_game_index_t* location_game_index_1 = instantiate_location_game_index(include_optional);

	cJSON* jsonlocation_game_index_1 = location_game_index_convertToJSON(location_game_index_1);
	printf("location_game_index :\n%s\n", cJSON_Print(jsonlocation_game_index_1));
	location_game_index_t* location_game_index_2 = location_game_index_parseFromJSON(jsonlocation_game_index_1);
	cJSON* jsonlocation_game_index_2 = location_game_index_convertToJSON(location_game_index_2);
	printf("repeating location_game_index:\n%s\n", cJSON_Print(jsonlocation_game_index_2));
}

int main() {
  test_location_game_index(1);
  test_location_game_index(0);

  printf("Hello world \n");
  return 0;
}

#endif // location_game_index_MAIN
#endif // location_game_index_TEST
