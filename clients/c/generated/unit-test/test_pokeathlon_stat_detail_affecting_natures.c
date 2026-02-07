#ifndef pokeathlon_stat_detail_affecting_natures_TEST
#define pokeathlon_stat_detail_affecting_natures_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokeathlon_stat_detail_affecting_natures_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokeathlon_stat_detail_affecting_natures.h"
pokeathlon_stat_detail_affecting_natures_t* instantiate_pokeathlon_stat_detail_affecting_natures(int include_optional);



pokeathlon_stat_detail_affecting_natures_t* instantiate_pokeathlon_stat_detail_affecting_natures(int include_optional) {
  pokeathlon_stat_detail_affecting_natures_t* pokeathlon_stat_detail_affecting_natures = NULL;
  if (include_optional) {
    pokeathlon_stat_detail_affecting_natures = pokeathlon_stat_detail_affecting_natures_create(
      list_createList(),
      list_createList()
    );
  } else {
    pokeathlon_stat_detail_affecting_natures = pokeathlon_stat_detail_affecting_natures_create(
      list_createList(),
      list_createList()
    );
  }

  return pokeathlon_stat_detail_affecting_natures;
}


#ifdef pokeathlon_stat_detail_affecting_natures_MAIN

void test_pokeathlon_stat_detail_affecting_natures(int include_optional) {
    pokeathlon_stat_detail_affecting_natures_t* pokeathlon_stat_detail_affecting_natures_1 = instantiate_pokeathlon_stat_detail_affecting_natures(include_optional);

	cJSON* jsonpokeathlon_stat_detail_affecting_natures_1 = pokeathlon_stat_detail_affecting_natures_convertToJSON(pokeathlon_stat_detail_affecting_natures_1);
	printf("pokeathlon_stat_detail_affecting_natures :\n%s\n", cJSON_Print(jsonpokeathlon_stat_detail_affecting_natures_1));
	pokeathlon_stat_detail_affecting_natures_t* pokeathlon_stat_detail_affecting_natures_2 = pokeathlon_stat_detail_affecting_natures_parseFromJSON(jsonpokeathlon_stat_detail_affecting_natures_1);
	cJSON* jsonpokeathlon_stat_detail_affecting_natures_2 = pokeathlon_stat_detail_affecting_natures_convertToJSON(pokeathlon_stat_detail_affecting_natures_2);
	printf("repeating pokeathlon_stat_detail_affecting_natures:\n%s\n", cJSON_Print(jsonpokeathlon_stat_detail_affecting_natures_2));
}

int main() {
  test_pokeathlon_stat_detail_affecting_natures(1);
  test_pokeathlon_stat_detail_affecting_natures(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokeathlon_stat_detail_affecting_natures_MAIN
#endif // pokeathlon_stat_detail_affecting_natures_TEST
