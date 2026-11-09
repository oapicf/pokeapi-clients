/*
 * ContestEffectDetail.h
 *
 * 
 */

#ifndef _ContestEffectDetail_H_
#define _ContestEffectDetail_H_


#include <string>
#include "ContestEffectEffectText.h"
#include "ContestEffectFlavorText.h"
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

class ContestEffectDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	ContestEffectDetail();
	ContestEffectDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ContestEffectDetail();

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
	/*! \brief Get The base number of hearts the user of this move gets.
	 */
	int getAppeal();

	/*! \brief Set The base number of hearts the user of this move gets.
	 */
	void setAppeal(int  appeal);
	/*! \brief Get The base number of hearts the user's opponent loses.
	 */
	int getJam();

	/*! \brief Set The base number of hearts the user's opponent loses.
	 */
	void setJam(int  jam);
	/*! \brief Get The result of this contest effect listed in different languages.
	 */
	std::list<ContestEffectEffectText> getEffectEntries();

	/*! \brief Set The result of this contest effect listed in different languages.
	 */
	void setEffectEntries(std::list <ContestEffectEffectText> effect_entries);
	/*! \brief Get The flavor text of this contest effect listed in different languages.
	 */
	std::list<ContestEffectFlavorText> getFlavorTextEntries();

	/*! \brief Set The flavor text of this contest effect listed in different languages.
	 */
	void setFlavorTextEntries(std::list <ContestEffectFlavorText> flavor_text_entries);

private:
	int id;
	int appeal;
	int jam;
	std::list <ContestEffectEffectText>effect_entries;
	std::list <ContestEffectFlavorText>flavor_text_entries;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ContestEffectDetail_H_ */
