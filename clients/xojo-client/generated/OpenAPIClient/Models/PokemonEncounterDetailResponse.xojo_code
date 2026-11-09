#tag Class
Protected Class PokemonEncounterDetailResponse

	#tag Property, Flags = &h0
		#tag Note
			Percent chance that this encounter will occur.
		#tag EndNote
		chance As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of condition values that must be in effect for this encounter to occur.
		#tag EndNote
		condition_values() As OpenAPIClient.Models.EncounterConditionValueSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The highest level the Pokémon could be encountered at.
		#tag EndNote
		max_level As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The method by which this encounter happens.
		#tag EndNote
		method As OpenAPIClient.Models.EncounterMethodSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The lowest level the Pokémon could be encountered at.
		#tag EndNote
		min_level As Integer
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
			Name="chance"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="condition_values"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="EncounterConditionValueSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="max_level"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="method"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="EncounterMethodSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="min_level"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


