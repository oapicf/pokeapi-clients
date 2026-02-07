
# EncounterConditionDetail


## Properties

Name | Type
------------ | -------------
`id` | number
`name` | string
`values` | [Array&lt;EncounterConditionValueSummary&gt;](EncounterConditionValueSummary.md)
`names` | [Array&lt;EncounterConditionName&gt;](EncounterConditionName.md)

## Example

```typescript
import type { EncounterConditionDetail } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "name": null,
  "values": null,
  "names": null,
} satisfies EncounterConditionDetail

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as EncounterConditionDetail
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


