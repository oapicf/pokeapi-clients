

#include "ItemGameIndex.h"

using namespace Tiny;

ItemGameIndex::ItemGameIndex()
{
	game_index = int(0);
	generation = GenerationSummary();
}

ItemGameIndex::ItemGameIndex(std::string jsonString)
{
	this->fromJson(jsonString);
}

ItemGameIndex::~ItemGameIndex()
{

}

void
ItemGameIndex::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *game_indexKey = "game_index";

    if(object.has_key(game_indexKey))
    {
        bourne::json value = object[game_indexKey];



        jsonToValue(&game_index, value, "int");


    }

    const char *generationKey = "generation";

    if(object.has_key(generationKey))
    {
        bourne::json value = object[generationKey];




        GenerationSummary* obj = &generation;
		obj->fromJson(value.dump());

    }


}

bourne::json
ItemGameIndex::toJson()
{
    bourne::json object = bourne::json::object();





    object["game_index"] = getGameIndex();







	object["generation"] = getGeneration().toJson();


    return object;

}

int
ItemGameIndex::getGameIndex()
{
	return game_index;
}

void
ItemGameIndex::setGameIndex(int game_index)
{
	this->game_index = game_index;
}

GenerationSummary
ItemGameIndex::getGeneration()
{
	return generation;
}

void
ItemGameIndex::setGeneration(GenerationSummary generation)
{
	this->generation = generation;
}



