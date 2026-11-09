#ifndef pokeapi_meta_response_TEST
#define pokeapi_meta_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokeapi_meta_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokeapi_meta_response.h"
pokeapi_meta_response_t* instantiate_pokeapi_meta_response(int include_optional);



pokeapi_meta_response_t* instantiate_pokeapi_meta_response(int include_optional) {
  pokeapi_meta_response_t* pokeapi_meta_response = NULL;
  if (include_optional) {
    pokeapi_meta_response = pokeapi_meta_response_create(
      "0",
      "0",
      "0"
    );
  } else {
    pokeapi_meta_response = pokeapi_meta_response_create(
      "0",
      "0",
      "0"
    );
  }

  return pokeapi_meta_response;
}


#ifdef pokeapi_meta_response_MAIN

void test_pokeapi_meta_response(int include_optional) {
    pokeapi_meta_response_t* pokeapi_meta_response_1 = instantiate_pokeapi_meta_response(include_optional);

	cJSON* jsonpokeapi_meta_response_1 = pokeapi_meta_response_convertToJSON(pokeapi_meta_response_1);
	printf("pokeapi_meta_response :\n%s\n", cJSON_Print(jsonpokeapi_meta_response_1));
	pokeapi_meta_response_t* pokeapi_meta_response_2 = pokeapi_meta_response_parseFromJSON(jsonpokeapi_meta_response_1);
	cJSON* jsonpokeapi_meta_response_2 = pokeapi_meta_response_convertToJSON(pokeapi_meta_response_2);
	printf("repeating pokeapi_meta_response:\n%s\n", cJSON_Print(jsonpokeapi_meta_response_2));
}

int main() {
  test_pokeapi_meta_response(1);
  test_pokeapi_meta_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokeapi_meta_response_MAIN
#endif // pokeapi_meta_response_TEST
