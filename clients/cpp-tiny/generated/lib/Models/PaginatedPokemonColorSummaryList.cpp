

#include "PaginatedPokemonColorSummaryList.h"

using namespace Tiny;

PaginatedPokemonColorSummaryList::PaginatedPokemonColorSummaryList()
{
	count = int(0);
	next = std::string();
	previous = std::string();
	results = std::list<PokemonColorSummary>();
}

PaginatedPokemonColorSummaryList::PaginatedPokemonColorSummaryList(std::string jsonString)
{
	this->fromJson(jsonString);
}

PaginatedPokemonColorSummaryList::~PaginatedPokemonColorSummaryList()
{

}

void
PaginatedPokemonColorSummaryList::fromJson(std::string jsonObj)
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


        std::list<PokemonColorSummary> results_list;
        PokemonColorSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            results_list.push_back(element);
        }
        results = results_list;


    }


}

bourne::json
PaginatedPokemonColorSummaryList::toJson()
{
    bourne::json object = bourne::json::object();





    object["count"] = getCount();






    object["next"] = getNext();






    object["previous"] = getPrevious();





    std::list<PokemonColorSummary> results_list = getResults();
    bourne::json results_arr = bourne::json::array();

    for(auto& var : results_list)
    {
        PokemonColorSummary obj = var;
        results_arr.append(obj.toJson());
    }
    object["results"] = results_arr;




    return object;

}

int
PaginatedPokemonColorSummaryList::getCount()
{
	return count;
}

void
PaginatedPokemonColorSummaryList::setCount(int count)
{
	this->count = count;
}

std::string
PaginatedPokemonColorSummaryList::getNext()
{
	return next;
}

void
PaginatedPokemonColorSummaryList::setNext(std::string next)
{
	this->next = next;
}

std::string
PaginatedPokemonColorSummaryList::getPrevious()
{
	return previous;
}

void
PaginatedPokemonColorSummaryList::setPrevious(std::string previous)
{
	this->previous = previous;
}

std::list<PokemonColorSummary>
PaginatedPokemonColorSummaryList::getResults()
{
	return results;
}

void
PaginatedPokemonColorSummaryList::setResults(std::list<PokemonColorSummary> results)
{
	this->results = results;
}



