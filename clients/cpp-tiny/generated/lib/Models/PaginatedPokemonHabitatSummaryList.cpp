

#include "PaginatedPokemonHabitatSummaryList.h"

using namespace Tiny;

PaginatedPokemonHabitatSummaryList::PaginatedPokemonHabitatSummaryList()
{
	count = int(0);
	next = std::string();
	previous = std::string();
	results = std::list<PokemonHabitatSummary>();
}

PaginatedPokemonHabitatSummaryList::PaginatedPokemonHabitatSummaryList(std::string jsonString)
{
	this->fromJson(jsonString);
}

PaginatedPokemonHabitatSummaryList::~PaginatedPokemonHabitatSummaryList()
{

}

void
PaginatedPokemonHabitatSummaryList::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *countKey = "count";

    if(object.has_key(countKey))
    {
        bourne::json value = object[countKey];



        jsonToValue(&count, value, "int");


    }

    const char *nextKey = "next";

    if(object.has_key(nextKey))
    {
        bourne::json value = object[nextKey];



        jsonToValue(&next, value, "std::string");


    }

    const char *previousKey = "previous";

    if(object.has_key(previousKey))
    {
        bourne::json value = object[previousKey];



        jsonToValue(&previous, value, "std::string");


    }

    const char *resultsKey = "results";

    if(object.has_key(resultsKey))
    {
        bourne::json value = object[resultsKey];


        std::list<PokemonHabitatSummary> results_list;
        PokemonHabitatSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            results_list.push_back(element);
        }
        results = results_list;


    }


}

bourne::json
PaginatedPokemonHabitatSummaryList::toJson()
{
    bourne::json object = bourne::json::object();





    object["count"] = getCount();






    object["next"] = getNext();






    object["previous"] = getPrevious();





    std::list<PokemonHabitatSummary> results_list = getResults();
    bourne::json results_arr = bourne::json::array();

    for(auto& var : results_list)
    {
        PokemonHabitatSummary obj = var;
        results_arr.append(obj.toJson());
    }
    object["results"] = results_arr;




    return object;

}

int
PaginatedPokemonHabitatSummaryList::getCount()
{
	return count;
}

void
PaginatedPokemonHabitatSummaryList::setCount(int  count)
{
	this->count = count;
}

std::string
PaginatedPokemonHabitatSummaryList::getNext()
{
	return next;
}

void
PaginatedPokemonHabitatSummaryList::setNext(std::string  next)
{
	this->next = next;
}

std::string
PaginatedPokemonHabitatSummaryList::getPrevious()
{
	return previous;
}

void
PaginatedPokemonHabitatSummaryList::setPrevious(std::string  previous)
{
	this->previous = previous;
}

std::list<PokemonHabitatSummary>
PaginatedPokemonHabitatSummaryList::getResults()
{
	return results;
}

void
PaginatedPokemonHabitatSummaryList::setResults(std::list <PokemonHabitatSummary> results)
{
	this->results = results;
}



