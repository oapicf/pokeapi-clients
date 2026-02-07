/*
 * BerryDetail.h
 *
 * 
 */

#ifndef _BerryDetail_H_
#define _BerryDetail_H_


#include <string>
#include "BerryDetail_flavors_inner.h"
#include "BerryFirmnessSummary.h"
#include "ItemSummary.h"
#include "TypeSummary.h"
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

class BerryDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	BerryDetail();
	BerryDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BerryDetail();

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
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	int getGrowthTime();

	/*! \brief Set 
	 */
	void setGrowthTime(int  growth_time);
	/*! \brief Get 
	 */
	int getMaxHarvest();

	/*! \brief Set 
	 */
	void setMaxHarvest(int  max_harvest);
	/*! \brief Get 
	 */
	int getNaturalGiftPower();

	/*! \brief Set 
	 */
	void setNaturalGiftPower(int  natural_gift_power);
	/*! \brief Get 
	 */
	int getSize();

	/*! \brief Set 
	 */
	void setSize(int  size);
	/*! \brief Get 
	 */
	int getSmoothness();

	/*! \brief Set 
	 */
	void setSmoothness(int  smoothness);
	/*! \brief Get 
	 */
	int getSoilDryness();

	/*! \brief Set 
	 */
	void setSoilDryness(int  soil_dryness);
	/*! \brief Get 
	 */
	BerryFirmnessSummary getFirmness();

	/*! \brief Set 
	 */
	void setFirmness(BerryFirmnessSummary  firmness);
	/*! \brief Get 
	 */
	std::list<BerryDetail_flavors_inner> getFlavors();

	/*! \brief Set 
	 */
	void setFlavors(std::list <BerryDetail_flavors_inner> flavors);
	/*! \brief Get 
	 */
	ItemSummary getItem();

	/*! \brief Set 
	 */
	void setItem(ItemSummary  item);
	/*! \brief Get 
	 */
	TypeSummary getNaturalGiftType();

	/*! \brief Set 
	 */
	void setNaturalGiftType(TypeSummary  natural_gift_type);

private:
	int id;
	std::string name;
	int growth_time;
	int max_harvest;
	int natural_gift_power;
	int size;
	int smoothness;
	int soil_dryness;
	BerryFirmnessSummary firmness;
	std::list <BerryDetail_flavors_inner>flavors;
	ItemSummary item;
	TypeSummary natural_gift_type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BerryDetail_H_ */
