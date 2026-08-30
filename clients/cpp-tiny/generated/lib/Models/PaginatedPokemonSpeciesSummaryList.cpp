

#include "PaginatedPokemonSpeciesSummaryList.h"

using namespace Tiny;

PaginatedPokemonSpeciesSummaryList::PaginatedPokemonSpeciesSummaryList()
{
	count = int(0);
	next = std::string();
	previous = std::string();
	results = std::list<PokemonSpeciesSummary>();
}

PaginatedPokemonSpeciesSummaryList::PaginatedPokemonSpeciesSummaryList(std::string jsonString)
{
	this->fromJson(jsonString);
}

PaginatedPokemonSpeciesSummaryList::~PaginatedPokemonSpeciesSummaryList()
{

}

void
PaginatedPokemonSpeciesSummaryList::fromJson(std::string jsonObj)
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


        std::list<PokemonSpeciesSummary> results_list;
        PokemonSpeciesSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            results_list.push_back(element);
        }
        results = results_list;


    }


}

bourne::json
PaginatedPokemonSpeciesSummaryList::toJson()
{
    bourne::json object = bourne::json::object();





    object["count"] = getCount();






    object["next"] = getNext();






    object["previous"] = getPrevious();





    std::list<PokemonSpeciesSummary> results_list = getResults();
    bourne::json results_arr = bourne::json::array();

    for(auto& var : results_list)
    {
        PokemonSpeciesSummary obj = var;
        results_arr.append(obj.toJson());
    }
    object["results"] = results_arr;




    return object;

}

int
PaginatedPokemonSpeciesSummaryList::getCount()
{
	return count;
}

void
PaginatedPokemonSpeciesSummaryList::setCount(int count)
{
	this->count = count;
}

std::string
PaginatedPokemonSpeciesSummaryList::getNext()
{
	return next;
}

void
PaginatedPokemonSpeciesSummaryList::setNext(std::string next)
{
	this->next = next;
}

std::string
PaginatedPokemonSpeciesSummaryList::getPrevious()
{
	return previous;
}

void
PaginatedPokemonSpeciesSummaryList::setPrevious(std::string previous)
{
	this->previous = previous;
}

std::list<PokemonSpeciesSummary>
PaginatedPokemonSpeciesSummaryList::getResults()
{
	return results;
}

void
PaginatedPokemonSpeciesSummaryList::setResults(std::list<PokemonSpeciesSummary> results)
{
	this->results = results;
}



