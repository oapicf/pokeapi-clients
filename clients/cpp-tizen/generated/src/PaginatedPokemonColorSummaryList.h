/*
 * PaginatedPokemonColorSummaryList.h
 *
 * 
 */

#ifndef _PaginatedPokemonColorSummaryList_H_
#define _PaginatedPokemonColorSummaryList_H_


#include <string>
#include "PokemonColorSummary.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PaginatedPokemonColorSummaryList : public Object {
public:
	/*! \brief Constructor.
	 */
	PaginatedPokemonColorSummaryList();
	PaginatedPokemonColorSummaryList(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PaginatedPokemonColorSummaryList();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getCount();

	/*! \brief Set 
	 */
	void setCount(int  count);
	/*! \brief Get 
	 */
	std::string getNext();

	/*! \brief Set 
	 */
	void setNext(std::string  next);
	/*! \brief Get 
	 */
	std::string getPrevious();

	/*! \brief Set 
	 */
	void setPrevious(std::string  previous);
	/*! \brief Get 
	 */
	std::list<PokemonColorSummary> getResults();

	/*! \brief Set 
	 */
	void setResults(std::list <PokemonColorSummary> results);

private:
	int count;
	std::string next;
	std::string previous;
	std::list <PokemonColorSummary>results;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PaginatedPokemonColorSummaryList_H_ */
