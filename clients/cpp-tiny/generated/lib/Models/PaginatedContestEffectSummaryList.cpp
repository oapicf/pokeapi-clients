

#include "PaginatedContestEffectSummaryList.h"

using namespace Tiny;

PaginatedContestEffectSummaryList::PaginatedContestEffectSummaryList()
{
	count = int(0);
	next = std::string();
	previous = std::string();
	results = std::list<ContestEffectSummary>();
}

PaginatedContestEffectSummaryList::PaginatedContestEffectSummaryList(std::string jsonString)
{
	this->fromJson(jsonString);
}

PaginatedContestEffectSummaryList::~PaginatedContestEffectSummaryList()
{

}

void
PaginatedContestEffectSummaryList::fromJson(std::string jsonObj)
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


        std::list<ContestEffectSummary> results_list;
        ContestEffectSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            results_list.push_back(element);
        }
        results = results_list;


    }


}

bourne::json
PaginatedContestEffectSummaryList::toJson()
{
    bourne::json object = bourne::json::object();





    object["count"] = getCount();






    object["next"] = getNext();






    object["previous"] = getPrevious();





    std::list<ContestEffectSummary> results_list = getResults();
    bourne::json results_arr = bourne::json::array();

    for(auto& var : results_list)
    {
        ContestEffectSummary obj = var;
        results_arr.append(obj.toJson());
    }
    object["results"] = results_arr;




    return object;

}

int
PaginatedContestEffectSummaryList::getCount()
{
	return count;
}

void
PaginatedContestEffectSummaryList::setCount(int count)
{
	this->count = count;
}

std::string
PaginatedContestEffectSummaryList::getNext()
{
	return next;
}

void
PaginatedContestEffectSummaryList::setNext(std::string next)
{
	this->next = next;
}

std::string
PaginatedContestEffectSummaryList::getPrevious()
{
	return previous;
}

void
PaginatedContestEffectSummaryList::setPrevious(std::string previous)
{
	this->previous = previous;
}

std::list<ContestEffectSummary>
PaginatedContestEffectSummaryList::getResults()
{
	return results;
}

void
PaginatedContestEffectSummaryList::setResults(std::list<ContestEffectSummary> results)
{
	this->results = results;
}



