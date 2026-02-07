/*
 * CharacteristicDetail.h
 *
 * 
 */

#ifndef _CharacteristicDetail_H_
#define _CharacteristicDetail_H_


#include <string>
#include "CharacteristicDescription.h"
#include "StatSummary.h"
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

class CharacteristicDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	CharacteristicDetail();
	CharacteristicDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CharacteristicDetail();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getId();

	/*! \brief Set 
	 */
	void setId(int  id);
	/*! \brief Get 
	 */
	int getGeneModulo();

	/*! \brief Set 
	 */
	void setGeneModulo(int  gene_modulo);
	/*! \brief Get 
	 */
	std::list<int> getPossibleValues();

	/*! \brief Set 
	 */
	void setPossibleValues(std::list <int> possible_values);
	/*! \brief Get 
	 */
	StatSummary getHighestStat();

	/*! \brief Set 
	 */
	void setHighestStat(StatSummary  highest_stat);
	/*! \brief Get 
	 */
	std::list<CharacteristicDescription> getDescriptions();

	/*! \brief Set 
	 */
	void setDescriptions(std::list <CharacteristicDescription> descriptions);

private:
	int id;
	int gene_modulo;
	std::list <int>possible_values;
	StatSummary highest_stat;
	std::list <CharacteristicDescription>descriptions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CharacteristicDetail_H_ */
