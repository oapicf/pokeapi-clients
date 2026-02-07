#tag Class
Protected Class PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner

	#tag Property, Flags = &h0
		encounter_details() As OpenAPIClient.Models.PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner
	#tag EndProperty


	#tag Property, Flags = &h0
		max_chance As Double
	#tag EndProperty


	#tag Property, Flags = &h0
		version As OpenAPIClient.Models.PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion
	#tag EndProperty





	#tag ViewBehavior
		#tag ViewProperty
			Name="Index"
			Visible=true
			Group="ID"
			InitialValue="-2147483648"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Super"
			Visible=true
			Group="ID"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Left"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Top"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="encounter_details"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="max_chance"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="version"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


