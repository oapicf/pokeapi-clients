
# EncounterConditionValueDetail


## Properties

Name | Type
------------ | -------------
`id` | number
`name` | string
`condition` | [EncounterConditionSummary](EncounterConditionSummary.md)
`names` | [Array&lt;EncounterConditionValueName&gt;](EncounterConditionValueName.md)

## Example

```typescript
import type { EncounterConditionValueDetail } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "name": null,
  "condition": null,
  "names": null,
} satisfies EncounterConditionValueDetail

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as EncounterConditionValueDetail
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


