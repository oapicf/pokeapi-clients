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

	/*! \brief Get The identifier for this resource.
	 */
	int getId();

	/*! \brief Set The identifier for this resource.
	 */
	void setId(int  id);
	/*! \brief Get The remainder of the highest stat/IV divided by 5.
	 */
	int getGeneModulo();

	/*! \brief Set The remainder of the highest stat/IV divided by 5.
	 */
	void setGeneModulo(int  gene_modulo);
	/*! \brief Get The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5.
	 */
	std::list<int> getPossibleValues();

	/*! \brief Set The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5.
	 */
	void setPossibleValues(std::list <int> possible_values);
	/*! \brief Get The stat which results in this characteristic.
	 */
	StatSummary getHighestStat();

	/*! \brief Set The stat which results in this characteristic.
	 */
	void setHighestStat(StatSummary  highest_stat);
	/*! \brief Get The descriptions of this characteristic listed in different languages.
	 */
	std::list<CharacteristicDescription> getDescriptions();

	/*! \brief Set The descriptions of this characteristic listed in different languages.
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
