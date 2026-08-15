

#include "PaginatedGenerationSummaryList.h"

using namespace Tiny;

PaginatedGenerationSummaryList::PaginatedGenerationSummaryList()
{
	count = int(0);
	next = std::string();
	previous = std::string();
	results = std::list<GenerationSummary>();
}

PaginatedGenerationSummaryList::PaginatedGenerationSummaryList(std::string jsonString)
{
	this->fromJson(jsonString);
}

PaginatedGenerationSummaryList::~PaginatedGenerationSummaryList()
{

}

void
PaginatedGenerationSummaryList::fromJson(std::string jsonObj)
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


        std::list<GenerationSummary> results_list;
        GenerationSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            results_list.push_back(element);
        }
        results = results_list;


    }


}

bourne::json
PaginatedGenerationSummaryList::toJson()
{
    bourne::json object = bourne::json::object();





    object["count"] = getCount();






    object["next"] = getNext();






    object["previous"] = getPrevious();





    std::list<GenerationSummary> results_list = getResults();
    bourne::json results_arr = bourne::json::array();

    for(auto& var : results_list)
    {
        GenerationSummary obj = var;
        results_arr.append(obj.toJson());
    }
    object["results"] = results_arr;




    return object;

}

int
PaginatedGenerationSummaryList::getCount()
{
	return count;
}

void
PaginatedGenerationSummaryList::setCount(int  count)
{
	this->count = count;
}

std::string
PaginatedGenerationSummaryList::getNext()
{
	return next;
}

void
PaginatedGenerationSummaryList::setNext(std::string  next)
{
	this->next = next;
}

std::string
PaginatedGenerationSummaryList::getPrevious()
{
	return previous;
}

void
PaginatedGenerationSummaryList::setPrevious(std::string  previous)
{
	this->previous = previous;
}

std::list<GenerationSummary>
PaginatedGenerationSummaryList::getResults()
{
	return results;
}

void
PaginatedGenerationSummaryList::setResults(std::list <GenerationSummary> results)
{
	this->results = results;
}



