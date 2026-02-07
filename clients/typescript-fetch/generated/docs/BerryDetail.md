
# BerryDetail


## Properties

Name | Type
------------ | -------------
`id` | number
`name` | string
`growthTime` | number
`maxHarvest` | number
`naturalGiftPower` | number
`size` | number
`smoothness` | number
`soilDryness` | number
`firmness` | [BerryFirmnessSummary](BerryFirmnessSummary.md)
`flavors` | [Array&lt;BerryDetailFlavorsInner&gt;](BerryDetailFlavorsInner.md)
`item` | [ItemSummary](ItemSummary.md)
`naturalGiftType` | [TypeSummary](TypeSummary.md)

## Example

```typescript
import type { BerryDetail } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "name": null,
  "growthTime": null,
  "maxHarvest": null,
  "naturalGiftPower": null,
  "size": null,
  "smoothness": null,
  "soilDryness": null,
  "firmness": null,
  "flavors": null,
  "item": null,
  "naturalGiftType": null,
} satisfies BerryDetail

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as BerryDetail
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


