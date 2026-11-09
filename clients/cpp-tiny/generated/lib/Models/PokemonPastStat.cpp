

#include "PokemonPastStat.h"

using namespace Tiny;

PokemonPastStat::PokemonPastStat()
{
	generation = null;
	stats = std::list<PokemonStat>();
}

PokemonPastStat::PokemonPastStat(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonPastStat::~PokemonPastStat()
{

}

void
PokemonPastStat::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *generationKey = "generation";

    if(object.has_key(generationKey))
    {
        bourne::json value = object[generationKey];




        GenerationSummary* obj = &generation;
		obj->fromJson(value.dump());

    }

    const char *statsKey = "stats";

    if(object.has_key(statsKey))
    {
        bourne::json value = object[statsKey];


        std::list<PokemonStat> stats_list;
        PokemonStat element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            stats_list.push_back(element);
        }
        stats = stats_list;


    }


}

bourne::json
PokemonPastStat::toJson()
{
    bourne::json object = bourne::json::object();






	object["generation"] = getGeneration().toJson();




    std::list<PokemonStat> stats_list = getStats();
    bourne::json stats_arr = bourne::json::array();

    for(auto& var : stats_list)
    {
        PokemonStat obj = var;
        stats_arr.append(obj.toJson());
    }
    object["stats"] = stats_arr;




    return object;

}

GenerationSummary
PokemonPastStat::getGeneration()
{
	return generation;
}

void
PokemonPastStat::setGeneration(GenerationSummary generation)
{
	this->generation = generation;
}

std::list<PokemonStat>
PokemonPastStat::getStats()
{
	return stats;
}

void
PokemonPastStat::setStats(std::list<PokemonStat> stats)
{
	this->stats = stats;
}



